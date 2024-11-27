package exercice_java_book;

interface Risque{
	static                                                                                                                                                                                                                                                                                                                                final int montantRisque=200;
}

abstract class Employe{
	protected String nom;
	protected String prenom;
	protected int age;
	protected String dateEntree;
	public Employe(String nom, String prenom, int age, String dateEntree) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.dateEntree=dateEntree;
	}

	public String getNom() {
		return "L'employee"+ nom +" "+ prenom; 
	}
	public abstract double calculerSalaire();
	
}
// employe de vente 
class EmployeVente extends Employe{
	private double chiffreAffaire;
	public EmployeVente(String nom,String pre,int age,String date,double chiffreAffaire) {
		super(nom,pre,age,date);
		this.chiffreAffaire=chiffreAffaire;
	}
	 public double calculerSalaire() {
		 return chiffreAffaire* 0.2 +400;
		 
	 }
	
}


class EmployeRepresentation  extends Employe{
	private double chiffreAffaire;
	public EmployeRepresentation(String nom,String pre,int age,String date,double chiffreAffaire) {
		super(nom,pre,age,date);
		this.chiffreAffaire=chiffreAffaire;
		
	}
	 public double calculerSalaire() {
		 
		 return chiffreAffaire* 0.2 +800;

	 }
	
}
class EmployeProduction extends Employe{
	private int nbUnite;

	public EmployeProduction(String nom,String pre,int age,String date,int nbUnite) {
		super(nom,pre,age,date);
		this.nbUnite=nbUnite;
	}
	 public double calculerSalaire() {
		 return nbUnite*5; 
		 
	 }
	
}
class EmployeManutention extends Employe{
	private double heureTravail;
	public EmployeManutention(String nom,String pre,int age,String date,double heureTravail) {
		super(nom,pre,age,date);
		this.heureTravail=heureTravail;
	}
	 public double calculerSalaire() {
		 return heureTravail*65;
	 }
	
}
class EmployeProductionEnRisque extends EmployeProduction implements Risque{
	public EmployeProductionEnRisque(String nom,String pre,int age,String date,int nbUnite) {
		super(nom,pre, age, date, nbUnite);
	}
	@Override
	public double calculerSalaire() {
		return super.calculerSalaire()+200;
	}
}
class EmployeManutentionEnRisque extends EmployeManutention implements Risque{
	public EmployeManutentionEnRisque(String nom,String pre,int age,String date,int nbUnite) {
		super(nom,pre, age, date, nbUnite);
	}
	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return super.calculerSalaire()+200;
	}
}
 

/*
 public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
