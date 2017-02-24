package bolt;

import java.util.Hashtable;
import java.util.Map;

public class Bolt {
	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable<Tej, Long> tejpult;

	public Bolt(String nev, String cim, String tulajdonos, Hashtable<Tej, Long> tejpult) {
		super();
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.tejpult = tejpult;
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
		if (tejpult.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public Tej vasarolTej(Long vonalKod) throws Exception{
		Tej tej = null;
		if(tejpult.containsValue(vonalKod)){
			for(Map.Entry entry : tejpult.entrySet()){
				if(vonalKod.equals(entry.getValue())){
					tej = (Tej)entry.getKey();
					tejpult.remove(entry.getKey());
					break;
				}
			}		
		}
		else{
			throw new Exception("Nincs ilyen tej");
		}
		return tej;
		
	}

	public void feltoltTej(Tej m) {
		tejpult.put(m, m.getVonalKod());
	}
	
	class BoltBejegyzes{
		
		private Tej t;
		private int ar;
		private int mennyiseg;
		
		public BoltBejegyzes(Tej t, int ar, int mennyiseg) {
			this.t = t;
			this.ar = ar;
			this.mennyiseg = mennyiseg;
		}

		public Tej getT() {
			return t;
		}

		public void setT(Tej t) {
			this.t = t;
		}

		public int getAr() {
			return ar;
		}

		public void setAr(int ar) {
			this.ar = ar;
		}

		public int getMennyiseg() {
			return mennyiseg;
		}

		public void setMennyiseg(int mennyiseg) {
			this.mennyiseg = mennyiseg;
		}
		
		public void adMennyiseg(int mennyiseg){
			this.mennyiseg += mennyiseg;
		}
		
		public void levonMennyiseg(int mennyiseg){
			this.mennyiseg -= mennyiseg;
		}
		
		
	}

}
