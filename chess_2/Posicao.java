public enum Posicao{
		
		a1("a1"),b1("b1"),c1("c1"),d1("d1"),e1("e1"),f1("f1"),g1("g1"),h1("h1"),
		a2("a2"),b2("b2"),c2("c2"),d2("d2"),e2("e2"),f2("f2"),g2("g2"),h2("h2"),
		a3("a3"),b3("b3"),c3("c3"),d3("d3"),e3("e3"),f3("f3"),g3("g3"),h3("h3"),
		a4("a4"),b4("b4"),c4("c4"),d4("d4"),e4("e4"),f4("f4"),g4("g4"),h4("h4"),
		a5("a5"),b5("b5"),c5("c5"),d5("d5"),e5("e5"),f5("f5"),g5("g5"),h5("h5"),
		a6("a6"),b6("b6"),c6("c6"),d6("d6"),e6("e6"),f6("f6"),g6("g6"),h6("h6"),
		a7("a7"),b7("b7"),c7("c7"),d7("d7"),e7("e7"),f7("f7"),g7("g7"),h7("h7"),
		a8("a8"),b8("b8"),c8("c8"),d8("d8"),e8("e8"),f8("f8"),g8("g8"),h8("h8"),
		INVALIDA("INVALIDA");
		
		String nomePosicao;
		Posicao(String n){
		nomePosicao = n;
		}
		public static Posicao recuperarPosicao(int x, int y){
			String a = new Character((char)(y+97)).toString();
			String b = new Character((char)(x+49)).toString();
			a=a.concat(b);
			return retornarPosicao(a);
			
		}
		public int retornarY(){
			String a = getNomePosicao();
			return (int)a.charAt(0)-97;
		}
		public int retornarX(){
			String a = getNomePosicao();
			return (int)a.charAt(1)-49;
		}
		public String getNomePosicao(){
			return nomePosicao;
		}
		public static Posicao retornarPosicao(String opcao){
			boolean opcaoValida1 = false;
			boolean opcaoValida2 = false;
			for(Posicao c :Posicao.values()){
				if(opcao.equals(c.toString())){
					return c;
				}
					
			}
			return Posicao.INVALIDA;
		}
		@Override
		public String toString(){
			return nomePosicao;
		}
	
	}