package Tarea.Suma;

public class MainSuma {
    public static void main(String[] args) {
        Suma suma = new Suma();
        suma.numero1 = 106;
        suma.numero2 = 4;

        int resultado = suma.sumar();

        System.out.println("El resultado de la suma es: " + resultado);
    }
}
