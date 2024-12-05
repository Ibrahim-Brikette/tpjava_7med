package exercice3;

public class ArticleFragile extends Article {
	private String embalage;
	private double prixEmbalage;
	
	public ArticleFragile(int code, String ref, int quantite, double pht, double tva,String embalage,double prixEmbalage) {
		super(code, ref, quantite, pht, tva);
		this.embalage=embalage;
		this.prixEmbalage=prixEmbalage;
	}
	public String toString() {
		return "l'article de code "+code+" sa reference est "+ref+"la quantité est "+ "son prix fors taxe est "+pht+" le tva est "+tva+" son embalage est "+embalage+" leprix d'empalage est "+prixEmbalage;
 
	}
	@Override
	 public double prixTransport() {
		return super.prixTransport()*2;
				
	
	}
	@Override
	public double prixNet(double fraisDouane) {
		return super.prixNet(fraisDouane)+prixEmbalage*quantite;
	}
	
	
	

}
