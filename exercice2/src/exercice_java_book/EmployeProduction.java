package exercice_java_book;

class EmployeProduction extends Employe{
	private int nbUnite;
	private double coeifficient=5;

	public EmployeProduction(String nom,String pre,int age,String date,int nbUnite) {
		super(nom,pre,age,date);
		this.nbUnite=nbUnite;
	}
	 public double calculerSalaire() {
		 return nbUnite*coeifficient; 
		 
	 }
	
}
