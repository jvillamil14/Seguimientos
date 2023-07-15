package Tarea.Division;

public class MainDivision {
    public static void main(String[] args) {
        Division division = new Division();
        division.numero1 = 25;
        division.numero2 = 5;

        int resultado = division.dividir();

        System.out.println("El resultado de la división es: " + resultado);
    }
}
