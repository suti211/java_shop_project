package bolt.aruk;

import java.util.Date;
import bolt.Aru;

public abstract class Elelmiszer extends Aru {

	protected Date szavatossagiIdo;

	public Elelmiszer(long vonalKod, String gyarto, Date szavatossagiIdo) {
		super(vonalKod, gyarto);
		this.szavatossagiIdo = szavatossagiIdo;
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	public boolean joMeg() {
		Date today = new Date();
		if (today.after(szavatossagiIdo)) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Elelmiszer [vonalKod=" + vonalKod + ", gyarto=" + gyarto + ", szavatossagiIdo=" + szavatossagiIdo + "]";
	}

}
