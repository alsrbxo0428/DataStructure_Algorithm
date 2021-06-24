package ch03;

import java.util.Scanner;

public class Exer_Q02 {
//	private static int seqSearchSen(int[] a, int n, int key) {
//		int i = 0;
//		
//		a[n] = key;
//		
//		System.out.print("   |");
//		for(int j = 0; j < n; j++) {
//			System.out.printf("%3d", j);
//		}
//		System.out.print("\n---+");
//		for(int j = 0; j < n; j++) {
//			System.out.print("---");
//		}
//		
//		for(i = 0; ; i++) {
//			System.out.print("\n   |");
//			
//			for(int j = 0; j < n; j++) {
//				if(j == i) {
//					System.out.print("  *");
//					break;
//				}
//				else System.out.print("   ");
//			}//for
//			
//			System.out.printf("\n%3d|", i);
//			
//			for(int j = 0; j < n; j++) {
//				System.out.printf("%3d", a[j]);
//			}
//			
//			if(a[i] == key) break;
//		}//for
//		
//		return i == n ? -1 : i;
//	}//seqSearchSen
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("요솟수 : ");
//		int num = sc.nextInt();
//		int[] x = new int[num + 1];	//요솟수 num + 1
//		
//		for(int i = 0; i < num; i++) {
//			System.out.print("x[" + i + "] : ");
//			x[i] = sc.nextInt();
//		}
//		
//		System.out.print("검색할 값 : ");
//		int ky = sc.nextInt();
//		int idx = seqSearchSen(x, num, ky);
//		
//		if(idx == -1)
//			System.out.println("\n그 값의 요소가 없습니다.");
//		else
//			System.out.println("\n" + ky + "은(는) x[" + idx + "]에 있습니다.");
//		
//		sc.close();
//	}
	static int seqSearchEx(int[] a, int n, int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[i] == key)
				return i; // 검색성공
		}
		return -1; // 검색실패
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수：");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // 요솟수 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		System.out.print("찾는 값："); // 키 값을 입력 받음
		int ky = stdIn.nextInt();

		int idx = seqSearchEx(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은 " + "x[" + idx + "]에 있습니다.");
	}
}
