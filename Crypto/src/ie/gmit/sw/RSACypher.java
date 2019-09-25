package ie.gmit.sw;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class RSACypher extends AbstractCypher {

	private KeyPair keyRing;

	public RSACypher() throws NoSuchAlgorithmException, NoSuchPaddingException {
		super(Cipher.getInstance("RSA/ECB/PKCS1Padding"));
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(2048);
		keyRing = keyGen.generateKeyPair();
		//setCypher(Cipher.getInstance("RSA/ECB/PKCS1Padding"));
	}

	public byte[] encrypt(byte[] plainText) throws Throwable {
		return encrypt(plainText, keyRing.getPublic());
	}

	public byte[] decrypt(byte[] cypherText) throws Throwable {
		return decrypt(cypherText, keyRing.getPrivate());
	}
}
