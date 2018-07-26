package com.cenfotec.encrypt.main;


import com.cenfotec.encrypt.asymetric.asimetricManager.EncryptManagerAsimetric;
import com.cenfotec.encrypt.symetric.simetricManager.EncryptManagerSimetric;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static EncryptManagerAsimetric encryptManagerAsimetric = new EncryptManagerAsimetric();
	private static EncryptManagerSimetric encryptManagerSimetric = new EncryptManagerSimetric();	
	
	public static void main(String[] args) throws Exception {
		int option = 0;
		do {
    		System.out.println("1.Create asimetric key");
        	System.out.println("2.Asimetric Encript Message");
        	System.out.println("3.Asimetric Decrypt Message");
        	System.out.println("4.Create simetric key");
        	System.out.println("5.Simetric Encript Message");
        	System.out.println("6.Simetric Decrypt Message");
        	System.out.println("7.Exit ");
        	option = Integer.parseInt(br.readLine());
        	if (option >= 1 && option <= 6){
        		executeAction(option);
        	}
    	} while (option != 7);
		
		System.out.println("\nThanks for using this application. Have a good day!");
    	
    }

	private static void executeAction(int option) throws Exception {
		if (option == 1 || option == 4){ 
			System.out.println("Key name: ");
			String name = br.readLine();
			
			if(option == 1) {
				encryptManagerAsimetric.createKey(name);
			}else{
				encryptManagerSimetric.createKey(name);
			}
		}
		if (option == 2 || option == 5){
			System.out.println("Key name: ");
			String name = br.readLine();
			System.out.println("Message name: ");
			String messageName = br.readLine();
			System.out.println("Message: ");
			String message = br.readLine(); 
			
			if(option == 2) {
				encryptManagerAsimetric.encryptMessage(messageName,message,name);
			}else{
				encryptManagerSimetric.encryptMessage(messageName,message,name);
			}
		}
		if (option == 3 || option == 6){
			System.out.println("Key name: ");
			String keyName = br.readLine();
			System.out.println("Message name: ");
			String messageName = br.readLine();
			
			if(option == 3) {
				encryptManagerAsimetric.decryptMessage(messageName, keyName);	
			}else {
				encryptManagerSimetric.decryptMessage(messageName, keyName);
			}
						
		}

	}
}
