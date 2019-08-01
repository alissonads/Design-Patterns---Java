package Drinks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage{

	@Override
	public void brew(){
		System.out.println("Dripping coffe through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
	
	boolean customerWantsCondiments(){
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")){
			return true;
		}
		
		return false;
	}
	
	private String getUserInput(){
		System.out.println("Would you like milk and sugar with your coffe (y/n)?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String answer = null;
		
		try{
			answer = in.readLine();
		}
		catch(IOException e){
			System.out.println("IO error trying to read your answer");
		}
		
		if(answer == null){
			return "no";
		}
		
		return answer;
	}
}
