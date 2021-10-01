package adt;

public interface Queue<E> {

	/**
	 * Remove the bottom element of your queue and return it.
	 */
	public abstract E dequeue();
	
	/**
	 * Returns the bottom most element, without removing it
	 */
	public abstract E peek();
	
	/**
	 * Add the parameter to the queue, such that it is now the bottom most element.
	 *  Returns the item that was just pushed onto the stack.
	 */
	public abstract E enqueue(E item);
	
	/**
	 * Returns true if the stack is empty.  False if it is not.
	*/
	public abstract boolean empty();
	
	/**
	 * Empties the Stack
	 */
	public abstract void popAll();
}