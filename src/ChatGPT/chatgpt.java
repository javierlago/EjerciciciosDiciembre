package ChatGPT;
import java.util.Random;

    public class chatgpt{


        public static void main(String[] args) {
            // Genera un número aleatorio entre 4 y 28, inclusive, que sea múltiplo de 4
            Random rand = new Random();
            int numNotas = 4 * rand.nextInt(7) + 4;

            // Genera una lista de números aleatorios entre 1 y 7, inclusive
            int[] notas = new int[numNotas];
            for (int i = 0; i < numNotas; i++) {
                notas[i] = rand.nextInt(7) + 1;
            }

            // Convierte cada número aleatorio en la nota correspondiente
            String[] notasConvertidas = {"do", "re", "mi", "fa", "sol", "la", "si"};
            String[] notasStr = new String[numNotas];
            for (int i = 0; i < numNotas; i++) {
                notasStr[i] = notasConvertidas[notas[i] - 1];
            }

            // Agrega la barra vertical "|" después de cada grupo de 4 notas
            String melodia = "";
            for (int i = 0; i < numNotas; i++) {
                melodia += notasStr[i];
                if ((i + 1) % 4 == 0) {
                    melodia += "|";
                }
            }

            // Asegura de que la última nota de la melodía sea igual a la primera
            if (!notasStr[numNotas - 1].equals(notasStr[0])) {
                melodia = melodia.substring(0, melodia.length() - 1) + notasStr[0] + "|";
            }

            // Agrega dos barras al final de la melodía
            melodia += "||";

            // Imprime la melodía generada
            System.out.println(melodia);
        }
    }

