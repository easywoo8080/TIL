package day14.test;

import java.util.List;

import day14.dao.CustDao;
import day14.frame.Dao;
import day14.vo.CustVo;

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




