package estudo.jovem.tranquilao.logica.br.com.pesados.metais;

import java.util.ArrayList;

public class RepeticaoEDecisaoJuntos {
	public static void main(String[] args) {
		ArrayList<Integer> listaDeUmADez = new ArrayList<> ();
		
		
		
		for(int i = 1; i <= 10; i++) {
			listaDeUmADez.add(i);
		}
		
		ArrayList<Integer> numerosPares = new ArrayList<> ();
		ArrayList<Integer> numerosImpares = new ArrayList<> ();
		
		for (Integer numero : listaDeUmADez) {
			if(numero % 2 == 0) {
				numerosPares.add(numero);
			} else {
				numerosImpares.add(numero);
			}
		}
		
		for(Integer numeroPar: numerosPares) {
			System.out.println(numeroPar);
			
		}
		for(Integer numeroImpar: numerosImpares) {
			System.out.println(numeroImpar);
			
		}
	}
	
		
	}


