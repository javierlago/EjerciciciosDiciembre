package JuegoPiedraPapelaTijera;

import Metodos.Mismetodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class PiedraPapelTijera {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int tiradapc = (int) Math.floor(Math.random() * 3 + 1);
        String tiradajugador;



        do {
            Mismetodos.Imprime("Introduce Piedra,Papel,Tijera");
            tiradajugador = br.readLine();
            if(tiradajugador!="Piedra"||tiradajugador!="Papel"||tiradajugador!="Tijera") {
                Mismetodos.Imprime("Responda con las opciones sugeridas");
            }
        } while (tiradajugador!="Piedra"||tiradajugador!="Papel"||tiradajugador!="Tijera");


    }
}
