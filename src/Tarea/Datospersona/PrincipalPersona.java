package Tarea.Datospersona;

public class PrincipalPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona persona1 = new Persona();
        persona.cedula ="1117499696";
        persona.nombre ="santiago";
        persona.kilos = 80.7f;
        System.out.printf(persona.mostrarDatos());

        persona1.cedula = "10597990";
        persona1.nombre ="juan";
        persona1.kilos = 77.7f;
        System.out.printf(persona1.mostrarDatos());



    }
}
