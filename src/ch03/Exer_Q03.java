package ch03;

import java.util.Scanner;

public class Exer_Q03 {
	private static int searchIdx(int[] a, int n, int key, int[] idx) {
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				idx[cnt++] = i;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int n = sc.nextInt();
		int[] idx = new int[n];
		int[] x = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("key : ");
		int key = sc.nextInt();
		
		int count = searchIdx(x, n, key, idx);
		
		if(count == 0) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			for(int i = 0; i < count; i++) {
				System.out.println("그 값은 x[" + idx[i] + "]에 있습니다.");
			}
		}
		
	}
}
