package com.cenfotec.encrypt.template;

import com.cenfotec.encrypt.asymetric.asimetricManager.EncryptManagerAsimetric;
import com.cenfotec.encrypt.symetric.simetricManager.EncryptManagerSimetric;

public class Factory {
	public static Template assign(int option) {
		if (option == 1) {
			return new EncryptManagerAsimetric();
		}
		if(option == 2) {
			return new EncryptManagerSimetric();
		}
		return null;
	}
}
