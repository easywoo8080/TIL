package day14_1.test;

import java.util.List;

import day14_1.dao.CustDao;
import day14_1.frame.Dao;
import day14_1.vo.CustVo;

public class SelectAllCust {

	public static void main(String[] args) {
		Dao<String,CustVo> dao = new CustDao();
		List<CustVo> list = null;
		try {
			list = dao.select();
			for (CustVo custVo : list) {
				System.out.println(custVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}




