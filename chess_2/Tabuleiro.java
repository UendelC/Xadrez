public class Tabuleiro{
	private Casa [][] casa = new Casa[8][8];
	public Tabuleiro(){
		Peca [] brancas = new Peca[9];
		brancas[0] = new Torre(CorPeca.BRANCA,StatusPeca.VIVA);
		brancas[1] = new Cavalo(CorPeca.BRANCA,StatusPeca.VIVA);
		brancas[2] = new Bispo(CorPeca.BRANCA,StatusPeca.VIVA);
		brancas[3] = new Rei(CorPeca.BRANCA,StatusPeca.VIVA);
		brancas[4] = new Rainha(CorPeca.BRANCA,StatusPeca.VIVA);
		brancas[5] = new Bispo(CorPeca.BRANCA,StatusPeca.VIVA);
		brancas[6] = new Cavalo(CorPeca.BRANCA,StatusPeca.VIVA);
		brancas[7] = new Torre(CorPeca.BRANCA,StatusPeca.VIVA);
		brancas[8] = new Peao(CorPeca.BRANCA,StatusPeca.VIVA);
		Peca [] pretas = new Peca[9];
		pretas[0] = new Torre(CorPeca.PRETA,StatusPeca.VIVA);
		pretas[1] = new Cavalo(CorPeca.PRETA,StatusPeca.VIVA);
		pretas[2] = new Bispo(CorPeca.PRETA,StatusPeca.VIVA);
		pretas[3] = new Rei(CorPeca.PRETA,StatusPeca.VIVA);
		pretas[4] = new Rainha(CorPeca.PRETA,StatusPeca.VIVA);
		pretas[5] = new Bispo(CorPeca.PRETA,StatusPeca.VIVA);
		pretas[6] = new Cavalo(CorPeca.PRETA,StatusPeca.VIVA);
		pretas[7] = new Torre(CorPeca.PRETA,StatusPeca.VIVA);
		pretas[8] = new Peao(CorPeca.PRETA,StatusPeca.VIVA);
		
		for(int i=0;i<casa.length;i++){
			for (int j=0;j<casa.length;j++){
				switch(i){
					case 0:
						casa[i][j] = new Casa(brancas[j]);
						break;
					case 7:
						casa[i][j] = new Casa(pretas[j]);
						break;
					case 1:
						casa[i][j] = new Casa(brancas[8]);
						break;
					case 6:
						casa[i][j] = new Casa(pretas[8]);
						break;
					default:
						casa[i][j] = new Casa();
						break;
				
				}
				
			}
		}
		
		
	}
	@Override
	public String toString(){

		String message="";
		for(int i=casa.length-1;i>=0;i--){
			String b = Integer.toString(i+1);
			message = message.concat(b+"");
			for (int j=0;j<casa.length;j++){
				if(casa[i][j].getCasaLivre()==CasaLivre.OCUPADA){
					String aux = String.format("%-1s",casa[i][j].getPeca().toString());
					message = message.concat(aux);
				}				
				else{
					String aux = String.format("%-4s"," ");
					message = message.concat(aux);
				}
					
			}
			message = message.concat("\n");
			
						
		}
				message = message.concat("  ");
		for(int i=0;i<casa.length;i++){
				String c = String.format("%-3s",new Character((char)(i+97)).toString());
				message = message.concat(c);
		}
		return message;
	}
	public Casa retornarCasa(Posicao pos){
		int x = pos.retornarX();
		int y = pos.retornarY();
		return casa[x][y];
	}
	public void inserirCasa(Casa c, Posicao pos){
		int x = pos.retornarX();
		int y = pos.retornarY();
		casa[x][y] = c;
	}
	//boolean mover(Peca p);
	//boolean comer(Peca p);
}


