package bolt;

import java.util.Vector;

public class Bolt {
	private String nev;
	private String cim;
	private String tulajdonos;
	private Vector<Tej> tejpult;

	public Bolt(String nev, String cim, String tulajdonos, Vector<Tej> tejpult) {
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
	
	public Tej vasarolTej(Tej m){
		tejpult.removeElement(m);
		return m;
		
	}
	
	public void feltoltTej(Tej m){
		tejpult.addElement(m);
	}

}
