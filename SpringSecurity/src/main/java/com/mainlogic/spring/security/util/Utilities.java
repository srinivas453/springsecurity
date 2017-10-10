package com.mainlogic.spring.security.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utilities {

	public static void main(String[] args) throws NoSuchAlgorithmException {

		System.out.println(hash256("test"));
	}
	
	public static String hash256(String data) throws NoSuchAlgorithmException {

		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(data.getBytes());

		StringBuffer result = new StringBuffer();

		for (byte byt : md.digest())
			result.append(Integer.toString((byt & 0xff) + 0x100, 16).substring(1));

		return result.toString();
	}
}