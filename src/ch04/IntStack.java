package ch04;

public class IntStack {
	private int max;	//스택 용량
	private int ptr;	//스택 포인터
	private int[] stk;	//스택 본체
	
	//실행 시 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {	}
	}//EmptyIntStackException
	
	//실행 시 예외 : 스택이 가득 참
	public class OverflowStackException extends RuntimeException {
		public OverflowStackException() {	}
	}//OverflowStackException
	
	//생성자
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];		//스택 본체용 배열을 생성	
		} catch (OutOfMemoryError e) {	//생성할 수 없음
			max = 0;
		}
	}//생성자
	
	//스택에 x를 푸시
	public int push(int x) throws OverflowStackException {
		if(ptr >= max) {	//스택이 가득 참
			throw new OverflowStackException();
		}
		return stk[ptr++] = x;
	}//push
	
	//스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0) {		//스택이 비어 있음
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}//pop
	
	//스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public int peek() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr - 1];
	}//peek
	
	//스택에서 x를 찾아 인덱스(없으면 -1)를 반환
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--) {
			if(stk[i] == x)
				return i;
		}
		return -1;
	}//indexOf
	
	//스택을 비움
	public void clear() {
		ptr = 0;
	}//clear
	
	//스택의 용량을 반환
	public int capacity() {
		return max;
	}//capacity
	
	//스택에 쌓여있는 데이터 수를 반환
	public int size() {
		return ptr;
	}//size
	
	//스택이 비어 있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}//isEmpty
	
	//스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}//isFull
	
	//스택안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if(ptr <= 0) {
			System.out.println("스택이 비어있습니다.");
		} else {
			for(int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}//else
	}//dump
}
