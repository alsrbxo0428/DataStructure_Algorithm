package ch03;

import java.util.Scanner;

public class Exer_Q04 {
	private static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;
		
		System.out.print("   |");
		for(int i = 0; i < n; i++) {
			System.out.printf("%3d", i);
		}
		System.out.print("\n---+");
		for(int i = 0; i < n; i++) {
			System.out.print("---");
		}
		
		do {
			int pc = (pl + pr) / 2;
			
			//==============================
			System.out.print("\n   |");
			for(int i = 0; i < n; i++) {
				if(pl == i) {
					System.out.print(" <-");
				} else if(pr == i) {
					System.out.print(" ->");
					break;
				} else if(i == pc) {
					System.out.print("  +");
				} else {
					System.out.print("   ");
				}//else
			}//for
			System.out.printf("\n%3d|", pc);
			for(int i = 0; i < n; i++) {
				System.out.printf("%3d", a[i]);
			}
			System.out.print("\n   |");
			//==============================
			
			if(a[pc] == key) return pc;
			else if(a[pc] < key) pl = pc + 1;
			else pr = pc - 1;
		} while(pl <= pr);//while
		
		return -1;
	}//binSearch
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			do{
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i - 1]);
		}
		
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		
		int idx = binSearch(x, num, ky);
		
		System.out.println();
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		
		sc.close();
	}//main
}
