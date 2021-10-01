package adt;

public class SinglyLinkedList<E> implements List<E> {
	private Node<E> head;
	private int size;
	
	public SinglyLinkedList() {
		head=null;
		size=0;
	}
	

	public boolean add(E e) {
		Node<E> toAdd= new Node<>(e);
		if(head==null) {
			head=toAdd;
		}
		
		else {
			Node<E> hopper=head;
			while(hopper.next !=null) {
				hopper=hopper.next;
			}
			hopper.next=toAdd;
		}
		size++;
		return true;
	}
	
	public void add(int index, E element) {
		Node<E> toAdd=new Node<>(element);
		if(size==0 && index==0) {
			head=toAdd;	
		}
		else if(index==0) {
			toAdd.next=head;
			head=toAdd;
		}
		else if(index==1) {
			Node<E> hopper=head;
			toAdd.next=hopper.next;
			hopper.next=toAdd;
		}
		else {
			Node<E> prev= getNode(index-1);
			toAdd.next=prev.next;
			prev.next=toAdd;
			
		}
		size++;
	}
	
	public void clear() {
		head=null;
		size=0;
	}
	
	public boolean contains(Object o) {
		boolean isThere=false;
		 Node<E> temp=head;
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
	
	public boolean equals(Object o) {
		if(o instanceof SinglyLinkedList) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public E get(int index) {
		Node<E> hopper=head;
		for(int i=0; i<index; i++) {
			hopper=hopper.next;
		}
		return hopper.data;
	}
	
	public int indexOf(Object o) {
		Node<E> hopper=head;
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
	 
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		else {
			return false;
		}
	}

	public int lastIndexOf(Object o) {
		Node<E> hopper=head;
		int temp=-1;
		if(o==null) {
			for(int i=0; i<size; i++) {
				if(hopper.data==o) {
					temp=i;
				}
				hopper=hopper.next;
			}			
		}
		else {
			for(int i=0; i<size; i++) {
				if(hopper.data.equals(o)) {
					temp=i;
				}
				hopper=hopper.next;
			}			
		}
		
		return temp;
	}
	
	public E remove(int index) {
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException("IndexOutOfBound");
		}
		else if(index==0) {
			head=head.next;
		}
		else{
			Node<E> temp= getNode(index-1);
			Node<E> toRemove=temp.next;
			temp.next=temp.next.next;
			toRemove.next=null;
			toRemove.data=null;
		}
		size-=1;
		return null;
	}
	
	public boolean remove(Object o) {
		if(o==null) {
			Node<E> temp=head;
			for(int i=0; i<size; i++) {
				if(temp.data==o) {
					remove(i);
				}
				temp=temp.next;	
			}
		}
		else {
			Node<E> temp=head;
			for(int i=0; i<size; i++) {
				if(temp.data.equals(o)) {
					remove(i);
				}
				temp=temp.next;
			}
		}
		return true;
	}
	
	public E set(int index, E element) {
		Node<E> hopper= head;
		for(int i=0; i<index;i++) {
			hopper=hopper.next;
		}
		E oldValue=hopper.data;
		hopper.data=element;
				
		return oldValue;
	}
	
	
	public int size() {
		return size;
	}
	
	
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
