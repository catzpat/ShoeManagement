/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import java.sql.*;

/**
 *
 * @author nycop
 */
public class shoeDao {
    public ResultSet LoadData(){
        try {
            Connection conn= DBConnection.connect();
            String query = "select * from Giay";
            PreparedStatement stmt=conn.prepareStatement(query);
            return stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean AddShoe(int id, String name, int Sl, String status){
        try {
            Connection conn= DBConnection.connect();
            String query = "insert into Giay (id, ten, so_luong, trang_thai_nhap) values (?,?,?,?)";
            PreparedStatement stmt=conn.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, Sl);
            stmt.setString(4, status);
            return stmt.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
     public boolean UpdateShoe(int id, String name, int Sl, String status){
        try {
            Connection conn= DBConnection.connect();
            String query = "update Giay set ten = ?, so_luong= ?, trang_thai_nhap = ? where id=?";
            PreparedStatement stmt=conn.prepareStatement(query);
            stmt.setInt(4, id);
            stmt.setString(1, name);
            stmt.setInt(2, Sl);
            stmt.setString(3, status);
            return stmt.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
     
      public boolean DeleteShoe(int id){
          try {
            Connection conn= DBConnection.connect();
            String query = "delete from Giay where id=?";
            PreparedStatement stmt=conn.prepareStatement(query);
            stmt.setInt(1, id);
             return stmt.executeUpdate()>0;
          } catch (SQLException e) {
             e.printStackTrace();
            return false;
          }
      }
      
      public ResultSet Find(String name){
          try {
            Connection conn= DBConnection.connect();
            String query = "select * from Giay where ten like ?";
            PreparedStatement stmt=conn.prepareStatement(query);
            stmt.setString(1, "%"+name+ "%");
            return stmt.executeQuery();
          } catch (SQLException e) {
              e.printStackTrace();
              return null;
          }
      } 
}
