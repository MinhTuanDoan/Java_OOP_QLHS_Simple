/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1560633;

/**
 *
 * @author Doan Minh Tuan
 */
public abstract class HocSinh {
    protected int loai;
    protected int maHS;
    protected String hoTen;
    protected float diemToan;
    protected float diemVan;
    
    public abstract void nhapThongTin();
    public abstract void xuatThongTin();
    public abstract float diemTrungBinh();
    public final int getLoai(){
        return this.loai;
    }
    public HocSinh(){
        loai = 0;
    }
}
