package com.cenfotec.encrypt.main;


import com.cenfotec.encrypt.MD5.MD5Manager.EncryptManagerMD5;
import com.cenfotec.encrypt.template.Factory;
import com.cenfotec.encrypt.template.Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private static Template encryptor;	
	
	public static void main(String[] args) throws Exception {
		int option = 0;
		do {
    		System.out.println("1. Use asymetric encryption");
        	System.out.println("2. Use symetric encryption");
        	System.out.println("3. Use MD5 encryption");
        	System.out.println("4.Exit ");
        	option = Integer.parseInt(br.readLine());
        	if (option >= 1 && option <= 2){
        		encryptor = Factory.assign(option);
        		menu();
        		
        	}
        	if(option == 3) {
        		menuMD5();
        	}
    	} while (option != 4);
		
		
		
		
		System.out.println("\nThanks for using this application. Have a good day!");
    	
    }

	private static void menu() throws IOException, Exception {
		int option = 0;
		do {
    		System.out.println("1. Create key");
        	System.out.println("2. Encrypt Message");
        	System.out.println("3. Decrypt Message");
        	System.out.println("4. Return");
        	option = Integer.parseInt(br.readLine());
        	if (option >= 1 && option <= 3){
        		executeAction(option);
        	}
    	} while (option != 4);
	}
	
	private static void menuMD5() throws IOException, Exception {
		
		int option = 0;
		String encriptado = "";
		System.out.println("Create key");
        String key = br.readLine();   
		do {		
        	System.out.println("1. Encrypt Message");
        	System.out.println("2. Decrypt Message");
        	System.out.println("3. Return");
        	
        	option = Integer.parseInt(br.readLine());
        	if (option >= 1 && option <= 2){
        		if (option == 1){
        			System.out.println("Message: ");
        			String message = br.readLine(); 
        			
        			encriptado = EncryptManagerMD5.Encriptar(message, key);
        	        System.out.println(encriptado);

        		}
        		if (option == 2){	
        			String desencriptado = EncryptManagerMD5.Desencriptar(encriptado, key);
        	        System.out.println("El mensaje era: " + desencriptado);

        		}
        	}
    	} while (option != 3);
	}

	private static void executeAction(int option) throws Exception {
		if (option == 1){ 
			System.out.println("Key name: ");
			String name = br.readLine();
			
			encryptor.createKey(name);	
			
		}
		if (option == 2){
			System.out.println("Key name: ");
			String name = br.readLine();
			System.out.println("Message name: ");
			String messageName = br.readLine();
			System.out.println("Message: ");
			String message = br.readLine(); 
			
			
			encryptor.encryptMessage(messageName,message,name);

		}
		if (option == 3){
			System.out.println("Key name: ");
			String keyName = br.readLine();
			System.out.println("Message name: ");
			String messageName = br.readLine();			

			System.out.println("El mensaje era: " + encryptor.decryptMessage(messageName, keyName));
						
		}

	}
}
