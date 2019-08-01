package Interfaces;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
	/*adiciona um observador na lista*/
	public void registerObserver(final Observer obs);
	
	/*remove um observador da lista*/
	public void removeObserver(final Observer obs);
	
	/*notifica todos os observadores quando o estado for alterado,
	 * passando os parametros de mudança
	 * */
	public void notifyObservers(final Object ...args);
	
}
