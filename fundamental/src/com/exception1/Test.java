package com.exception1;

public class Test{	
	
	public static void main(String[] args){
		
		try{
			
			String[] names = {"Jack", "John", "Jill"};
			printNames(names);
			
		}catch(NameIsJohnException e){
			System.out.print("NameIsJohnException ");
		}
	}
	
	private static void printNames(String[] names) throws NameIsJohnException{
		for(String name : names){
			if(name.equals("John"))
				throw new NameIsJohnException("Name cannot be John ");
			
			System.out.print(name + " ");
		}
	}
}

class NameIsJohnException{
	String message;
	
	public NameIsJohnException(){
		
	}
	public NameIsJohnException(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}

}