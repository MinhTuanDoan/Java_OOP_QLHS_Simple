/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1560633;

import java.util.Scanner;

/**
 *
 * @author Doan Minh Tuan
 */
public class HocSinhCap1 extends HocSinh{
    
    public HocSinhCap1(){
        loai = 1;
    }
    @Override
    public void nhapThongTin() {
        Scanner idv = new Scanner(System.in);
        System.out.print("Nhap ma hoc sinh: ");
        this.maHS = idv.nextInt();
        System.out.print("Nhap ho ten hoc sinh: ");
        idv.nextLine();
        this.hoTen = idv.nextLine();
        System.out.print("Nhap diem Toan: ");
        this.diemToan = idv.nextFloat();
        System.out.print("Nhap diem Van: ");
        this.diemVan = idv.nextFloat();
        System.out.println();
    }

    @Override
    public void xuatThongTin() {
        System.out.println(String.format("Ma HS: %d", this.maHS));
        System.out.println(String.format("Hoc sinh cap: %d", this.loai));
        System.out.println(String.format("Ho ten: %s", this.hoTen));
        System.out.println(String.format("Diem Toan: %.2f", this.diemToan));
        System.out.println(String.format("Diem Van: %.2f", this.diemVan));
        System.out.println(String.format("Diem trung binh: %.2f", diemTrungBinh()));
    }
    
    @Override
    public float diemTrungBinh(){
        return (this.diemToan + this.diemVan) / 2;
    }
}
