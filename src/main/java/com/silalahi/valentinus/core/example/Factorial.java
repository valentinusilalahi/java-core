package com.silalahi.valentinus.core.example;

/**
 *
 * @author valentinusilalahi
 */
public class Factorial {

    public static void main(String[] args) {
        int nomor = 5;
        int faktorial = nomor;

        for (int i = (nomor - 1); i > 1; i--) {
            faktorial = faktorial * i;
        }
        System.out.println("Nomor Faktorial : " + faktorial);
    }
}
