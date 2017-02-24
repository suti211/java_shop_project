package bolt;

import java.util.Date;

public abstract class Elelmiszer {
	
	protected long vonalKod;
	protected String gyarto;
	protected Date szavatossagiIdo;
	
	public String getGyarto() {
		return gyarto;
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
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
		return "Elelmiszer [vonalKod=" + vonalKod + ", gyarto=" + gyarto + ", szavatossagiIdo=" + szavatossagiIdo + "]";
	}
	
	

}
