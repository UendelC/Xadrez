
public class Jogador{
	private String nome;
	private int   idade;
	private StatusJogador status;
	private CorPeca corPeca;
	
	public Jogador(String n,int i,StatusJogador s,CorPeca c){
		setNome(n);
		setIdade(i);
		setStatus(s);
		setCorPeca(c);
	}
	public void setNome(String n){
		nome = n;
	}
	public void setIdade(int i){
		idade = ((i>0)?i:0);
	}
	public void setStatus(StatusJogador s){
		status = s;
	}
	public void setCorPeca(CorPeca c){
		corPeca = c;
	}
	public String getNome(){
		return nome;
	}
	public int getIdade(){
		return idade;
	}
	public StatusJogador getStatus(){
		return status;
	}
	public CorPeca getCorPeca(){
		return corPeca;
	}
	@Override
	public String toString(){
		return String.format("%s - %s",getNome(),getStatus());
	}
	public void Jogada(Posicao p1, Posicao p2){
		;//return true;
	}
}