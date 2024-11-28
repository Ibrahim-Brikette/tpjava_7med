package exercice_java_book;

class EmployeRepresentation  extends Employe{
	private double chiffreAffaire;
	private double pourcentage=0.2;
	private double lePlus =800;

	public EmployeRepresentation(String nom,String pre,int age,String date,double chiffreAffaire) {
		super(nom,pre,age,date);
		this.chiffreAffaire=chiffreAffaire;
		
	}
	 public double calculerSalaire() {
		 
		 return chiffreAffaire* pourcentage +lePlus;

	 }
	
}
