package ch02;

import java.util.Scanner;

public class Exer_Q3 {
	public static int sumOf(int[] a) {
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();	//요솟수
		
		int[] x = new int[num];	//요솟수가 num인 배열
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("모든 요소의 합계 : " + sumOf(x));
	}
}
