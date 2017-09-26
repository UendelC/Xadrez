public enum CasaLivre{
	LIVRE("LIVRE"),
	OCUPADA("OCUPADA");
	private final String nomeStatus;
	CasaLivre(String ns){
		nomeStatus = ns;
	}
	public String getNomeStatus(){
		return nomeStatus;
	}
	@Override
	public String toString(){
		return nomeStatus;
	}
	
}