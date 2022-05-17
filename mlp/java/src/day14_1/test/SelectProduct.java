package day14_1.test;

import day14_1.dao.ProductDao;
import day14_1.frame.Dao;
import day14_1.vo.ProductVo;

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



