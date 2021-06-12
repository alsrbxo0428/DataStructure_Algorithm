package ch01;

public class Exer_Q01 {
	//네 값의 최대값을 구하는 max4메서드를 작성하세요.
	public static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		if(d > max)
			max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max4(4,2,3,1) : " + max4(4,2,3,1));
	}
}
