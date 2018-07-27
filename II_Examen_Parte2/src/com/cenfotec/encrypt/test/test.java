package com.cenfotec.encrypt.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.cenfotec.encrypt.symetric.simetricManager.EncryptManagerSimetric;


class test {

	@Test
	public void test1() throws Exception {
		EncryptManagerSimetric symetric = new EncryptManagerSimetric();
		symetric.createKey("llave simetrica");
		symetric.encryptMessage("mjs name", "mjs simetrica", "llave simetrica");
		assertEquals("mjs simetrica", symetric.decryptMessage("mjs name", "llave simetrica"));

	}

}
