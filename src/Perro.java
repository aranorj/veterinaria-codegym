public class Perro extends Mascota{
    private String raza;

    public Perro(String nombre, int edad, String sexo, String raza){
        super(nombre, edad, sexo);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
