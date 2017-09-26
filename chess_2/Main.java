import java.awt.Font;
import java.awt.Color;
   import javax.swing.*;
   import javax.swing.plaf.FontUIResource;

			
    public class Main extends JOptionPane{
       public static void main(String[] args) {
		 Jogador j1 = new Jogador("Luis",21,StatusJogador.JOGANDO,CorPeca.BRANCA);
		 Peca p1 = new Rainha(CorPeca.BRANCA,StatusPeca.VIVA);	
		 	System.out.println(j1);
		int i=0;
		 
		 	Tabuleiro T = new Tabuleiro();
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("SanSerif", Font.PLAIN, 40))); // Aqui vocÃª muda o nome e tamanho da fonte.
			System.out.println(Posicao.recuperarPosicao(7,7));
			while (true){
				String arg1="";
				String arg2="";	
				String message =JOptionPane.showInputDialog(T);
				try{
					arg1=message.substring(0,2);
					arg2=message.substring(2,4);
					Posicao k = Posicao.retornarPosicao(arg1);
					Posicao l = Posicao.retornarPosicao(arg2);
					Casa a = T.retornarCasa(k);
					Peca b = a.getPeca();
					b.moverPeca(k,l,T);
					
				}catch(StringIndexOutOfBoundsException si){
					JOptionPane.showMessageDialog(null,"Entre com o formato correto de casas\nExemplo: a1b5");
				}
				catch(ArrayIndexOutOfBoundsException ai){
					JOptionPane.showMessageDialog(null,"Entre com o formato correto de casas\nExemplo: a1b5");
				}	
				catch(NullPointerException npe){
				JOptionPane.showMessageDialog(null,"Uma das casas escolhidas é inválida!");
				}
			
			
			}	
	  }
   }
			

