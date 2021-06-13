package ch01;

public class Exer_Q17 {
    public static void npira(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (n-1)*2+1; j++) {
                if(j > n-i && j < n+i) System.out.print(i % 10);
                else System.out.print(' ');
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        npira(4);
    }
}