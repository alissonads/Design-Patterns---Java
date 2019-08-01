package Abstracts;

import java.util.ArrayList;
import java.util.List;

import Interfaces.Observer;
import Interfaces.Subject;

public abstract class AbstractSubject implements Subject {

	protected List<Observer> observers;
	private boolean change;
	
	public AbstractSubject(){
		super();
		observers = new ArrayList<>();
		change = false;
	}
	
	/*adiciona um observador na lista*/
	public void registerObserver(final Observer obs){
		if (obs == null)
            throw new NullPointerException();
		
		if(!observers.contains(obs))
			observers.add(obs);
	}
	
	/*remove um observador da lista*/
	public void removeObserver(final Observer obs){
		observers.remove(obs);
	}
	
	/*notifica todos os observadores quando o estado for alterado*/
	public void notifyObservers(){
		notifyObservers(null);
	}
	
	/*notifica todos os observadores quando o estado for alterado,
	 * passando os parametros de mudança
	 * */
	public void notifyObservers(final Object ...args){
		if(!change)
			return;
		
		for(Observer o : observers){
			o.update(this, args);
		}
	}
	
	public void bind(){
		change = true;
	}
	
	public void unbind(){
		change = false;
	}
	
	public boolean getChange(){
		return change;
	}
	
	public int countObservers(){
		return observers.size();
	}
	
	public abstract void apply();

}
