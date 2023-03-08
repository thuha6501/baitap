package org.example.cau2;

public abstract class Nhanvien {
    private String manhanvien;
    private String hoten;
    private String namsinh;
    private String diachi;

    public Nhanvien() {
    }

    public Nhanvien(String manhanvien, String hoten) {
        this.manhanvien = manhanvien;
        this.hoten = hoten;
    }

    public Nhanvien(String manhanvien, String hoten, String namsinh, String diachi) {
        this.manhanvien = manhanvien;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.diachi = diachi;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public String getHoten() {
        return hoten;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public String getDiachi() {
        return diachi;
    }
    public abstract String moTaCongViec();

    @Override
    public String toString() {
        return
                "manhanvien='" + manhanvien + '\'' +
                ", hoten='" + hoten + '\'' +
                ", namsinh='" + namsinh + '\'' +
                ", diachi='" + diachi + '\'' +
                ']';
    }
}
