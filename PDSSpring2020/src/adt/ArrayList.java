package adt;

public class ArrayList<E> implements List<E>{
	
	private Object[] myArray;
	private int size;
		
	public ArrayList(){
		this(10);
	}
	
	public ArrayList(int initialCapacity ){
		myArray= new Object[initialCapacity];
		size=0;
	}
	
	public boolean add(E e){
		// TODO Auto-generated method stub
			if(size==myArray.length) {
				boolean fits = ensureCapacity();
				if(!fits) {
					return false;
				}
			}
			myArray[size]=e;
			size++;
			return true;
	}

	public void add(int index, E element) {
		// TODO Auto-generated method stub
		if(size==myArray.length) {
			boolean fits = ensureCapacity();
			if(!fits) 
				return;
		}
			for (int i=size-1; i>=index;i--) {
				myArray[i+1]=myArray[i];
			}
			myArray[index]=element;
			size++;
		
	}

	public void clear() {
		// TODO Auto-generated method stub
		for(int i=0; i<size; i++) {
			myArray[i]=null;
		}
		size=0;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
			boolean temp=false;
			for(int i=0; i<size; i++) {
				if(myArray[i].equals(o)) {
					temp=true;
				}
			}
			return temp;
	}
	
	public boolean equals(Object o) {
		if(o instanceof ArrayList) {
			return true;
		}
		else {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public E get(int index){
		if(index<size)
			return (E)myArray[index];
		else
			return null;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
			int temp=-1;
			for(int i =0; i<size; i++) {
				if(myArray[i].equals(o)) {
					temp=i;
					break;
				}
			}
			return temp;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(size==0)	
			return true;
		else
			return false;
	}

	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
			int temp=-1;
			for(int i=size-1; i>=0; i--) {
				if(myArray[i].equals(o)) {
					temp=i;
					break;
				}
			}
			return temp;
	}

	public E remove(int index) {
		// TODO Auto-generated method stub
			myArray[index]=null;
			size-=1;
			for(int i=index; index<size; index++) {	
					myArray[i]=myArray[i+1];
				
			}
		return null;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
			for(int i=0; i<size; i++) {
				if(myArray[i].equals(o)) {
					myArray[i]=null;
					size-=1;
					for(int j=i; j<size; j++) {
						myArray[j]=myArray[j+1];
					}
				}
			}
			return true;		
	}

	public E set(int index, E element){
		// TODO Auto-generated method stub
		try {
			if(!myArray[index].equals(null)) {
				myArray[index]=element;
			}
			else {
				myArray[index]=element;
				size+=1;
			}
		}
		catch(Exception error) {
			System.out.println("Invalid input");
		}
		return null;
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		Object[] temp= new Object[size];
		for(int i=0; i<size; i++) {
			temp[i]= myArray[i];
		}
		return temp;
	}
	
	public void reverse() {
		Object temp;
		int last=(size-1);
		for (int i=0; i<size/2; i++) {
			temp=myArray[i];
			myArray[i]=myArray[last];
			myArray[last]=temp;
			last--;
		}	
	}
	
	public List<E> removeSubList(E element){
    	ArrayList<E> subList= new ArrayList<>();
    	while(contains(element)) {
    		remove(indexOf(element));
    		subList.add(element);
    	}
    	return subList;
    }
	
	private boolean ensureCapacity() {
		if(size==Integer.MAX_VALUE)
			return false;
		else {
			int oldCapacity=myArray.length;
			int newCapacity= oldCapacity*2;
		
			if(newCapacity<0)
				newCapacity=Integer.MAX_VALUE; 
		
			Object[] temp= new Object[newCapacity];
			for(int i=0; i<size; i++) {
				temp[i]=myArray[i];
			}
				myArray=temp;
				return true;
		}
	}
}
