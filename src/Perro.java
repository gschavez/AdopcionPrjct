
public class Perro {
    protected String placa;
    protected String nombre;
    protected String raza;
    protected int edad;
    protected String tamagno;


    public Perro() {
    }

    public Perro(int edad, String nombre, String placa, String raza, String tamagno) {
        this.edad = edad;
        this.nombre = nombre;
        this.placa = placa;
        this.raza = raza;
        this.tamagno = tamagno;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamagno() {
        return tamagno;
    }

    public void setTamagno(String tamagno) {
        this.tamagno = tamagno;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "edad=" + edad +
                ", placa='" + placa + '\'' +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", tamagno='" + tamagno + '\'' +
                '}';
    }



}
