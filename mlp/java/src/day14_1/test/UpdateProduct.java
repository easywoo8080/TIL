package day14_1.test;

import day14_1.dao.ProductDao;
import day14_1.frame.Dao;
import day14_1.vo.ProductVo;

public class UpdateProduct {

	public static void main(String[] args) {
		Dao<Integer,ProductVo> dao = new ProductDao();
		ProductVo p = new ProductVo(1, "pants10", 50000, 5.5);
		try {
			dao.update(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
