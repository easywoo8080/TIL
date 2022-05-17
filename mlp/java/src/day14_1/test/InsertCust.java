package day14_1.test;

import day14_1.dao.CustDao;
import day14_1.frame.Dao;
import day14_1.vo.CustVo;

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
