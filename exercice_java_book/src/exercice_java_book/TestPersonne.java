package exercice_java_book;


abstract class Personne {
	protected String name;
	
	public Personne(String name ) {
		this.name=name;
		
	}
	public abstract void affiche();

}
class Etudiant extends Personne {   
	 	private String jb="etudiant";
		public Etudiant(String name) {
		super(name);
		}		
		public void affiche() {
			System.out.print ("Je suis "+ name+ "un etudiant" );
			
		}
	
}


class Enseignat extends Personne {   
 	private String jb="ensaignat";
	public Enseignat(String name) {
	super(name);
	}		
	public void affiche() {
		 affiche();
			System.out.print ("Je suis "+ name+ "un enseignant" );

		
	}

}


class Agent extends Personne {   
 	private String jb="agent";
	public Agent(String name) {
	super(name);
	}		
	public void affiche() {
		affiche();
		System.out.print ("Je suis "+ name+ "un agent" );
		
	}

}

public class TestPersonne {

	/*
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne  [] personnes = new Personne[4];
		personnes[0]=new Etudiant("barhoum");
		personnes[1]=new Agent ("ali");
		personnes[2]=new Enseignat("bi");
		personnes[3]=new Etudiant("di");
		

	}
	 */

}
