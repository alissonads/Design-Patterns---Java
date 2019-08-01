package Adaptador;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration {

	private Iterator iterator;
	
	public IteratorEnumeration(Iterator iterator){
		this.iterator = iterator;
	}
	
	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return iterator.hasNext();
	}

	@Override
	public Object nextElement() {
		// TODO Auto-generated method stub
		return iterator.next();
	}

}
