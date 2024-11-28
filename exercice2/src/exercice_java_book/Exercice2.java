package exercice_java_book;





// employe de vente 








 


 public class Exercice2 {

	public static void main(String[] args) {
		Employe [] employes=new Employe[4];
		employes[0]=new EmployeManutentionEnRisque(null, null, 0, null, 0);
		employes[1]=new EmployeManutentionEnRisque(null, null, 0, null, 0);
		System.out.println(employes[0].getClass().equals(employes[1].getClass()));
		// TODO Auto-generated method stub

	}

}
