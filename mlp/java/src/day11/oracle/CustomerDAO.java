package day11.oracle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


public class CustomerDAO implements DAO {
	
	HashMap<String, CustomerVO> map;
	
	public CustomerDAO(){
		map = new HashMap<String, CustomerVO>();
	}

	@Override
	public void insert(CustomerVO c) throws DuplicatedIDException {
		String id = c.getId();
		if(map.containsKey(id)) {
			throw new DuplicatedIDException("ID 중복 !");
		}
		map.put(id, c);
	}

	@Override
	public void delete(String id) throws NotFoundException {
		if(!map.containsKey(id)) {
			throw new NotFoundException("아이디가 존재하지않음");
		}
		map.remove(id);
	}

	@Override
	public void update(CustomerVO c) throws NotFoundException {
		if(!map.containsKey(c.getId())) {
			throw new NotFoundException("아이디가 존재하지않음");
		}
		map.put(c.getId(), c);
	}

	@Override
	public CustomerVO select(String id) throws NotFoundException {
		CustomerVO c = null;
		if(!map.containsKey(id)) {
			throw new NotFoundException("아이디가 존재하지않음");
		}
		c = map.get(id);
		return c;
	}

	@Override
	public ArrayList<CustomerVO> select() throws NotFoundException {
		ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
		
		if(map.size() == 0) {
			throw new NotFoundException("데이터가 존재하지않음");
		}
		
		Collection<CustomerVO> col = map.values();
		Iterator<CustomerVO> it = col.iterator();
		
		while(it.hasNext()) {
			CustomerVO cust = it.next();
			list.add(cust);
		}		
		return list;
	}

}
