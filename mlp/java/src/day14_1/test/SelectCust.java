package day14_1.test;

import day14_1.dao.CustDao;
import day14_1.frame.Dao;
import day14_1.vo.CustVo;

public class SelectCust {

	public static void main(String[] args) {
		Dao<String,CustVo> dao = new CustDao();
		CustVo cust = null;
		try {
			cust = dao.select("id45");
			System.out.println(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}




