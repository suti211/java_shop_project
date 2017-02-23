package bolt;

import java.util.Date;

public class Tej {
	
	private final int LITER = 10;
	private final int FELLITER = 5;
	private final int POHAR = 2;
	
	private final double ZSIROS = 2.8;
	private final double FELZSIROS = 1.5;
	
	private long vonalKod;
	private int urtartalom;
	private String gyarto;
	private Date szavatossagiIdo;
	private double zsirtartalom;
	private long ar;

	public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar) {
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
		this.vonalKod = vonalKod;
	}

	public int getUrtartalom() {
		return urtartalom;
	}

	public String getGyarto() {
		return gyarto;
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

	public long getVonalKod() {
		return vonalKod;
	}

	public long getAr() {
		return ar;
	}
	
	public boolean joMeg(){
		Date today = new Date();
		if(today.after(szavatossagiIdo)){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	public String toString() {
		return "Tej [vonalkod=" + vonalKod + ", urtartalom=" + urtartalom + ", gyarto=" + gyarto + ", szavatossagiIdo=" + szavatossagiIdo
				+ ", zsirtartalom=" + zsirtartalom + ", ar=" + ar + "]";
	}
	
	
	
	

}
