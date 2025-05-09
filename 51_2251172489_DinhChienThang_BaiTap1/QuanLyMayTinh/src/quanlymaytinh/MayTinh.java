/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlymaytinh;
/**
 *
 * @author 84983
 */
public class MayTinh {
    private String ten;
    private BoNho boNho;

    public MayTinh(String ten, String loaiBoNho, int dungluongBoNho) {
        this.ten = ten;
        this.boNho = new BoNho(loaiBoNho, dungluongBoNho);
    }

    public void hienThiThongTin() {
        System.out.println("_________MAY TINH_________________");
        System.out.println("Ten may tinh: " + ten);
        System.out.println("Loai bo nho " + boNho.getLoai());
        System.out.println("Dung luong bo nho " + boNho.getDungLuong() + " GB");
    }
}
