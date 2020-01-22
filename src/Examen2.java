
/**
 * Examen2
 */

import clases.Meses;

public class Examen2 {

    /**
     * Método para generar una temperatura aleatoria entre 0 y 30
     * 
     * @return Entero con la temperatura aleatoria entre 0 y 30
     */
    public static double generarTemperatura(int min, int max) {
        return min + Math.random() * ((max - min) + 1);
    }

    /**
     * Método que devuelve la media de las estaciones
     * 
     * @param listaEstaciones array con la lista de las estaciones
     * @return double con la media
     */
    public static double calcularMediaEstaciones(Meses[] listaEstaciones) {
        double media = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 5; j++) {
                media += listaEstaciones[i].estaciones[j].getMinima();
            }
            media /= 5;
        }
        return media;
    }

    /**
     * Método que devuelve la media anual de todas las estaciones
     * 
     * @param listaEstaciones array con la lista de las estaciones
     * @return double con la media anual
     */
    public static double calcularMediaMeses(Meses[] listaEstaciones) {
        double media = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 5; j++) {
                media += listaEstaciones[i].estaciones[j].getMinima();
            }
            media /= 5;
        }
        media /= 12;

        return media;
    }

    public static void main(String[] args) {
        // Para las estaciones
        Meses[] temperaturas = new Meses[12];
        double mediaEstaciones;
        double mediaMeses;

        // inicializar las estaciones con la temperatura minima aleatoria
        for (int i = 0; i <= temperaturas.length - 1; i++) {
            temperaturas[i] = new Meses(i);
            for (int j = 0; j < 5; j++) {
                temperaturas[i].setTemperatua(j, generarTemperatura(-10, 30));
            }
        }

        // mostrar los datos de los arrays
        for (int i = 0; i <= temperaturas.length - 1; i++) {
            System.out.println("Mes " + (temperaturas[i].getMes() + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Estación " + (j + 1) + "\t");
                System.out.print(temperaturas[i].getTemperaturas(j)+"\n");
            }
        }
        // obtener media estaciones
        mediaEstaciones = calcularMediaEstaciones(temperaturas);
        // obtener media meses
        mediaMeses = calcularMediaMeses(temperaturas);
        // mostrar la media de las estaciones y los meses
        System.out.println("Media de las estaciones: " + mediaEstaciones);
        System.out.println("Media anual de todas las estaciones: " + mediaMeses);

    }

}