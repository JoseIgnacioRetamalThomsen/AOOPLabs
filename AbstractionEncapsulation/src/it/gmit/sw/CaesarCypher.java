package it.gmit.sw;

public class CaesarCypher extends AbstractCypher {

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
	public byte[] encrypt(byte[] cypherText, boolean isEncrypt) {
		for (int i = 0; i < cypherText.length; i++) {
			cypherText[i] = isEncrypt ? (byte) (cypherText[i] - Integer.parseInt(getKey()))
					: (byte) (cypherText[i] + Integer.parseInt(getKey()));
		}
		return cypherText;
	}

}
