package ds.stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class TestStack {

	@Test
	void testIsEmptyTrue() throws StackUnderflow, StackOverflow {
		
		StackDemo stack = new StackDemo(10, 5);
		
		boolean expected = false;
		boolean actual = stack.isEmpty(); //returns false
		assertTrue(expected == actual); 
	
	}
	
	@Test
	void testIsEmptyFalse() throws StackUnderflow, StackOverflow {
		
		StackDemo stack = new StackDemo(10, 5); 
		
		//insert elements into the stack
		stack.push(3);
		stack.push(7);
		stack.push(4);
		stack.push(9);
		stack.push(6);
		
		boolean expected = true;
		boolean actual = stack.isEmpty();  //returns true
		
		assertFalse(expected == actual);

	}
	
	@Test 
	void testPOP() throws StackUnderflow, StackOverflow{
		
		StackDemo stack = new StackDemo(10, 5); 
		
		//insert elements into the stack
		stack.push(3);
		stack.push(7);
		stack.push(4);
		stack.push(9);
		stack.push(6);
		
		int actual = stack.pop();
		int expected = 6;
		
		assertTrue(expected == actual);
		
	}

}























