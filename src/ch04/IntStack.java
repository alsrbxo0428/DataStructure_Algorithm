package ch04;

public class IntStack {
	private int max;	//스택 용량
	private int ptr;	//스택 포인터
	private int[] stk;	//스택 본체
	
	//실행 시 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {	}
	}
	
	//실행 시 예외 : 스택이 가득 참
	public class OverflowStackException extends RuntimeException {
		public OverflowStackException() {	}
	}
	
	//생성자
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];		//스택 본체용 배열을 생성	
		} catch (OutOfMemoryError e) {	//생성할 수 없음
			max = 0;
		}
	}
	
	//스택에 x를 푸시
	public int push(int x) throws OverflowStackException {
		if(ptr >= max) {	//스택이 가득 참
			throw new OverflowStackException();
		}
		return stk[ptr++] = x;
	}
}
