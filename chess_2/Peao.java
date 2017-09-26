import javax.swing.JOptionPane;
public class Peao extends Peca{
	public Peao(CorPeca c, StatusPeca s){
			
		super("Peao","\u2659","\u265f",c,s);
		
	}
	@Override
	public String toString(){
		return super.toString();
	}
	
	public boolean posicaoValida(Posicao atual,Posicao desejada,Tabuleiro T){
		
		int x0 = atual.retornarX();
		int y0 = atual.retornarY();
		int x1 = desejada.retornarX();
		int y1 = desejada.retornarY();
		Casa casaDestino = T.retornarCasa(desejada);
		Casa casaOrigem = T.retornarCasa(atual);
		System.out.println(x0+","+y0);
		System.out.println(x1+","+y1);
		if(Math.abs(x1-x0)==1&&y0==y1){
			return true;
		}
		/*
		if(x0==1&&x1==(x0+2)&&y0==y1){
				return true;
		}
		else if(casaDestino.getPeca().getCorPeca()!=casaOrigem.getPeca().getCorPeca()&&((x1-x0)==1&&(y1==(y0+1)||y1==(y0-1)))){
		}
		else if((x1-x0)==1&&y1==y0)
				return true;
		
		return false;	
			
			*/
			return false;
		
	}
	@Override
	public  void moverPeca(Posicao atual,Posicao desejada,Tabuleiro T){
		Casa casaDestino = T.retornarCasa(desejada);
		Casa casaOrigem = T.retornarCasa(atual);
		
		if(posicaoValida(atual,desejada,T)){
			
		if(casaOrigem.getCasaLivre()==CasaLivre.OCUPADA){
			
			if(casaDestino.getCasaLivre()==CasaLivre.LIVRE){
				/*
				Casa aux = new Casa();
				T.inserirCasa(casaOrigem,desejada);
				T.inserirCasa(aux,atual);
				*/
				casaDestino.setPeca(casaOrigem.getPeca());
				casaDestino.setCasaLivre(CasaLivre.OCUPADA);
				casaOrigem.setCasaLivre(CasaLivre.LIVRE);
			
			}
			else{
				if(casaDestino.getPeca().getCorPeca()!=casaOrigem.getPeca().getCorPeca()){
					/*
					Casa aux = new Casa();
					T.inserirCasa(casaOrigem,desejada);
					T.inserirCasa(aux,atual);
				*/
					casaDestino.setPeca(casaOrigem.getPeca());
					casaOrigem.setCasaLivre(CasaLivre.LIVRE);
			
				}
				else{
					JOptionPane.showMessageDialog(null,"Voce NÃO pode comer sua própria peça!\n");
				}
			}
		}
		else
			JOptionPane.showMessageDialog(null,"Voce NÃO pode partir de uma casa vazia!s");	
	}
	else
		JOptionPane.showMessageDialog(null,"Movimento inválido para a peça");

	}
}