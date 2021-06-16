package ch02;

import java.util.Scanner;

public class Exer_Q05 {
	public static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) return false;
		
		return true;
	}
	
	public static void copy(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			a[i] = b[a.length - i - 1];
		}
	}
	
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int na = sc.nextInt();
		
		int[] a = new int[na];
		
		for(int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int nb = sc.nextInt();
		
		int[] b = new int[nb];
		
		for(int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		if(equals(a,b)) {
			System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 복사합니다.");
			copy(a,b);
			for(int i = 0; i < na; i++) {
				System.out.print(a[i] + " ");
			}
		}
		
	}
}
