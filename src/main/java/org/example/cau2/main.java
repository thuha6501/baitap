package org.example.cau2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Nhanvien nv = new KyThuat("tv6976320","Nguyễn Thi Thu Hà", "06/05/2001","TH", "Điện tử viễn thông");
        System.out.println(nv);
        System.out.println(nv.moTaCongViec());

        // Input
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        String manhanvien = in.nextLine();
        System.out.print("Nhập họ tên nhân viên: ");
        String hoten = in.nextLine();
        System.out.print("Nhập năm sinh : ");
        String namsinh = in.nextLine();
        System.out.print("Nhập địa chỉ nhân viên: ");
        String diachi = in.nextLine();
        System.out.print("Nhập chuyên nghành: ");
        String chuyennghanh = in.nextLine();

        Nhanvien nv1 = new KyThuat(manhanvien,hoten, namsinh, diachi, chuyennghanh);
        System.out.println(nv1);
        System.out.println(nv1.moTaCongViec());

    }
}

