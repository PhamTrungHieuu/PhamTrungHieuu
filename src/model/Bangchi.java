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
public class Bangchi implements Serializable {
    private String ngay , ghichu , khoanchi;
    private int sotien;
    public Bangchi(){
        
    }
    
    public Bangchi(String ngay , int sotien , String ghichu ,String khoanchi){
        this.ngay = ngay;
        this.sotien = sotien;
        this.ghichu = ghichu;
        this.khoanchi = khoanchi;
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
    public String getKhoanchi(){
        return khoanchi;
    }
    public void setKhoanchi(String khoanchi){
        this.khoanchi = khoanchi;
    }
    public Object[] toObject() {
        return new Object[] {
            ngay,sotien,ghichu,khoanchi
        };
    }
}
