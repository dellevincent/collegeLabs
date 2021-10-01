 package adt;

public class LinkedList<E> implements List<E> {
	private Node<E> head;
	private int size;
	
	public LinkedList(){
		Node<E> dummyNode= new Node<E>(null);
		head=dummyNode;
		head.next=head;
		head.previous=head;
		size=0;
	}	
	
	/**
	 * Appends the element to the end of this list
	 * @param e
	 * @return true
	 */
	public boolean add(E e) {
		Node<E> toAdd= new Node<>(e);
		if(head.next.equals(head)) {
			toAdd.next=head;
			toAdd.previous=head;
			head.next=toAdd;
			head.previous=toAdd;
		}
		else {
			Node<E> temp=getNode(size);
			temp.next=toAdd;
			toAdd.previous=temp;
			toAdd.next=head;
			head.previous=toAdd;
		}
		size++;
		return true;
	}
	
	/**
	 * Adds an element to the array and shifts elements at the index
	 * @param index,element
	 */
	public void add(int index, E element) {
		Node<E> toAdd=new Node<>(element);
		if(head.next.equals(head) && index==0) {
			toAdd.next=head;
			toAdd.previous=head;
			head.next=toAdd;
			head.previous=toAdd;
		}
		else if(!head.next.equals(head) && index==0) {
			toAdd.next=head.next;
			toAdd.previous=head;
			head.next.previous=toAdd;
			head.next=toAdd;
		}
		else {
			Node<E>temp=getNode(index);
			toAdd.next=temp.next;
			toAdd.previous=temp;
			temp.next.previous=toAdd;
			temp.next=toAdd;
		}
		size++;
	}
	
	/**
	 * Clears the list 
	 */
	public void clear() {
		Node<E> dummyNode= new Node<E>(null);
		head=dummyNode;
		head.next=head;
		head.previous=head;
		size=0;
	}
	
	
	/**
	 * 
	 * @param o
	 * @return boolean true or false if the collection contains that specific object
	 */
	public boolean contains(Object o) {
		boolean isThere=false;
		 Node<E> temp=head.next;
		 if(temp.data.equals(o)) {
			isThere=true; 
		 }
		 else {
			 for(int i=0; i<size; i++) {
				if(temp.data.equals(o)) {
					isThere=true;
				}  
				temp=temp.next;
		 	}
		 }
		return isThere;
	}
	
	
	/**
	 * 
	 * @param object
	 * @return true or false for Comparisons if the specified object with the list for equality.
	 */
	public boolean equals(Object o) {
		if(o instanceof LinkedList) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * @param index
	 * @return the element at the specified position in this list.
	 */
	public E get(int index) {
		Node<E> hopper=head.next;
		for(int i=0; i<index; i++) {
			hopper=hopper.next;
		}
		return hopper.data;
	}
	
	/**
	 * Returns the index of the first occurrence of the specified element in this list,
	 * or -1 if this list does not contain the element.
	 */
	public int indexOf(Object o) {
		Node<E> hopper=head.next;
		int temp=-1;
		if(o==null) {
			for(int i=0; i<size; i++) {
				if(hopper.data==o) {
					temp=i;
					break;
				}
				hopper=hopper.next;
			}		
		}
		else {
			for(int i=0; i<size; i++) {
				if(hopper.data.equals(o)) {
					temp=i;
					break;
				}
				hopper=hopper.next;
			}			
		}
		
		return temp;
	}
	 
	/**
	 * Returns true if this list contains no elements.
	 */
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * 
	 * @param o
	 * @return index of the last occurrence of the last object
	 */
	public int lastIndexOf(Object o) {
		Node<E> hopper=head.previous;
		int temp=-1;

		for(int i=size-1; i>=0; i--) {
			if(hopper.data.equals(o)) {
				temp=i;
				break;
		}
			hopper=hopper.previous;
		}					
		return temp;
	}
	
	/**
	 * Removes an element from the list, including the node that holds it by its index.
	 * @param index
	 * @return null
	 */
	public E remove(int index) {
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException("IndexOutOfBound");
		}
		else if(index==0) {
			Node<E> toRemove=head.next;
			head.next=head.next.next;
			head.next.next.previous=head;
			toRemove.next=null;
			toRemove.previous=null;
			toRemove.data=null;
		}
		else{
			Node<E> temp= getNode(index);
			Node<E> toRemove=temp.next;
			temp.next=temp.next.next;
			temp.next.next.previous=temp;
			toRemove.next=null;
			toRemove.previous=null;
			toRemove.data=null;
		}
		size-=1;
		return null;
	}
	
	/**
	 * Removes an element from the list, including the node that holds it.
	 * @param o
	 * @return true or false if the object is removed
	 */
	public boolean remove(Object o) {
		if(o==null) {
			Node<E> temp=head.next;
			for(int i=0; i<size; i++) {
				if(temp.data==o) {
					remove(i);
				}
				temp=temp.next;	
			}
		}
		else {
			Node<E> temp=head.next;
			for(int i=0; i<size; i++) {
				if(temp.data.equals(o)) {
					remove(i);
				}
				temp=temp.next;	
			}
		}
		return true;
	}
	
	/**
	 * This sets an element at an index to the parameter given
	 * @param index
	 * @param element
	 * @return Element
	 */
	public E set(int index, E element) {
		Node<E> hopper= head;
		for(int i=0; i<index;i++) {
			hopper=hopper.next;
		}
		E oldValue=hopper.data;
		hopper.data=element;
				
		return oldValue;
	}
	
	
	/**
	 * 
	 * @return size of the list
	 */
	public int size() {
		return size;
	}
	
	/**
	 * 
	 * @return the array of list of the objects in the linked list
	 */
	public Object[] toArray() {
		Object[] temp= new Object[size];
		Node<E>	tempNode=head;
		for(int i=0; i<size; i++) {
			temp[i]=tempNode.data;
			tempNode=tempNode.next;
		}
		return temp;
	}
	
	private Node<E> getNode(int index){
		Node<E> hopper=head;
		for(int i=0; i<index;i++) {
			hopper=hopper.next;
		}
		return hopper;
	}
}
