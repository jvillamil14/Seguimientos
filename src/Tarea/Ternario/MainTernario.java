package Tarea.Ternario;

public class MainTernario {
        public static void main(String[] args) {
            Ternario ternario = new Ternario();
            ternario.state = 2;
            ternario.state2 = true;

            int resultado = ternario.showMessage();

            System.out.println("El resultado del operador ternario es: " + resultado);
        }
    }


