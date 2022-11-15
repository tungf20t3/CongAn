package com.reddog.btcuoiky.model;

import java.io.Serializable;

public class CongAn implements Serializable {
    private String ten, quoc_gia, noi_cong_tac, cap_bac;
    private int hinh_anh;

    public CongAn(String ten, String quoc_gia, String noi_cong_tac, String cap_bac, int hinh_anh) {
        this.ten = ten;
        this.quoc_gia = quoc_gia;
        this.noi_cong_tac = noi_cong_tac;
        this.cap_bac = cap_bac;
        this.hinh_anh = hinh_anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQuoc_gia() {
        return quoc_gia;
    }

    public void setQuoc_gia(String quoc_gia) {
        this.quoc_gia = quoc_gia;
    }

    public String getNoi_cong_tac() {
        return noi_cong_tac;
    }

    public void setNoi_cong_tac(String noi_cong_tac) {
        this.noi_cong_tac = noi_cong_tac;
    }

    public String getCap_bac() {
        return cap_bac;
    }

    public void setCap_bac(String cap_bac) {
        this.cap_bac = cap_bac;
    }

    public int getHinh_anh() {
        return hinh_anh;
    }

    public void setHinh_anh(int hinh_anh) {
        this.hinh_anh = hinh_anh;
    }
}
