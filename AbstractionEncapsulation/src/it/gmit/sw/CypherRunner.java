package it.gmit.sw;

public class CypherRunner {
	public static void main(String[] args) throws CypherException {

		VernamCypher cc = new VernamCypher(7);
	
		String message = "Go for it ^765$%%$ �";
		String enc = cc.encrypt(message);
		
		System.out.println(enc.toString());
		
		System.out.println(cc.decrypt(enc));
	}
}
