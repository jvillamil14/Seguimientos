package MaquinaDispensadora;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrincipalMaquina {
    public static void main(String[] args) {
        Maquina e = new Maquina();
        Maquina s = new Maquina();
        Scanner Lector = new Scanner(System.in);
        e.EstadoEncendido = true;
        if(e.EstadoEncendido){
            System.out.println("El sistema se esta preparando para recibir tu orden ");
        }else {
            System.out.println("El sistema se encuentra actualmente apagado ");

        }
        System.out.println("Ingrese el saldo: ");
        s.Saldo = Lector.nextInt();
            
    }
}
