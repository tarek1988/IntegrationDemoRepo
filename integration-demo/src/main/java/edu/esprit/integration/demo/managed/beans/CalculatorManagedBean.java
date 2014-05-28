package edu.esprit.integration.demo.managed.beans;

import edu.esprit.integration.demo.integration_demo.CalculatorService;

public class CalculatorManagedBean implements CalculatorService{
	
	public int add (int x , int y){
		return x+y;
	}
	
	public int moins (int x , int y){
		return x-y;
	}
	
	public int  multiple(int x , int y){
		return x*y;
	}
	
	public int soustract (int x , int y){
		return x/y;
	}

}
