public enum CorPeca{
	PRETA("PRETA"),
	BRANCA("BRANCA");
	private final String nomeStatus;
	CorPeca(String ns){
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