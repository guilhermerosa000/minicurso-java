package estudo.jovem.tranquilao.logica.br.com.pesados.metais;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class logica {

    public static void main(String[] args) throws Exception {
    	numeroPar();
    	stringIgual();
        stringInicia();
        datas();
    }

    private static void stringIgual() {
        String frase = "hoje é segunda feira seis da tarde";

        if(frase.contains("segunda feira")) {
            if(frase.contains("seis da tarde")) {
                System.out.println("hora de alegria");
            } else {
                System.out.println("hora de tristeza");
            }

        } else if (frase.contains("sexta feira") || frase.contains("sabado") || frase.contains("domingo")) {
            System.out.println("alegria");
        } else {
            System.out.println("só um dia normal");
        }
    }

    private static void stringInicia() {
        String palavra = "alegria";

        if(palavra.startsWith("a")) {
            System.out.println("palavra inicia com a");
        } else {
            System.out.println("só um dia normal");
        }
    }

    private static void datas() throws ParseException {
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse("21/11/2001");

        if(data.before(new Date())) {
            System.out.println("esse dia ja passou");
        } else {
            System.out.println("esse dia está por vir");
        }
    }

    private static void numeroPar() {
        Integer numero = 10;

        if(numero % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }

}
