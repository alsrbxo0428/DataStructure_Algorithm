package ch01;

public class Exer_Q16 {
    public static void spira(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (n-1)*2+1; j++) {
                if(j > n-i && j < n+i) System.out.print('*');
                else System.out.print(' ');
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        spira(4);
    }
}