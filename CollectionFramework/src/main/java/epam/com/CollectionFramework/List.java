package epam.com.CollectionFramework;

import java.util.Arrays;

public class List<T> {
	
	private int Size = 0;
	private static final int InitialSIZE = 10;
	private Object list[];
	
	public List() {
		list = new Object[InitialSIZE];
    }
	
	public void add(T t) {
		if (Size == list.length) {
            Capacity();
        }
		list[Size++] = t;
    }
	
	public int size() {
		return Size;
	}
	
	public T remove(int i) {
	    if (i > Size || i < 0) {
	        throw new IndexOutOfBoundsException("Of index: " + i + "& size =" + i);
	    }
	    Object item = list[i];
	    int remitem = list.length - (i) ;
	    System.arraycopy( list, i , list, i-1, remitem ) ;
	    Size--;
	    return (T) item;
	}
	 
	public T get(int i) {
		if (i > Size || i < 0) {
	        throw new IndexOutOfBoundsException("Of index: " + i + "& size " + i);
	    }
		return (T) list[i-1];
	}
	 
	private void Capacity() {
        int expSize = list.length * 2;
        list = Arrays.copyOf(list, expSize);
    }
	
	@Override
	public String toString() {
		String s= "[";
	    for(int i = 0; i < Size ;i++) {
	    	s += list[i].toString();
	        	if(i < Size-1){
	                 s += " , ";
	             }
	         }
	         s += ']';
	         return s;
	    }
	
}