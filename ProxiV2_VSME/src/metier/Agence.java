package metier;

/**
 * Métier Agence
 * Classe présentant l'Agence avec un numéro d'identifiant, une date de création, une adresse et un Gérant
 * @author ME VS
 *
 */

public class Agence {

	private String idAgence;
	private long dateCreation;
	private Gerant gerant;
	private Adresse adresseAgence;
	
	
	public Adresse getAdresseAgence() {
		return adresseAgence;
	}
	
	public void setAdresseAgence(Adresse adresseAgence) {
		this.adresseAgence = adresseAgence;
	}
	
	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public Agence(String idAgence, long dateCreation, Gerant gerant) {
		super();
		this.idAgence = idAgence;
		this.dateCreation = dateCreation;
		this.gerant = gerant;
	}
	
	

	public Agence(String idAgence, long dateCreation, Gerant gerant, Adresse adresseAgence) {
		super();
		this.idAgence = idAgence;
		this.dateCreation = dateCreation;
		this.gerant = gerant;
		this.adresseAgence = adresseAgence;
	}

	public Agence(String idAgence, long dateCreation) {
		super();
		this.idAgence = idAgence;
		this.dateCreation = dateCreation;
	}
	public Agence() {
		super();
	}

	public Gerant getGerant() {
		return gerant;
	}

	public String getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(String idAgence) {
		this.idAgence = idAgence;
	}

	public long getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(long dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Agence [idAgence=" + idAgence + ", dateCreation=" + dateCreation + ", gerant=" + gerant + "]";
	}

}
