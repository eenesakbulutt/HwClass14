package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		
		//HW14 
		
		
//Accept username, password and confirm password from a user and check following requirements:
//Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
//Password should be minimum 8 characters, if less → message=”Password is too short”.
//Password cannot contain username if so, → message=”Password cannot contain username”.
//Password should match confirmed password, if not  → message=“Passwords do not match”.
//Only after all requirements met → message “Your username and password has been created”

		String username="Zuradaaaadf";
        String password="wwdw32224t24f";
        String confirmPassword="sdfgbk";
        
        if(!(username.isEmpty() || password.isEmpty())) {
        	
        	System.out.println("User name and password are not empty");
        
        	if(password.length()>=8) {
        		
        	if(!password.contains(username)) {
        		
        	if(password.equals(confirmPassword)) {	
        		System.out.println("Your username and password has been created");
        	}else {
        		System.out.println("Paswords do not match");
        	}
        		
        		
        		
        	}else {
        		System.out.println("Password can not contain username");
        	}
        		
        		
        		
        		
        	}else {
        		System.out.println("Password is too short ");
        	}
        	
        	
        	
        	
        	
        	
        	
        	
        }else {
    
        	System.out.println("Username and Password can not be empty");
        	
        }
		
		
		
		
		
		
		
		
		
		
	}

}
