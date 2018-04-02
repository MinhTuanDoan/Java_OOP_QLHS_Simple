/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1560633;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Doan Minh Tuan
 */
public class Main {

    /**
     * @return 
     */
    
    public static ArrayList<HocSinh> nhapMangHocSinh(){
        Scanner idv = new Scanner(System.in);
        ArrayList<HocSinh> ls = new ArrayList();
        int n;
        System.out.print("Nhap so luong hoc sinh can them: ");
        n = idv.nextInt();
        int capHS;
        for(int i = 0; i < n; i++){
            HocSinh hs = null;
            System.out.print("Nhap cap hoc sinh(1/2/3): ");
            capHS = idv.nextInt();
            switch (capHS) {
                case 1:
                    hs = new HocSinhCap1();
                    break;
                case 2:
                    hs = new HocSinhCap2();
                    break;
                case 3:
                    hs = new HocSinhCap3();
                    break;
                default:
                    break;
            }
            hs.nhapThongTin();
            ls.add(hs);
        }
        return ls;
    }
    public static void xepLoaiHS(float dtb){
        if(dtb < 5){
            System.out.println("Xep loai Kem");
        }
        else if(dtb < 6){
            System.out.println("Xep loai: Trung Binh");
        }
        else if(dtb < 8){
            System.out.println("Xep loai: Kha");
        }
        else if(dtb < 9){
            System.out.println("Xep loai: Gioi");
        }
        else if(dtb < 10){
            System.out.println("Xep loai: Xuat Sac");
        }
    }
    public static void xuatXepLoaiHS(ArrayList<HocSinh> ls){
        for(int i = 0; i < ls.size(); i++){
            HocSinh t = ls.get(i);
            t.xuatThongTin();
            xepLoaiHS(t.diemTrungBinh());
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<HocSinh> ls = nhapMangHocSinh();
        System.out.println("Thong tin hoc sinh: ");
        xuatXepLoaiHS(ls);
    }
    
}
