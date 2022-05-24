package com.vtmsoft.ltsp6;

import java.util.ArrayList;

public class Thongbao {
    int anh;
    String ngay;
    String tieude;

    public Thongbao(int anh, String ngay, String tieude) {
        this.anh = anh;
        this.ngay = ngay;
        this.tieude = tieude;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }
}
