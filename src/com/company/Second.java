package com.company;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведіть рядок: ");
        String str = sc.nextLine();
        String delimeter = " ";
        String subStr_all[] = str.split(delimeter);
        for(int i = 0; i < subStr_all.length; i++) {
            System.out.print(subStr_all[i].substring(0, 1) + " ");
        }
    }
}
