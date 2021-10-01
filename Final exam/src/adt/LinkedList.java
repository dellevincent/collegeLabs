package adt;

import java.util.EmptyStackException;

public class LinkedList<E> implements Queue<E> {
	private Node<E> top;
	
	public LinkedList(){
		top=null;
	}
	
	/**
	 * Remove the bottom element of your queue and return it.
	 */
	public E dequeue() {
		if(empty())
			throw  new EmptyStackException();
		else {
			Node<E> temp=top;
			top=top.previous;
			temp.previous=null;	
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
	 * Add the parameter to the queue, such that it is now the bottom most element.
	 *  Returns the item that was just pushed onto the stack.
	 */	
	public E enqueue(E item) {
		Node<E> toAdd= new Node<>(item);
		toAdd.previous=top;
		top=toAdd;
			
		return null;
	}

	
	/**
	 * Empties the Stack
	 */
	public void popAll() {
		if(empty())
			throw  new EmptyStackException();
		else {
			while(!empty()) {
				System.out.println(dequeue() + " ");
			}	
		}	
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
}
