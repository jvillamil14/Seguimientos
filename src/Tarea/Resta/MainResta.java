package Tarea.Resta;

public class MainResta {
    public static void main(String[] args) {
        Resta resta = new Resta();

        resta.numero1 = 10;
        resta.numero2 = 9;
        System.out.printf("La resta es "+ resta.restar());

    }

}
