package day14.test;

import day14.dao.ProductDao;
import day14.frame.Dao;
import day14.vo.ProductVo;

public class SelectProduct {

	public static void main(String[] args) {
		Dao<Integer, ProductVo> dao = new ProductDao();
		
		ProductVo p = null;
		try {
			p = dao.select(1);
			System.out.println(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}



