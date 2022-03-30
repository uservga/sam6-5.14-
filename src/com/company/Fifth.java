package com.company;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        String arr[] = new String[2];
        for(int i = 0; i < 2; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Ведіть рядок: ");
            arr[i] = sc.nextLine();
        }
        if(arr[0].length()>arr[1].length()){
            System.out.println("Перший рядок (" + arr[0] + ") - більший!");
        }else if(arr[0].length()==arr[1].length()){
            System.out.println("Перший рядок = Другому рядку");
        }else{
            System.out.println("Другий рядок (" + arr[1] + ") - більший!");
        }
    }
}
