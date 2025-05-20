/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nycop
 */
public class Giay {
    public int id;
    public String ten;
    public int so_luong;
    public String trang_thai_nhap;

    public Giay() {
    }

    public Giay(int id, String ten, int so_luong, String trang_thai_nhap) {
        this.id = id;
        this.ten = ten;
        this.so_luong = so_luong;
        this.trang_thai_nhap = trang_thai_nhap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public String getTrang_thai_nhap() {
        return trang_thai_nhap;
    }

    public void setTrang_thai_nhap(String trang_thai_nhap) {
        this.trang_thai_nhap = trang_thai_nhap;
    }
    
    
}
