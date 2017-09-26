public enum StatusJogador{
	CHECKMATE("CHECKMATE"),
	PERDEU("PERDEU"),
	JOGANDO("JOGANDO"),
	CHECK("CHECK");
	private final String nomeStatus;
	StatusJogador(String ns ){
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