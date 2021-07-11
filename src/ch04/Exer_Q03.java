package ch04;

import java.util.Scanner;

public class Exer_Q03 {
	private int max;			//스택 용량
	private int ptrA, ptrB;		//스택 포인터
	private int[] stk;			//스택 본체
	
	public enum AorB {
		StackA, StackB
	};
	
	//실행 시 예외 : 스택이 비어있음
	public class EmptyExer_Q03StackException extends RuntimeException {
		public EmptyExer_Q03StackException() {	}
	}//EmptyExer_Q03StackException
	
	//실행 시 예외 : 스택이 가득 참
	public class OverflowExer_Q03StackException extends RuntimeException {
		public OverflowExer_Q03StackException() {	}
	}//OverflowExer_Q03StackException
	
	//생성자
	public Exer_Q03(int capacity) {
		ptrA = 0;
		ptrB = capacity - 1;
		max = capacity;
		try {
			stk = new int[max];		//스택 본체용 배열을 생성	
		} catch (OutOfMemoryError e) {	//생성할 수 없음
			max = 0;
		}
	}//생성자
	
	//스택에 x를 푸시
	public int push(AorB sw, int x) throws OverflowExer_Q03StackException {
		if(ptrA >= ptrB + 1) {	//스택이 가득 참
			throw new OverflowExer_Q03StackException();
		}
		switch(sw) {
			case StackA:
				stk[ptrA++] = x;
				break;
			case StackB:
				stk[ptrB--] = x;
				break;
		}
		return x;
	}//push
	
	//스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop(AorB sw) throws EmptyExer_Q03StackException {
		int x = 0;
		switch(sw) {
			case StackA:
				if(ptrA <= 0) {		//스택이 비어 있음
					throw new EmptyExer_Q03StackException();
				}
				x = stk[--ptrA];
				break;
			case StackB:
				if(ptrB >= max-1) {		//스택이 비어 있음
					throw new EmptyExer_Q03StackException();
				}
				x = stk[++ptrB];
				break;
		}
		return x;
	}//pop
	
	//스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public int peek(AorB sw) throws EmptyExer_Q03StackException {
		int x = 0;
		switch(sw) {
			case StackA:
				if(ptrA <= 0) {
					throw new EmptyExer_Q03StackException();
				}
				x = stk[ptrA - 1];
				break;
			case StackB:
				if(ptrB >= max - 1) {
					throw new EmptyExer_Q03StackException();
				}
				x = stk[ptrB + 1];
				break;
		}
		return x;
	}//peek
	
	//스택에서 x를 찾아 인덱스(없으면 -1)를 반환
	public int indexOf(AorB sw, int x) {
		switch(sw) {
			case StackA:
				for(int i = ptrA - 1; i >= 0; i--) {
					if(stk[i] == x)
						return i;
				}
				break;
			case StackB:
				for(int i = ptrB + 1; i <= max; i++) {
					if(stk[i] == x)
						return i;
				}
				break;
		}
		return -1;
	}//indexOf
	
	//스택을 비움
	public void clear(AorB sw) {
		switch(sw) {
			case StackA:
				ptrA = 0;
				break;
			case StackB:
				ptrB = max - 1;
				break;
		}
	}//clear
	
	//스택의 용량을 반환
	public int capacity() {
		return max;
	}//capacity
	
	//스택에 쌓여있는 데이터 수를 반환
	public int size(AorB sw) {
		switch(sw) {
			case StackA:
				return ptrA;
			case StackB:
				return max - ptrB - 1;
		}
		return 0;
	}//size
	
	//스택이 비어 있는가?
	public boolean isEmpty(AorB sw) {
		switch(sw) {
			case StackA:
				return ptrA <= 0;
				break;
			case StackB:
				return ptrB >= max - 1;
				break;
		}
		return true;
	}//isEmpty
	
	//스택이 가득 찼는가?
	public boolean isFull() {
			return ptrA >= ptrB + 1;
	}//isFull
	
	//스택안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump(AorB sw) {
		switch(sw) {
			case StackA:
				if(ptrA <= 0) {
					System.out.println("스택이 비어있습니다.");
				} else {
					for(int i = 0; i < ptrA; i++) {
						System.out.print(stk[i] + " ");
					}
					System.out.println();
				}//else
				break;
			case StackB:
				if(ptrB >= max - 1) {
					System.out.println("스택이 비어있습니다.");
				} else {
					for(int i = max - 1; i > ptrB; i--) {
						System.out.print(stk[i] + " ");
					}
					System.out.println();
				break;
		}
			}//else
	}//dump
}
