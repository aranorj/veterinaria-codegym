public class Consultorio {
    // cuando no dice static es un atributo de instancia
    private int numero;
    private int cupo;
    private Mascota[] mascotasAtendidas;
    private int cantAnimalesAtendidos;

    private static int totalConsultorios;

    public Consultorio(int numero, int cupo) {
        mascotasAtendidas = new Mascota[cupo];
        this.numero = numero;
        this.cupo = cupo;
        totalConsultorios++;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getTotalConsultorios() {
        return totalConsultorios;
    }

    public int getCupo() {
        return cupo;
    }

    public Mascota[] getMascotasAtendidas() {
        return mascotasAtendidas;
    }

    public static void setTotalConsultorios(int totalConsultorios) {
        Consultorio.totalConsultorios = totalConsultorios;
    }

    public int getCantAnimalesAtendidos() {
        return cantAnimalesAtendidos;
    }

    public void atender(Mascota mascota){
        if(cantAnimalesAtendidos < cupo){
            this.mascotasAtendidas[cantAnimalesAtendidos] = mascota;
            cantAnimalesAtendidos++;
        }else {
            System.out.println("Consultorio lleno!! no se atenderan mas mascotas hoy");
        }
    }

    public class Monitor{

        public void mostrarAQuienAtendemos(Mascota mascota ){
            System.out.println(String.format("Estamos atendiendp a s%, tiene %s años", mascota.getNombre(),
                    mascota.getEdad()));

        }
    }

    public Mascota[] getArrayMascotasAtendidas() {
        Mascota[] mascotasAtendidas = new Mascota[cantAnimalesAtendidos];

        //itero sobre el array y lo lelno de mascotas atendidad
        mascotasAtendidas[0] = this.mascotasAtendidas[0];

        return mascotasAtendidas;

        // podria usar una clase estatica para guardar un registro de todos los animales atendidos en los multiples consultorios?
        // como ?
    }

}
