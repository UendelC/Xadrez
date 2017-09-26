public class Casa {
	private Peca peca;
	private CasaLivre cL;
	public Casa(Peca p){
		setPeca(p);
		setCasaLivre(CasaLivre.OCUPADA);
	}
	public Casa(){
		setCasaLivre(CasaLivre.LIVRE);
		
	
	}
	public void setCasaLivre(CasaLivre c){
		cL = c;
	}
	public CasaLivre getCasaLivre(){
		return cL;
	}
	public void setPeca(Peca p){
		peca = p;
	}
	public Peca getPeca(){
		return peca;
	}
	@Override
	public String toString(){
		return getCasaLivre().toString();
	}

}