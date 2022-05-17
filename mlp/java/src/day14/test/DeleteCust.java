package day14.test;

import day14.dao.CustDao;
import day14.frame.Dao;
import day14.vo.CustVo;

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
