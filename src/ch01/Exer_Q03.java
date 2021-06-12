package ch01;

public class Exer_Q03 {
	//네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
	public static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		if(d < min)
			min = d;
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("min3(2,3,1,4) : " + min4(2,3,1,4));
	}
}
