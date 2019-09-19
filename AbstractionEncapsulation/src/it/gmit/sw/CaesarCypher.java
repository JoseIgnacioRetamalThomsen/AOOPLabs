package it.gmit.sw;

public class CaesarCypher implements CypherKey, Cypherator{

	private CypherKey key;

	
	public CaesarCypher(int key) {
		super();
		this.key = new CypherKeyImpl(key);
	}


	public void setKey(String key) throws CypherException {
		this.key.setKey(key);
	}


	public String getKey() {
		return key.getKey();
	}

	@Override
	public String encrypt(String plainText) throws CypherException {
		return new String(encrypt(plainText.getBytes(),true));
	}

	
	/*
	 * @Override public byte[] encrypt(byte[] plainText) throws CypherException {
	 * for (int i = 0; i < plainText.length; i++) { plainText[i] = (byte)
	 * (plainText[i] - Integer.parseInt(getKey())); } return plainText; }
	 */
	@Override
	public String decrypt(String cypherText) throws CypherException {
		return new String(encrypt(cypherText.getBytes(),false));
	}

	/*
	 * @Override public byte[] decrypt(byte[] cypherText) throws CypherException {
	 * for (int i = 0; i < cypherText.length; i++) { cypherText[i] = (byte)
	 * (cypherText[i] -Integer.parseInt(getKey())); } return cypherText; }
	 */

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();

	}

	public class CypherKeyImpl implements CypherKey {

		public CypherKeyImpl(int key) {
			super();
			this.key = key;
		}

		private int key;
		
		@Override
		public void setKey(String key) throws CypherException {
			this.key = Integer.parseInt(key);

			
		}

		@Override
		public String getKey() {
		
			return new String(key + "");
		}

	}

	@Override
	public byte[] encrypt(byte[] cypherText, boolean isEncrypt) {
		for (int i = 0; i < cypherText.length; i++)
		{
			cypherText[i] = isEncrypt ? 
					(byte)(cypherText[i] -Integer.parseInt(getKey())):
						(byte)(cypherText[i] +Integer.parseInt(getKey()));
		}
		return cypherText;
	}

	



	
	

}
