package Loteia;

import Metodos.Mismetodos;

public class Primitiva {
    public static void main(String[] args) {
        int numero,reintegro = 0,numeroanterior=0;

        for(int i=1;i<=6;i++){
        do {
            numero = (int) Math.floor(Math.random() * 49 + 1);

        }while(numero == numeroanterior);
        Mismetodos.Imprime("El numero " + i + " es " + numero + "\n");
        numeroanterior=numero;
        }
        Mismetodos.Imprime("El reintegro es " +(reintegro=(int) Math.floor(Math.random() * 9)));
    }
}
