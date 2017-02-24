package bolt;

import java.util.Date;

public abstract class Tej extends Elelmiszer{
	
	public final int LITER = 10;
	public final int FELLITER = 5;
	public final int POHAR = 2;
	
	public final double ZSIROS = 2.8;
	public final double FELZSIROS = 1.5;
	
	protected int urtartalom;
	protected double zsirtartalom;

	public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
		this.vonalKod = vonalKod;
	}

	public int getUrtartalom() {
		return urtartalom;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}
	
	@Override
	public String toString() {
		return "Tej [vonalkod=" + vonalKod + ", urtartalom=" + urtartalom + ", gyarto=" + gyarto + ", szavatossagiIdo=" + szavatossagiIdo
				+ ", zsirtartalom=" + zsirtartalom + "]";
	}
	
	
	
	

}
