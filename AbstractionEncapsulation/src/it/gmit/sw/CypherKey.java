package it.gmit.sw;

public interface CypherKey {
	void setKey(String key) throws CypherException;

	String getKey();
}