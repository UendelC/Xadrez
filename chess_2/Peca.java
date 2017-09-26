public abstract class Peca{
	//private enum statusPeca{MORTA,VIVA};
	private String nome;
	private String simbolo;
	private CorPeca corPeca;
	private StatusPeca status;
	//private enum corPeca{BRANCA,PRETA};
	public  Peca(String n,String simbB,String simbP,CorPeca c,StatusPeca s){
		if(c==CorPeca.BRANCA)
			setSimbolo(simbB);
		else
			setSimbolo(simbP);	
		setNome(n);
		setCorPeca(c);
		setStatus(s);
		
	}
	public void setSimbolo(String n){
		simbolo = n;
	}
	public void setNome(String k){
		nome = k;
	}
	public void setCorPeca(CorPeca c){
		corPeca = c;
	}
	public void setStatus(StatusPeca c){
		status = c;
	}
	public String getSimbolo(){
		return simbolo;
	}
	public StatusPeca getStatus(){
		return status;
	}
	public String getNome(){
		return nome;
	}
	public CorPeca getCorPeca(){
		return corPeca;
	}
	@Override
	public String toString(){
		return getSimbolo();
	}
	public abstract void moverPeca(Posicao atual,Posicao desejada,Tabuleiro T);
	
}