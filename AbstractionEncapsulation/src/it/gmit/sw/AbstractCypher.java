package it.gmit.sw;

public abstract class AbstractCypher implements Cypherator {

	@Override
	public String encrypt(String plainText) throws CypherException {
		return new String(encrypt(plainText.getBytes()));
	}

	@Override
	public byte[] encrypt(byte[] plainText) throws CypherException {
		return encrypt(plainText, true);
	}

	@Override
	public String decrypt(String cypherText) throws CypherException {
		return new String(decrypt(cypherText.getBytes()));
	}

	@Override
	public byte[] decrypt(byte[] cypherText) throws CypherException {
		return encrypt(cypherText, false);
	}

	/*
	 * Must be implemented for each type of cypher.
	 */
	public abstract byte[] encrypt(byte[] cypherText, boolean isEncrypt);

}
