public class Gato extends Mascota{
    private String color;


    public Gato(String nombre, int edad, String sexo, String color){
        super(nombre, edad, sexo);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
