package com.tonia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int faktorial = 1;
            for(int i = 1; i<= number; i++){
                faktorial = faktorial * i;
            }
            System.out.println(faktorial);
            }

}
