package bolt.aruk.sajt;

import java.util.Date;

import bolt.aruk.Elelmiszer;

public abstract class Sajt extends Elelmiszer {

	public Sajt(Long vonalKod, String gyarto, Date szavatossagiIdo) {
		super(vonalKod, gyarto, szavatossagiIdo);
	}

}
