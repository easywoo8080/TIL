package day14_1.test;

import day14_1.dao.ProductDao;
import day14_1.frame.Dao;
import day14_1.vo.ProductVo;

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
