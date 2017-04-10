package service;

import java.util.Collection;

import metier.Adresse;
import metier.Agence;
import metier.Client;
import metier.Conseiller;
import metier.Gerant;
import service.exception.AuditNegatifException;

public interface IGerant {

	public String effectuerAudit(Agence agence);
	public void AjouterConseiller(Gerant g, Conseiller co);
	public void SupprimerConseiller(Conseiller c, Gerant g);
	public void AfficherConseiller(Conseiller c);
	void ModifierConseiller(Conseiller c, Adresse a, String telephone);
	
}
