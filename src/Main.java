import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Gestor de veterinarias
        Consultorio consultorio1 = new Consultorio(1, 5);
        Consultorio consultorio2 = new Consultorio(2, 3);
        Consultorio consultorio3 = new Consultorio(3, 10);

        //getter de variables no estaticas
        consultorio2.getNumero();
        // consultorio3.getMascotasAtendidas();

        //getter de variables estaticas
        System.out.println(String.format("El total de consultorios creados es: %s",
                Consultorio.getTotalConsultorios()));


        Consultorio consultorio4 = new Consultorio(4, 15);

        System.out.println(String.format("El total de consultorios creados es: %s",
                Consultorio.getTotalConsultorios()));

        Perro perroJuanito = new Perro("Juanito", 3, "macho", "Collie");
        Gato gatoSusan = new Gato("Susan", 14, "hembra", "blanco");

        consultorio2.atender(gatoSusan);

        System.out.println(Arrays.toString(consultorio2.getMascotasAtendidas()));

        consultorio2.atender(perroJuanito);
        Consultorio.Monitor monitorConsultorio2 =  consultorio2.new Monitor();
        monitorConsultorio2.mostrarAQuienAtendemos(perroJuanito);


        consultorio2.atender(perroJuanito);
        consultorio2.atender(perroJuanito);
        consultorio2.atender(perroJuanito);

        System.out.println(Arrays.toString(consultorio2.getMascotasAtendidas()));

        System.out.println(consultorio2.getCantAnimalesAtendidos());



    }

}