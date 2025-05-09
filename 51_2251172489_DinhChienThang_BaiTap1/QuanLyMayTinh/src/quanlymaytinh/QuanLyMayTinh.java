/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlymaytinh;
import java.util.Scanner;
/**
 *
 * @author 84983
 */
public class QuanLyMayTinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten may tinh: ");
        String Tenmt = scanner.nextLine();
        System.out.print("Nhap loai bo nho: ");
        String Loaibonho = scanner.nextLine();
        System.out.print("Nhap dung luong bo nhớ (GB): ");
        int dungluongbonho = scanner.nextInt();
        
        MayTinh mt = new MayTinh(Tenmt, Loaibonho, dungluongbonho);
        mt.hienThiThongTin();
    }
    
}
