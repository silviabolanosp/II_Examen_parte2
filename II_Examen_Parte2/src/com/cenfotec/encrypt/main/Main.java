package com.cenfotec.encrypt.main;


import com.cenfotec.encrypt.asymetric.asimetricManager.EncryptManagerAsimetric;
import com.cenfotec.encrypt.symetric.simetricManager.EncryptManagerSimetric;
import com.cenfotec.encrypt.template.Factory;
import com.cenfotec.encrypt.template.Template;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private static Template encryptor;	
	
	public static void main(String[] args) throws Exception {
		int option = 0;
		do {
    		System.out.println("1. Use asymetric encryption");
        	System.out.println("2. Use symetric encryption");
        	System.out.println("3.Exit ");
        	option = Integer.parseInt(br.readLine());
        	if (option >= 1 && option <= 2){
        		encryptor = Factory.assign(option);
        	}
    	} while (option != 3);
		
		
		option = 0;
		do {
    		System.out.println("1. Create key");
        	System.out.println("2. Encrypt Message");
        	System.out.println("3. Decrypt Message");
        	System.out.println("4.Exit ");
        	option = Integer.parseInt(br.readLine());
        	if (option >= 1 && option <= 3){
        		executeAction(option);
        	}
    	} while (option != 4);
		
		System.out.println("\nThanks for using this application. Have a good day!");
    	
    }

	private static void executeAction(int option) throws Exception {
		if (option == 1 || option == 4){ 
			System.out.println("Key name: ");
			String name = br.readLine();
			
			
			encryptor.createKey(name);
			
				
			
		}
		if (option == 2 || option == 5){
			System.out.println("Key name: ");
			String name = br.readLine();
			System.out.println("Message name: ");
			String messageName = br.readLine();
			System.out.println("Message: ");
			String message = br.readLine(); 
			
			
			encryptor.encryptMessage(messageName,message,name);

		}
		if (option == 3 || option == 6){
			System.out.println("Key name: ");
			String keyName = br.readLine();
			System.out.println("Message name: ");
			String messageName = br.readLine();
			

			encryptor.decryptMessage(messageName, keyName);
			
						
		}

	}
}
