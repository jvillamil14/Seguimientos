package Tarea.Mulplicacion;

public class MainMultiplicacion {
    public static void main(String[] args) {
        Multiplicacion multiplicacion = new Multiplicacion();
        multiplicacion.numero1 = 5;
        multiplicacion.numero2 = 3;

        int resultado = multiplicacion.multiplicar();

        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
