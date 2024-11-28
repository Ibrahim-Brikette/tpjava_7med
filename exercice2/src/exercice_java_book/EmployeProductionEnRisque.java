package exercice_java_book;

class EmployeProductionEnRisque extends EmployeProduction implements Risque{
	public EmployeProductionEnRisque(String nom,String pre,int age,String date,int nbUnite) {
		super(nom,pre, age, date, nbUnite);
	}
	@Override
	public double calculerSalaire() {
		return super.calculerSalaire()+prime;
	}
}