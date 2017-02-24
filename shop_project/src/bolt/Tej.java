package bolt;

import java.util.Date;

public abstract class Tej {
	
	public final int LITER = 10;
	public final int FELLITER = 5;
	public final int POHAR = 2;
	
	public final double ZSIROS = 2.8;
	public final double FELZSIROS = 1.5;
	
	protected long vonalKod;
	protected int urtartalom;
	protected String gyarto;
	protected Date szavatossagiIdo;
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
				+ ", zsirtartalom=" + zsirtartalom + "]";
	}
	
	
	
	

}
