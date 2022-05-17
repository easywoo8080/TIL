package day11.oracle;

import java.util.ArrayList;

public class SelectAllTestApp { 

	public static void main(String[] args) {
		DAO dao = new CustomerDAO();
		ArrayList<CustomerVO> list = null;
		
		try {
			list = dao.select();
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
