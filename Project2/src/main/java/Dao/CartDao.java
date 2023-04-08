package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.DBConnection;
import Model.Cart;

public class CartDao {
	public static void insertInotCart(Cart c) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql="insert into cart(cusid,pid,pname,pcategory,pprice,qty,total,payment_status) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getCusid());
			pst.setInt(2, c.getPid());
			pst.setString(3, c.getPname());
			pst.setString(4, c.getPcategory());
			pst.setInt(5, c.getPprice());
			pst.setInt(6, c.getQty());
			pst.setInt(7, c.getTotal());
			pst.setString(8, c.getPayment_status());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Cart> getCartByCusId(int id){
		List<Cart> list = new ArrayList<Cart>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql="select * from cart where cusid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Cart c =new Cart();
				c.setCid(rs.getInt("cid"));
				c.setCusid(rs.getInt("cusid"));
				c.setPid(rs.getInt("pid"));
				c.setPname(rs.getString("pname"));
				c.setPcategory(rs.getString("pcategory"));
				c.setPprice(rs.getInt("pprice"));
				c.setQty(rs.getInt("qty"));
				c.setTotal(rs.getInt("total"));
				c.setPayment_status(rs.getString("payment_status"));
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void updateCart(Cart c) {
		try {
			Connection con = DBConnection.createConnection();
			String sql="update cart set qty=?,total=? where cid=?";
			PreparedStatement pst =con.prepareStatement(sql);
			pst.setInt(1, c.getQty());
			pst.setInt(2, c.getTotal());
			pst.setInt(3, c.getCid());
			pst.executeUpdate();
			System.out.println("cart updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
