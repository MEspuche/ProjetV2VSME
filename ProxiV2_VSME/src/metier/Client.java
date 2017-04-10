package metier;

import java.util.ArrayList;
import java.util.Collection;

public class Client extends Personne {
	
	private Collection<Compte> comptes = new ArrayList<Compte>();
	private Patrimoine patrimoine;
	private Collection<Credit> credits = new ArrayList<Credit>();
	private Conseiller conseiller;
	private String typeClient; //particulier si client Particulier et entreprise si client Entreprise
	
	



	public String getTypeClient() {
		return typeClient;
	}

	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}

	/**
	 * Constructeur de Client auquel est associé à la classe Personne et son adresse
	 * @param nom 	Correspond au nom du client
	 * @param prenom 	Correspond au prenom du client
	 * @param telephone Correspond au téléphone de la client
	 * @param id	Correspond au numéro d'identification du client
	 * @param sonAdresse Correspond à l'adresse du client
	 */
	
	public Client(String nom, String prenom, String telephone, int id, Adresse sonAdresse, String typeClient) {
		super(nom, prenom, telephone, id, sonAdresse);
		// TODO Auto-generated constructor stub
	}

	public Client(String nom, String prenom, String telephone, int id, Adresse sonAdresse) {
		super(nom, prenom, telephone, id, sonAdresse);
		// TODO Auto-generated constructor stub
	}
	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

	public Collection<Credit> getCredits() {
		return credits;
	}

	public void setCredits(Collection<Credit> credits) {
		this.credits = credits;
	}

	public Client(Collection<Compte> comptes, Patrimoine patrimoine, Collection<Credit> credits,
			Conseiller conseiller) {
		super();
		this.comptes = comptes;
		this.patrimoine = patrimoine;
		this.credits = credits;
		this.conseiller = conseiller;
	}



	public Patrimoine getPatrimoine() {
		return patrimoine;
	}

	public void setPatrimoine(Patrimoine patrimoine) {
		this.patrimoine = patrimoine;
	}

	public Collection<Credit> getcredits() {
		return credits;
	}

	public void setcredits(Collection<Credit> credits) {
		this.credits = credits;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	
	

	public Client() {
		super();
	}



}
