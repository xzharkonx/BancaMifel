package com.banca.mifel.models.services;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.stereotype.Service;

@Service
public class CodificacionService implements ICodificacionService {
	
	
	private byte[] secretKey = "abcdefghijklmnopqrstuvwxyz012345".getBytes();
    private String initVector = "????????????????";

	@Override
	public byte[] codificar(byte[] cadena) {

	    try {
	        String iv = new String(this.initVector).substring(0, 16);

	        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");

	        byte[] dataBytes = cadena;
	        int plaintextLength = dataBytes.length;
	        byte[] plaintext = new byte[plaintextLength];
	        System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);

	        SecretKeySpec keyspec = new SecretKeySpec(secretKey, "AES");
	        IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());

	        cipher.init(Cipher.ENCRYPT_MODE, keyspec, ivspec);
	        byte[] encrypted = cipher.doFinal(plaintext);

	        return new String(Base64.getEncoder().encode(encrypted)).getBytes();

	      } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	      }
	}


}
