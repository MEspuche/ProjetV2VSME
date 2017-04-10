package metier;

import java.util.Collection;

public class Placement {

	private Patrimoine patrimoine;
	private  int idPlacement;
	private Localisation localisationPlacement;

	public Placement(Patrimoine patrimoine) {
		super();
		this.patrimoine = patrimoine;
		Collection<Placement> col = patrimoine.getPlacements();
		idPlacement=col.size()+1;
	
	}
	
	
	
	public Localisation getLocalisationPlacement() {
		return localisationPlacement;
	}


	public void setLocalisationPlacement(Localisation localisationPlacement) {
		this.localisationPlacement = localisationPlacement;
	}


	public void setIdPlacement(int idPlacement) {
		this.idPlacement = idPlacement;
	}


	public Placement(Patrimoine patrimoine, int idPlacement, Localisation localisationPlacement) {
		super();
		this.patrimoine = patrimoine;
		this.idPlacement = idPlacement;
		this.localisationPlacement = localisationPlacement;
	}


	public Placement() {
		super();
		Collection<Placement> col = patrimoine.getPlacements();
		idPlacement=col.size()+1;
		
	}

		
	public int getIdPlacement() {
		return idPlacement;
	}

	

	public Patrimoine getPatrimoine() {
		return patrimoine;
	}

	public void setPatrimoine(Patrimoine patrimoine) {
		this.patrimoine = patrimoine;
	}

	@Override
	public String toString() {
		return "Placement [patrimoine=" + patrimoine + ", idPlacement=" + idPlacement + "]";
	}

	
	
	
}
