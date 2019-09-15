package ds.stack;

/**
 * 1. Stack maintains FILO(First In Last Out) or LIFO (Last In First Out) policy.
 * 2. The INSERT operation on stack is often called PUSH.
 * 3. The DELETE operation, which doesn't take an element argument is called POP.
 * 4. We can implement a stack of at most n elements with an array S[0...n].
 * 5. The array has an attribute S.top that indexes the most recently inserted element.
 * 6. The stack consists of elements S[0...S.top}, where S[0] is the
 * 	  element at the bottom of the stack and S[S.top] is the element at the top.
 * 7. When S.top = 0, the stack contains no elements and is empty.
 * 8. If we attempt to POP an empty stack, we say the stack underflows, which is normally an error.
 * 9. If S.top exceeds n, the stack overflows.
 * */

public abstract class AbstractStack {
	
	//declare the size and top attributes
	int stackSize;  //size of the array
	int top;
	
	//constructor
	AbstractStack(int stackSize){
		
		this.stackSize = stackSize;
		this.top = -1;
	}
	
	//methods
	public abstract void push(int e);
	public abstract int pop();
	public abstract boolean isEmpty() throws StackUnderflow;
	public abstract boolean isFull() throws StackOverflow;

}
