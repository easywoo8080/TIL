package day14.test;

import day14.dao.CustDao;
import day14.frame.Dao;
import day14.vo.CustVo;

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




