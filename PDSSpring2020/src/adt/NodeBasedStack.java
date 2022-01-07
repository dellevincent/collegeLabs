package adt;
import java.util.EmptyStackException;

public class NodeBasedStack<E> implements Stack<E> {
	
	private Node<E> top;
	
	public NodeBasedStack() {
		top=null;
	}
	
	/**
	 * Remove the top element of your stack and return it.
	 */
	public E pop(){
		if(empty())
			throw  new EmptyStackException();
		else {
			Node<E> temp=top;
			top=top.next;
			temp.next=null;
			
			return temp.data;
		}	
	}

	/**
	 * Returns the topmost element, without removing it
	 */
	public E peek() {
		if(empty())
			throw  new EmptyStackException();
		else
			return top.data;
	}

	/**
	 * Add the parameter to the stack, such that it is now the topmost element. Returns NULL 
	*/
	public E push(E item) {	
		Node<E> toAdd= new Node<>(item);
		toAdd.next=top;
		top=toAdd;
			
		return null;
	}

	/**
	 * Returns true if the stack is empty.  False if it is not.
	*/
	public boolean empty() {
		if(top==null)
			return true;
		else
			return false;
	}

	/**
	 * Empties the Stack
	 */
	public void popAll() {
		if(empty())
			throw  new EmptyStackException();
		else {
			while(!empty()) {
				System.out.print(pop() + " ");
			}	
		}	
	}
}
