package concrete;

import java.util.Iterator;

public class NullIterator implements Iterator {

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(){
		throw new UnsupportedOperationException();
	}
}
