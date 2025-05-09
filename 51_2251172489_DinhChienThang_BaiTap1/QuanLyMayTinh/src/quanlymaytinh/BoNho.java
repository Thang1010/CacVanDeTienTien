/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlymaytinh;

/**
 *
 * @author 84983
 */
public class BoNho {
    private String loai;
    private int dungLuong;

    public BoNho(String loai, int dungLuong) {
        this.loai = loai;
        this.dungLuong = dungLuong;
    }

    public String getLoai() {
        return loai;
    }

    public int getDungLuong() {
        return dungLuong;
    }
}
