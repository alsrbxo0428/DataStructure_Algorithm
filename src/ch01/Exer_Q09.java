package ch01;

public class Exer_Q09 {
	public static int sumof(int a, int b) {
		
		int max = 0, min = 0, sum = 0;
		
		max = a;
		min = b;
		if(b > max) {
			max = b;
			min = a;
		}
		
		for( ; min <= max; min++) {
			sum += min;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumof(3,5));
		System.out.println(sumof(6,4));
	}
}
