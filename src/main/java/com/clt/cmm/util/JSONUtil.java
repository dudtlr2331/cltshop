package com.clt.cmm.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.clt.shp.order.OrderVO;
import com.clt.shp.order.dao.OrderDao;
import com.clt.shp.order.dao.impl.OrderDaoOracle;
import com.clt.shp.order.service.OrderService;

public class JSONUtil {
	
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		OrderService orderService = new OrderService(new OrderDaoOracle());
		OrderVO pvo = new OrderVO();
		pvo.setUsrId("chunkind");
		List<OrderVO> basketList = orderService.selectBasketList(pvo);
		map.put("basketList", basketList);
		map.put("result", "success");
		
		JSONUtil.parseToJsonString(map);
		
	}

	public static String parseToJsonString(Map<?,?> map) {
		String result = "{";
		Set<String> keys = (Set<String>) map.keySet();
		Iterator<String> k = keys.iterator();
		int size = keys.size();
		int cnt = 0;
		while(k.hasNext()) {
			cnt++;
			String strKey = k.next();
			Object obj = map.get(strKey);
			result += "'"+strKey+"':";
			if(obj instanceof String) {
				result += "'"+obj.toString()+"'";
			}
			else if(obj instanceof ArrayList) {
				result += getArrayString((ArrayList)obj);
			}
			if(size > cnt) {
				result += ",";
			}
		}
		result += "}";
		System.out.println(result);
		return result;
	}

	private static String getArrayString(ArrayList list) {
		String result ="";
		
		
		
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
//			obj
		}
		return result;
	}
}
