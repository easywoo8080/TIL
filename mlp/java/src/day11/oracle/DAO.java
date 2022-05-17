package day11.oracle;

import java.util.ArrayList;

public interface DAO {	
	public default void connect() {
		System.out.println("Connect .....");
	}
	public default void close() {
		System.out.println(" close .....");
	}
	// CRUD
	public void insert(CustomerVO c) throws DuplicatedIDException; 
	public void delete(String id) throws NotFoundException;    
	public void update(CustomerVO c) throws NotFoundException;    
	public CustomerVO select(String id) throws NotFoundException;    
	public ArrayList<CustomerVO> select() throws NotFoundException;    
}





