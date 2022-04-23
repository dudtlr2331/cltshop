package com.clt.cmm.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.clt.cmm.controller.Controller;

public class DispatcherServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doProcess(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doProcess(req, res);
	}
	
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//커맨드 얻기
		String command = req.getParameter("command");
		
		//컨트롤러 팩토리에서 얻어오기
		Controller controller = HandlerMapping.getInstance().createController(command);
		
		//필요 변수 선언
		String path = "error.jsp";
		ModelAndView mv=  null;
		boolean isRedirect = false;
		
		try{
			//첨부파일 있으면 첨부파일 업로드
			fileUpload(req, res);
			
			//각 컨트롤러 로직 수행
			mv = controller.execute(req, res);
			
			//리턴페이지 설정
			path = mv.getPath();
			
			//리다이랙트 여부 설정
			isRedirect = mv.isRedirect();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//페이지 포워드 or 리다이랙트 하여 페이지 리턴.
		if(isRedirect){
			res.sendRedirect(path);
		}else{
			req.getRequestDispatcher(path).forward(req, res);
		}
	}

	//파일 업로드 로직
	private void fileUpload(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String contentType = req.getContentType();
		if (contentType != null && contentType.toLowerCase().startsWith("multipart/")) {
			String saveDir = req.getServletContext().getInitParameter("uploadPath");
			String tomcatPath = req.getServletContext().getInitParameter("tomcatPath");
			Collection<Part> parts = req.getParts();
			for (Part part : parts) {
				System.out.printf("파라미터 명 : %s, contentType :  %s,  size : %d bytes \n", part.getName(), part.getContentType(), part.getSize());
				
				if (part.getHeader("Content-Disposition").contains("filename=")) {
					String fileName = getFileName(part);
					if (part.getSize() > 0) {
						System.out.printf("업로드 파일 명 : %s  \n", fileName);
						part.write(saveDir + File.separator + fileName);
						part.delete();
						
						// 1. 원본 File, 복사할 File 준비
						File file = new File(saveDir + File.separator + fileName);
						File newFile = new File(tomcatPath + File.separator + fileName);
						// 2. FileInputStream, FileOutputStream 준비
						FileInputStream input = new FileInputStream(file);
						FileOutputStream output = new FileOutputStream(newFile);
						// 3. 한번에 read하고, write할 사이즈 지정
						byte[] buf = new byte[1024];
						// 4. buf 사이즈만큼 input에서 데이터를 읽어서, output에 쓴다.
						int readData;
						while ((readData = input.read(buf)) > 0) {
							output.write(buf, 0, readData);
						}
						output.close();
						input.close();
						
						req.setAttribute("imgPath", "/images/");
						req.setAttribute("imgNm", fileName);
					}
				} else {
					String formValue = req.getParameter(part.getName());
					System.out.printf("name : %s, value : %s  \n", part.getName(), formValue);
				}
			}
		}
	}
	
	//파일 업로드 로직(백업)
	private void fileUpload_back(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String contentType = req.getContentType();
		if (contentType != null && contentType.toLowerCase().startsWith("multipart/")) {
			String saveDir = req.getServletContext().getInitParameter("uploadPath");
			if (req.getPart("file").getSize() != 0) {
				Part filePart = req.getPart("file");
				String originFileName = getFileName(filePart);
				
				File file = new File(saveDir + originFileName);
				InputStream is = filePart.getInputStream();
				FileOutputStream fos = null;
				
				fos = new FileOutputStream(file);
				
				int temp = -1;
				while ((temp = is.read()) != -1) {
					fos.write(temp);
				}
				
				is.close();
				fos.close();
			}
		}
	}
	
	//파일 이름 얻어오기
	public String getFileName(Part filePart) {
		for (String filePartData : filePart.getHeader("Content-Disposition").split(";")) {
			System.out.println(filePartData);
			if (filePartData.trim().startsWith("filename")) {
				return filePartData.substring(filePartData.indexOf("=") + 1).trim().replace("\"", "");
			}
		}
		return null;
	}
}
