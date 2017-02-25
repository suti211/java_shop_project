package bolt.aruk;

public class Aru {

	protected long vonalKod;
	protected String gyarto;
	
	public Aru(long vonalKod, String gyarto) {
		this.vonalKod = vonalKod;
		this.gyarto = gyarto;
	}

	public long getVonalKod() {
		return vonalKod;
	}
	
	public String getGyarto() {
		return gyarto;
	}
}
