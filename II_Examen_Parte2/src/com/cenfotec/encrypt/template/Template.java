package com.cenfotec.encrypt.template;

public interface Template {
	public void createKey(String name) throws Exception;
	public void encryptMessage(String messageName, String message, String keyName) throws Exception;
	public String decryptMessage(String messageName, String keyName) throws Exception;
}
