package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.DBConnection;
import Model.WishList;

public class WishListDao {
	public static void insertWishList(WishList w) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into wishlist(cusid,pid) values(?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, w.getCusid());
			pst.setInt(2, w.getPid());
			pst.executeUpdate();
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<WishList> getWishLIstByCusId(int cusid){
		List<WishList> list = new ArrayList<WishList>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from wishlist where cusid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, cusid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				WishList w = new WishList();
				w.setWid(rs.getInt("wid"));
				w.setCusid(rs.getInt("cusid"));
				w.setPid(rs.getInt("pid"));
				list.add(w);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static boolean checkProductInWishList(int pid) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from wishlist where pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public static void removeFromWishList(int id) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "delete from wishlist where wid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("product removed from wishlist");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
