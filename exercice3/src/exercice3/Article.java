package exercice3;

class Article implements Exportable {
	protected int code;
	protected String ref;
	protected int quantite;
	protected double pht;
	protected double tva;
	public Article (int code,String ref) {
		this.code=code;
		this.ref=ref;
	}
	public Article(int code,String ref,int quantite,double pht,double tva) {
		this(code,ref);
		this.quantite=quantite;
		this.pht=pht;
		this.tva=tva;
	}
	/*
	     public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

	  */
	public String toString() {
		return "l'article de code "+code+" sa reference est "+ref+"la quantité est "+ "son prix fors taxe est "+pht+" le tva est "+tva;
		
	}
	public double prixTransport() {
		return pht*2;
	}
	
	public double droitsDouane(double fraisDouane, int quantite) {
		// TODO Auto-generated method stub
		return fraisDouane*quantite;
	}
	public double prixNet(double fraisDouane) {
		// TODO Auto-generated method stub
		return quantite*(pht*tva+pht+prixTransport())+droitsDouane(fraisDouane,quantite);
	}
	
}