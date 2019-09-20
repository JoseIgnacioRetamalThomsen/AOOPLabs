package it.gmit.sw;

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