package day14.test;

import day14.dao.CustDao;
import day14.frame.Dao;
import day14.vo.CustVo;

public class InsertCust {

	public static void main(String[] args) {
		Dao<String,CustVo> dao = new CustDao();
		
		CustVo cust = new CustVo("id77", "pwd77", "ÀÌ¸»¼÷");
		try {
			dao.insert(cust);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
