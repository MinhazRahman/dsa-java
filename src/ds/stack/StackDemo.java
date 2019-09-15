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

public class StackDemo extends AbstractStack {

	//declare the stack array
	int[] stackArray;
	
	//constructor
	public StackDemo(int arraySize, int stackSize) {
		
		super(stackSize);
		
		//create the array
		stackArray = new int[arraySize];
	}

	//insert element into the stack
	@Override
	public void push(int e) {
		 
		try {
			
			if(isFull()) {
				
				throw new StackOverflow();
			}
			
			//increase top by 1 and insert the element e at stack[top]
			stackArray[++top] = e;
		} 
		catch (StackOverflow ex) {
			
			ex.printStackTrace();
		}
		
	}

	//delete the top element and decreases the stack size
	@Override
	public int pop() {
		
		try {
			if(isEmpty()) {
				
				throw new StackUnderflow();
			}
		} catch (StackUnderflow ex) {
			
			ex.printStackTrace();
		}
		
		//retrieve stackArray[top], decrease top by 1 and return stackArray[top]
		return stackArray[top--];
	}

	//check whether there is any element in the stack or not
	@Override
	public boolean isEmpty() throws StackUnderflow {
		
		return top == 0;
	}

	//check if the stack is full or not
	@Override
	public boolean isFull() throws StackOverflow {
		
		return top == stackSize;
	}
}
