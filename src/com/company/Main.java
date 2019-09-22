package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner read = new Scanner(System.in);
        System.out.println("xin moi nhap nam duong lich:");
        int namDuong = read.nextInt();
        String namAm = tinhNamAm(namDuong);
        System.out.println(namAm);
    }

    private static String tinhNamAm(int namDuong) {
        String Can = " ", Chi = " ";
        String namAm = " ";
        switch (namDuong % 10)
        {
            case 0:
                Can = "Canh ";
                break;
            case 1:
                Can = "Tan ";
                break;
            case 2:
                Can = "Nham ";
                break;
            case 3:
                Can = "Quy ";
                break;
            case 4:
                Can = "Giap ";
                break;
            case 5:
                Can = "At ";
                break;
            case 6:
                Can = "Binh ";
                break;
            case 7:
                Can = "Dinh ";
                break;
            case 8:
                Can = "Mau ";
                break;
            case 9:
                Can = "Ky ";
                break;
        }
        switch (namDuong % 12)
        {
            case 0:
                Chi = "Than";
                break;
            case 1:
                Chi = "Dau";
                break;
            case 2:
                Chi = "Tuat";
                break;
            case 3:
                Chi = "Hoi";
                break;
            case 4:
                Chi = "Ty";
                break;
            case 5:
                Chi = "Suu";
                break;
            case 6:
                Chi = "Dan";
                break;
            case 7:
                Chi = "Meo";
                break;
            case 8:
                Chi = "Thin";
                break;
            case 9:
                Chi = "Ty";
                break;
            case 10:
                Chi = "Ngo";
                break;
            case 11:
                Chi = "Mui";
                break;
        }

        return namAm = Can + Chi;
    }
}
