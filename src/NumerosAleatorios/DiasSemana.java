package NumerosAleatorios;


import Metodos.Mismetodos;

public class DiasSemana {
    public static void main(String[] args) {


        int diasemana=0;

        diasemana=(int) Math.floor(Math.random()*7+1);

        /*Mismetodos.Imprime(String.valueOf(diasemana));*/


        switch (diasemana){
                case 1:
                Mismetodos.Imprime("DO");
                break;
                case 2:
                Mismetodos.Imprime("RE");
                    break;
                case 3:
                Mismetodos.Imprime("MI");
                    break;
                case 4:
                Mismetodos.Imprime("FA");
                    break;
                case 5:
                Mismetodos.Imprime("SOL");
                    break;
                 case 6:
                Mismetodos.Imprime("LA");
                     break;
                 case 7:
                Mismetodos.Imprime("SI");
        }


    }



}
