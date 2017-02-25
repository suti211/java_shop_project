package bolt.aruk;

import java.util.Hashtable;
import java.util.Map;
import bolt.Aru;
import bolt.aruk.sajt.Sajt;

public class Bolt {
	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable<Class<? extends Aru>, BoltBejegyzes> elelmiszerpult;

	public Bolt(String nev, String cim, String tulajdonos,
			Hashtable<Class<? extends Aru>, BoltBejegyzes> elelmiszerpult) {
		super();
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.elelmiszerpult = elelmiszerpult;
	}

	public Bolt(String nev, String cim, String tulajdonos) {
		super();
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
	}

	public String getNev() {
		return nev;
	}

	public String getCim() {
		return cim;
	}

	public String getTulajdonos() {
		return tulajdonos;
	}

	public boolean vanMegTej() {
		return vanMegAdottAru(Tej.class);
	}

	public boolean vanMegSajt() {
		return vanMegAdottAru(Sajt.class);
	}

	private boolean vanMegAdottAru(Class<? extends Aru> c) {

		int aruszam = 0;

		for (Class<? extends Aru> cls : elelmiszerpult.keySet()) {
			if (cls.getName().equals(c.getName())) {
				if (elelmiszerpult.get(cls).mennyiseg > 0) {
					return true;
				} else {
					return false;
				}
			}
		}

		if (aruszam > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void vasarolElelmiszert(Long vonalKod, long mennyiseg) {

		for (Map.Entry<Class<? extends Aru>, BoltBejegyzes> entry : elelmiszerpult.entrySet()) {
			Aru a = entry.getValue().getAru();
			Long vk = new Long(a.getVonalKod());

			if (vonalKod == vk) {
				entry.getValue().levonMennyiseg(mennyiseg);
			}
		}
	}

	public void feltoltElelmiszerrel(Long vonalKod, Long mennyiseg) {

		for (Map.Entry<Class<? extends Aru>, BoltBejegyzes> entry : elelmiszerpult.entrySet()) {
			Aru a = entry.getValue().getAru();
			Long vk = new Long(a.getVonalKod());

			if (vonalKod == vk) {
				entry.getValue().adMennyiseg(mennyiseg);
			}
		}

	}

	public void feltoltUjElelmiszerrel(Elelmiszer e, long mennyiseg, long ar) {
		elelmiszerpult.put(e.getClass(), new BoltBejegyzes(e, ar, mennyiseg));

	}

	class BoltBejegyzes {

		private Aru a;
		private long ar;
		private long mennyiseg;

		public BoltBejegyzes(Aru a, long ar, long mennyiseg) {
			this.a = a;
			this.ar = ar;
			this.mennyiseg = mennyiseg;
		}

		public Aru getAru() {
			return a;
		}

		public void setAru(Aru a) {
			this.a = a;
		}

		public long getMennyiseg() {
			return mennyiseg;
		}

		public void setMennyiseg(long mennyiseg) {
			this.mennyiseg = mennyiseg;
		}

		public void adMennyiseg(long mennyiseg) {
			this.mennyiseg += mennyiseg;
		}

		public void levonMennyiseg(long mennyiseg) {
			this.mennyiseg -= mennyiseg;
		}

		public long getAr() {
			return ar;
		}

		public void setAr(long ar) {
			this.ar = ar;
		}

	}

}
