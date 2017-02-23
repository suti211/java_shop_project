package bolt;

import java.util.Date;

public class Tej {

	private int urtartalom;
	private String gyarto;
	private Date szavatossagiIdo;
	private double zsirtartalom;
	private long ar;

	public Tej(int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar) {
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
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
		return "Tej [urtartalom=" + urtartalom + ", gyarto=" + gyarto + ", szavatossagiIdo=" + szavatossagiIdo
				+ ", zsirtartalom=" + zsirtartalom + ", ar=" + ar + "]";
	}
	
	
	
	

}
