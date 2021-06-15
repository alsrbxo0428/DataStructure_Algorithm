package ch02;

import java.util.Scanner;

public class Exer_Q2 {
	public static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	public static void reverse(int[] a) {
		for(int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length - i - 1);
			System.out.println("\na[" + i + "]과(와) a[" + (a.length - i - 1) + "]를 교환합니다.");
			for(int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
		}		
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

		for(int i = 0; i < num; i++) {
			System.out.print(x[i] + " ");
		}

		reverse(x);
		
		System.out.println("\n역순 정렬을 마쳤습니다.");
	}
}
