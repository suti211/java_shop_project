package bolt;

import java.util.Hashtable;
import java.util.Map;

public class Bolt {
	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable<Class<? extends Elelmiszer>, BoltBejegyzes> elelmiszerpult;

	public Bolt(String nev, String cim, String tulajdonos,
			Hashtable<Class<? extends Elelmiszer>, BoltBejegyzes> elelmiszerpult) {
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

	private boolean vanMegAdottAru(Class<? extends Elelmiszer> c) {

		int aruszam = 0;

		for (Class<? extends Elelmiszer> cls : elelmiszerpult.keySet()) {
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

	public void vasarolElelmiszert(Long vonalKod, long mennyiseg) throws Exception {
		
		for (Map.Entry<Class<? extends Elelmiszer>, BoltBejegyzes> entry : elelmiszerpult.entrySet()) {
			Elelmiszer e = entry.getValue().getElelmiszer();
			Long vk = new Long(e.vonalKod);

			if (vonalKod == vk) {
				entry.getValue().levonMennyiseg(mennyiseg);
			}
		}
	}

	public void feltoltElelmiszerrel(Long vonalKod, Long mennyiseg) {

		for (Map.Entry<Class<? extends Elelmiszer>, BoltBejegyzes> entry : elelmiszerpult.entrySet()) {
			Elelmiszer e = entry.getValue().getElelmiszer();
			Long vk = new Long(e.vonalKod);

			if (vonalKod == vk) {
				entry.getValue().adMennyiseg(mennyiseg);
			}
		}

	}

	public void feltoltUjElelmiszerrel(Elelmiszer e, long mennyiseg, long ar) {
		elelmiszerpult.put(e.getClass(), new BoltBejegyzes(e, ar, mennyiseg));

	}

	class BoltBejegyzes {

		private Elelmiszer e;
		private long ar;
		private long mennyiseg;

		public BoltBejegyzes(Elelmiszer e, long ar, long mennyiseg) {
			this.e = e;
			this.ar = ar;
			this.mennyiseg = mennyiseg;
		}

		public Elelmiszer getElelmiszer() {
			return e;
		}

		public void setElelmiszer(Elelmiszer e) {
			this.e = e;
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
