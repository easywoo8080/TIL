package day14_1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import day14_1.frame.Dao;
import day14_1.frame.Sql;
import day14_1.vo.ProductVo;

public class ProductDao extends Dao<Integer, ProductVo> {

	@Override
	public void insert(ProductVo v) throws Exception {
		// Connection 
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.insertProduct);
			ps.setString(1, v.getName());
			ps.setInt(2, v.getPrice());
			ps.setDouble(3, v.getRate());
			ps.executeUpdate();
		}catch(Exception e) {
			throw e;
		}finally {
			close(ps);
			close(con);
		}		
	}

	@Override
	public void update(ProductVo v) throws Exception {
		// Connection 
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.updateProduct);
			ps.setString(1, v.getName());
			ps.setInt(2, v.getPrice());
			ps.setDouble(3, v.getRate());
			ps.setInt(4,v.getId());
			
			ps.executeUpdate();
		}catch(Exception e) {
			throw e;
		}finally {
			close(ps);
			close(con);
		}			
	}

	@Override
	public void delete(Integer k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductVo select(Integer k) throws Exception {
		ProductVo p = null;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectProduct);
			ps.setInt(1, k);
			rs = ps.executeQuery();
			rs.next();
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int price = rs.getInt("price");
			Date regdate = rs.getDate("regdate");
			double rate = rs.getDouble("rate");
			p = new ProductVo(id, name, price, regdate, rate);
			
		}catch(Exception e) {
			throw e;
		}finally {
			close(rs);
			close(ps);
			close(con);
		}		
		
		return p;
	}

	@Override
	public List<ProductVo> select() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
