package Main;

import Adaptador.TurkeyAdapter;
import Ave.WildTurkey;
import Patos.Duck;
import Patos.MallardDuck;

public class DuckTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}
	
	public static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}
