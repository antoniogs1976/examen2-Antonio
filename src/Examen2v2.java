/**
 * Examen2v2
 */
public class Examen2v2 {

    public static double mediaAnualEstacion(int[] estacion) {
        double media = 0;
        for (int i = 0; i < estacion.length; i++) {
            media += estacion[i];
        }
        media /= 12;
        return media;
    }
    
    public static void main(String[] args) {
        int[] estacion1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int[] estacion2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int[] estacion3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int[] estacion4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int[] estacion5 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        double media1, media2, media3, media4, media5, mediaGlobal;

        media1 = mediaAnualEstacion(estacion1);
        media2 = mediaAnualEstacion(estacion2);
        media3 = mediaAnualEstacion(estacion3);
        media4 = mediaAnualEstacion(estacion4);
        media5 = mediaAnualEstacion(estacion5);

        mediaGlobal = (media1 + media2 + media3 + media4 + media5) / 5;

        // mostrar datos
        System.out.println("La media anual de la estación 1 es de " + media1);
        System.out.println("La media anual de la estación 2 es de " + media2);
        System.out.println("La media anual de la estación 3 es de " + media3);
        System.out.println("La media anual de la estación 4 es de " + media4);
        System.out.println("La media anual de la estación 1 es de " + media5);

        System.out.println("La media global es de " + mediaGlobal);

    }
}