import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String documento;

    Scanner scanner = new Scanner(System.in);

    List<Perro> perros = new ArrayList<>();

    public Persona() {
    }

    public Persona(String apellido, String documento, int edad, String nombre) {
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", documento='" + documento + '\'' +
                '}';
    }
    public Perro perroMasGrande() {
        if (perros.isEmpty()) return null;

        Perro masViejo = perros.get(0);
        for (Perro p : perros) {
            if (p.getEdad() > masViejo.getEdad()) {
                masViejo = p;
            }
        }
        return masViejo;
    }


    /*public String perroMasGrande(){
        return edad;
    }*/

    public boolean adoptarPerro(Perro perro) {
        if (perros.size() >= 3) {
            return false;
        }
        perros.add(perro);
        return true;
    }

}
