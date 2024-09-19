public class Pelicula {

    String nombre;
    int FechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaualciones;

    int getTotalDeLasEvaualciones(){
        return totalDeLasEvaualciones;
    }

    void muestraFichaTecnica () {

        System.out.println("\nEl Nombre de la Peliculas es:  " + nombre);
        System.out.println("Su Fecha de Lanzamiento fue: " + FechaDeLanzamiento);
        System.out.println("Tiene una Duracion de:  " + duracionEnMinutos + " Minutos");
    };

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaualciones++;

    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaualciones;
    }


}
