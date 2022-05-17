package day14_1.test;

import day14_1.dao.CustDao;
import day14_1.frame.Dao;
import day14_1.vo.CustVo;

public class DeleteCust {

	public static void main(String[] args) {
		Dao<String,CustVo> dao = new CustDao();
		
		try {
			dao.delete("id65");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
