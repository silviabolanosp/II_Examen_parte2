package com.cenfotec.encrypt.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.cenfotec.encrypt.MD5.MD5Manager.EncryptManagerMD5;
import com.cenfotec.encrypt.symetric.simetricManager.EncryptManagerSimetric;


class test {

//	@Test
//	public void test1() throws Exception {
//		EncryptManagerSimetric symetric = new EncryptManagerSimetric();
//		symetric.createKey("llave simetrica");
//		symetric.encryptMessage("mjs name", "mjs simetrica", "llave simetrica");
//		assertEquals("mjs simetrica", symetric.decryptMessage("mjs name", "llave simetrica"));
//
//	}
	
	@Test
	public void testEncriptacionMD5_1() throws Exception {
		assertEquals("G8hiLjJ8999/IpeRTrnBbX71HSiPFzGo9jV8DvZ/zMo=", EncryptManagerMD5.Encriptar("segundo examen de patrones", "llave MD5"));
	}
	
	@Test
	public void testDesencriptacionMD5_1() throws Exception {
		assertEquals("segundo examen de patrones", EncryptManagerMD5.Desencriptar("G8hiLjJ8999/IpeRTrnBbX71HSiPFzGo9jV8DvZ/zMo=", "llave MD5"));
	}
	
	@Test
	public void testEncriptacionMD5_2() throws Exception {
		assertEquals("NNlP2+A2Hw4=", EncryptManagerMD5.Encriptar("hola", "llave"));
	}
	
	@Test
	public void testDesencriptacionMD5_2() throws Exception {
		assertEquals("hola", EncryptManagerMD5.Desencriptar("NNlP2+A2Hw4=", "llave"));
	}

}
