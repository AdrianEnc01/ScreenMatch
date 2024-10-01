public class Peliculas {
    String nombre;
    int duracionEnMinutos;
    int fechaLanzamieno;
    boolean disponibleEnElPlan;

    //En esta linea de codigo es una modificador de acceso para que el usuario no pueda interactuar con esto
    private double sumaDeEvaluaciones;
    private int totalEvaluaciones;

    //Metodo para devolver unicamente el total de las evaluaciones al usuario
    int gettotalEvaluaciones(){
        return totalEvaluaciones;
    }
    //El metodo funciona como una funcion que nos permite mostrar la ficha tecnica de la pelicula
    void muestraFichaTecnica(){
        System.out.println("Mi primera pelicula es: " + nombre);
        System.out.println("Su duracion es: " + duracionEnMinutos);
        System.out.println("Fecha de lanzamiento: " + fechaLanzamieno);
        System.out.println("Disponibilidad en plan: " + disponibleEnElPlan);

    }

    void evaluacin (double nota){
        sumaDeEvaluaciones += nota;
        //Contador para cada evaluacion
        totalEvaluaciones++;
    }

    double calcularMedia(){
        return sumaDeEvaluaciones/ totalEvaluaciones;
    }
}
