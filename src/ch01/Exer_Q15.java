package ch01;

public class Exer_Q15 {
	public static void triangleLB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public static void triangleLU(int n) {
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public static void triangleRU(int n) {
		for(int i = n; i >= 1; i--) {
			for(int j = n; j >= 1; j--) {
				if(j <= i) System.out.print('*');
				else System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	public static void triangleRB(int n) {
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= n; j++) {
				if(j < i) System.out.print(' ');
				else System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("========LB========");
		triangleLB(5);
		System.out.println("========LU========");
		triangleLU(5);
		System.out.println("========RU========");
		triangleRU(5);
		System.out.println("========RB========");
		triangleRB(5);
	}
}