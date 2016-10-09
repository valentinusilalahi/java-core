package com.silalahi.valentinus.core.example;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0, b = 1, hasil = 0, c;

		Scanner masukan = new Scanner(System.in);
		System.out.print("Deret Fibonacci : ");
		c = masukan.nextInt();
		for (int i = 1; i <= c; i++) {
			a = b;
			b = hasil;
			System.out.print(hasil + " ");
			hasil = a + b;
		}
	}
}
