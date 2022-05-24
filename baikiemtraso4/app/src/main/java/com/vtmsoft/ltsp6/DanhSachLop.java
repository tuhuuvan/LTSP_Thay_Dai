package com.vtmsoft.ltsp6;

public class DanhSachLop {
    int hinhanh;
    String tenlop;
    String ca;
    int nutnhan;

    public DanhSachLop(int hinhanh, String tenlop, String ca, int nutnhan) {
        this.hinhanh = hinhanh;
        this.tenlop = tenlop;
        this.ca = ca;
        this.nutnhan = nutnhan;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public int getNutnhan() {
        return nutnhan;
    }

    public void setNutnhan(int nutnhan) {
        this.nutnhan = nutnhan;
    }
}
