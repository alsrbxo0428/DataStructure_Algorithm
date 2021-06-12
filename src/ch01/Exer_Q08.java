package ch01;

import java.util.Scanner;

public class Exer_Q08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++, n--) {//가우스 덧셈
			if(i<n) sum += i+n;
			else if(i == n) sum += i;
		}
		System.out.println("1부터 n까지의 합 : " + sum);
	}
}