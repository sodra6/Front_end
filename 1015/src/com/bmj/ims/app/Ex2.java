package com.bmj.ims.app;

import java.util.List;

import com.bmj.ims.dao.IdolsDAO;
import com.bmj.ims.vo.Idol;

public class Ex2 {

	public static void main(String[] args) {
		
		//아이돌 전부 출력
		
		List<Idol> idols = IdolsDAO.selectList();
		
		for (Idol idol : idols) {
			System.out.println(idol);
		}
	}
	
}
