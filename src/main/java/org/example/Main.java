package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a,h,alan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kenar uzunluğunu giriniz (cm) : ");
        a=scanner.nextFloat();
        System.out.println("Yüksekliği giriniz (cm) : ");
        h=scanner.nextFloat();
        alan = a*h / 2;
        System.out.printf("Üçgenin Alanı (cm2) : %.2f",alan);
    }
}