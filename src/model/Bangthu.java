/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author trung
 */
public class Bangthu implements Serializable{
    private String ngay, ghichu, khoanthu;
    private int sotien;
    public Bangthu(){
        
    }
    public Bangthu(String ngay, int sotien, String ghichu, String khoanthu){
        this.ngay = ngay;
        this.sotien = sotien;
        this.ghichu = ghichu;
        this.khoanthu = khoanthu;
    }
    public String getNgay(){
        return ngay;
    }
    public void setNgay(String ngay){
        this.ngay = ngay;
    }
     public int getSotien(){
        return sotien;
    }
    public void setSotien(int sotien){
        this.sotien = sotien;
    }
    public String getGhichu(){
        return ghichu;
    }
    public void setGhichu(String ghichu){
        this.ghichu = ghichu;
    }
    public String getKhoanthu(){
        return khoanthu;
    }
    public void setKhoanthu(String khoanthu){
        this.khoanthu = khoanthu;
    }
    public Object[] toObject() {
        return new Object[] {
            ngay,sotien,ghichu,khoanthu
        };
    }
}
