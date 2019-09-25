package ie.gmit.sw;

public class Runner {

	public static void main(String[] args) throws Throwable {
		CypherFactory cf = CypherFactory.getInstance();
		Cypherable cypher = cf.getCypher(CypherMode.Asymmetric);

		String s = "ATTACK THE CASTLE WALL AFTER A TEA.";
		byte[] t = cypher.encrypt(s.getBytes());
		System.out.println(new String(t));
		System.out.println(new String(cypher.decrypt(t)));

	}

}
