package org.example.cau2;

public class KyThuat extends Nhanvien{
    private String chuyennghanh;

    public KyThuat(){

    }

    public KyThuat(String manhanvien, String hoten) {
        super(manhanvien, hoten);
    }

    public KyThuat(String manhanvien, String hoten, String namsinh, String diachi, String chuyennghanh) {
        super(manhanvien, hoten, namsinh, diachi);
        this.chuyennghanh = chuyennghanh;
    }

    public String getChuyennghanh() {
        return chuyennghanh;
    }

    public void setChuyennghanh(String chuyennghanh) {
        this.chuyennghanh = chuyennghanh;
    }

    @Override
    public String moTaCongViec() {
        return " hỗ trợ về mặt kỹ thuật cho tòan bộ nhân viên trong công ty";
    }

    @Override
    public String toString() {
        return "KyThuat[" + super.toString() +
                ",chuyennghanh='" + chuyennghanh + '\'' +
                ']';
    }
}
