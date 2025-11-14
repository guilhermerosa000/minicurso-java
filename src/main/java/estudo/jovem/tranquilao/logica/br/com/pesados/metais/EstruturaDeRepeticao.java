package estudo.jovem.tranquilao.logica.br.com.pesados.metais;

import java.util.ArrayList;

public class EstruturaDeRepeticao {
	public static void main(String[] args) {
		listaDePalavras();
		forClassico();
		forPuro();
		inverter();
	}

	private static void listaDePalavras() {
		ArrayList<String> palavraList = new ArrayList<>();
		
		
		palavraList.add("teste");
		palavraList.add("JAVA");
		palavraList.add("BIC");
		palavraList.add("||||||");
		
		
		for(String palavra: palavraList) {
			System.out.println(palavra);
		}
	} 
	private static void forClassico() {
		ArrayList<String> palavraList = new ArrayList<>();
		
		
		palavraList.add("teste");
		palavraList.add("JAVA");
		palavraList.add("BIC");
		palavraList.add("||||||");
		
		
		for(int i = 0; i < palavraList.size(); i++) {
			System.out.println(palavraList.get(i));
		}
	} 
	private static void forPuro() {
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	} 
private static void inverter() {
		String str = "JAVA";
		String invertida = "";
		for(int i = str.length() -1; i >= 0; i--) {
			invertida = invertida + str.charAt(i);
			System.out.println(invertida);
		}
	}

}
