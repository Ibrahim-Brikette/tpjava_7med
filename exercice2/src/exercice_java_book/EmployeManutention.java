package exercice_java_book;

class EmployeManutention extends Employe{
	private double heureTravail;
	private double prixHeure=65;
	public EmployeManutention(String nom,String pre,int age,String date,double heureTravail) {
		super(nom,pre,age,date);
		this.heureTravail=heureTravail;
	}
	 public double calculerSalaire() {
		 return heureTravail*prixHeure;
	 }
	
}
