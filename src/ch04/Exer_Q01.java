package ch04;

import java.util.Scanner;

public class Exer_Q01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64);	//최대 64개를 푸시할 수 있는 스택
		
		while(true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.print("(1)푸시  (2)팝  (3)피크  (4)덤프  (5)인덱스오브\n"
								+ "(6)클리어  (7)캐퍼시티  (8)사이즈  (9)이즈엠티  (10)이즈풀\n"
								+ "(0)종료 : ");
			
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
				case 1:		//푸시
					System.out.print("데이터 : ");
					x = sc.nextInt();
					try {
						s.push(x);
					} catch (IntStack.OverflowStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
				case 2:		//팝
					try {
						x = s.pop();
						System.out.println("팝한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				case 3:		//피크
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 " + x + "입니다.");
					} catch (Exception e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				case 4:		//덤프
					s.dump();
					break;
				case 5:		//인덱스오브
					System.out.print("찾을 값 : ");
					x = sc.nextInt();
					System.out.printf("%d은(는) %d번째에 있습니다.\n", x, s.indexOf(x));
					break;
				case 6:		//클리어
					s.clear();
					break;
				case 7: 	//캐퍼시티
					System.out.printf("스택의 총 용량은 %d입니다.\n", s.capacity());
					break;
				case 8:		//사이즈
					System.out.printf("스택이 %d만큼 찼습니다.\n", s.size());
					break;
				case 9:		//이즈엠티
					if(s.isEmpty())
						System.out.println("스택이 비어있습니다.");
					else
						System.out.println("스택이 비어있지 않습니다.");
					break;
				case 10:	//이즈풀
					if(s.isFull())
						System.out.println("스택이 가득 찼습니다.");
					else
						System.out.println("스택이 가득 차지 않았습니다.");
					break;
			}//switch
		}//while
	}//main
}//class
