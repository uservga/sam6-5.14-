package com.company;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        String arr[] = new String[5];
        for(int i = 0; i < 5; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Ведіть слово: ");
            arr[i] = sc.nextLine();
        }
        System.out.println(arr[0].concat(" "+arr[1]).concat(" "+arr[2]).concat(" "+arr[3]).concat(" "+arr[4]));
    }
}