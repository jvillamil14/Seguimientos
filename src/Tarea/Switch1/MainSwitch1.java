package Tarea.Switch1;

import java.util.Scanner;

public class MainSwitch1 {
    public static void main(String[] args) {
        Switch1 a = new Switch1();
        Scanner lector = new Scanner(System.in);

        System.out.printf("ingrese una opcion:");
        a.option= lector.nextInt();

        System.out.printf(a.showOption());

        }
    }

