package clases;

/**
 * Meses
 */
public class Meses {

    private int mes;
    public Estacion[] estaciones = new Estacion[5];
    
    // CONSTRUCTOR
    public Meses(int mes){
        this.mes = mes;
        for (int i = 0; i < 5; i++){
            estaciones[i] = new Estacion(0);
        }
    }

    // GETTERS Y SETTERS
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getTemperaturas(int indice) {
        return estaciones[indice].getMinima();
    }

    public void setTemperatua(int indice, double temperatura) {
        this.estaciones[indice].setMinima(temperatura);
    }
    
}