public enum StatusPeca{
	MORTA("MORTA"),
	VIVA("VIVA");
	private final String nomeStatus;
	StatusPeca(String ns){
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