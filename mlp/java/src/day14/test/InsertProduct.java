package day14.test;

import day14.dao.ProductDao;
import day14.frame.Dao;
import day14.vo.ProductVo;

public class InsertProduct {

	public static void main(String[] args) {
		Dao<Integer,ProductVo> dao = new ProductDao();
		ProductVo p = new ProductVo("shirts", 20000, 3.5);
		try {
			dao.insert(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
