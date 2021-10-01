package adt;

public interface List <E> {
	/**
	 * Appends the element to the end of this list
	 * @param e
	 * @return true
	 */
	public abstract boolean add(E e);
	
	/**
	 * Adds element to a specific index
	 * @param index
	 * @param element
	 */
	public abstract void add(int index, E element);
	
	/**
	 * Adds an element to the array and shifts elements at the index
	 */
	public abstract void clear();
	
	/**
	 * 
	 * @param o
	 * @return boolean true or false if the collection contains that specific object
	 */
	public abstract boolean contains(Object o);
	
	/**
	 * 
	 * @param object
	 * @return true or false for Comparisons if the specified object with the list for equality.
	 */
	public abstract boolean equals(Object o);
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public abstract E get(int index);
	
	/**
	 * @param index
	 * @return the element at the specified position in this list.
	 */
	public abstract int indexOf(Object o);
	
	/**
	 * Returns the index of the first occurrence of the specified element in this list,
	 * or -1 if this list does not contain the element.
	 * @return true or false if the list is empty
	 */
	public abstract boolean isEmpty();
	
	/**
	 * Returns true if this list contains no elements.
	 */
	public abstract int lastIndexOf(Object o);
	
	/**
	 * @param o
	 * @return index of the last occurrence of the last object
	 */
	public abstract E remove(int index);
	
	/**
	 * 
	 * @param o
	 * @return true or false if the object is removed
	 */
	public abstract boolean remove(Object o);
	
	/**
	 * 
	 * @param index
	 * @param element
	 * @return Element
	 */
	public abstract E set(int index, E element);
	
	/**
	 * 
	 * @return size of the list
	 */
	public abstract int size();
	
	/**
	 * 
	 * @return the array list
	 */
	public abstract Object[] toArray();
}
