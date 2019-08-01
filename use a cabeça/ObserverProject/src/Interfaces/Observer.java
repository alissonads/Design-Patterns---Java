package Interfaces;

public interface Observer {
	public void update(final Subject subject, 
					   final Object ...args);
}
