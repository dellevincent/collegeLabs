package adt;

public interface Stack<E> {
	
	/**
	 * Remove the top element of your stack and return it.
	 */
	public abstract E pop();
	
	/**
	 * Returns the topmost element, without removing it
	 */
	public abstract E peek();
	
	/**Add the parameter to the stack, such that it is now the topmost element. Returns the item that was just pushed onto the 
	* stack.
	*/
	public abstract E push(E item);
	
	/**
	 * Returns true if the stack is empty.  False if it is not.
	*/
	public abstract boolean empty();
	
	/**
	 * Empties the Stack
	 */
	public abstract void popAll();
}
