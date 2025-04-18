import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControladorClases {
    List<Perro> perro = new ArrayList<>();
    List<Persona> personas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);



    public ControladorClases() {
    }

    private Persona buscarPersonaPorDocumento(String documento) {
        for (Persona p : personas) {
            if (p.getDocumento().equals(documento)) {
                return p;
            }
        }
        return null;
    }

    private Perro buscarPerroPorPlaca(String placa) {
        for (Perro p : perro) {
            if (p.getPlaca().equals(placa)) {
                return p;
            }
        }
        return null;
    }

    public void registrarCanino(){
        Perro can = new Perro();

        System.out.println("Ingrese la placa del can");
        can.setPlaca(scanner.next());
        System.out.println("Ingrese el nombre del perro");
        can.setNombre(scanner.next());
        System.out.println("Ingrese la raza");
        can.setRaza(scanner.next());
        System.out.println("Ingrese la edad del can");
        can.setEdad(scanner.nextInt());
        System.out.println("Ingrese el tamaño del perro");
        can.setTamagno(scanner.next());

        perro.add(can);
    }
    public void mostrarListaPerros(){
        for (Perro perro1 : perro){
            System.out.println(perro1);
        }
    }

    public  void registrarPersona(){

        Persona persona = new Persona();

        System.out.println("Ingrese unicamente su nombre ...");
        persona.setNombre(scanner.next());
        System.out.println("Ingrese su apellido ...");
        persona.setApellido(scanner.next());
        System.out.println("Ingrese su edad ...");
        persona.setEdad(scanner.nextInt());
        System.out.println("Ingrese su documento ...");
        persona.setDocumento(scanner.next());

        System.out.println("Se ha resgistrado la persona con exito!!!");

        personas.add(persona);

    }

    public  void mostrarPersonas(){
        for(Persona persona:  personas){
            System.out.println(persona);
        }
    }

    public void adoptarPerro(String documento, String placa){
        Persona persona = buscarPersonaPorDocumento(documento);
        if (persona == null){
            System.out.println("No se encontro una persona con ese documento");
            return;
        }
        Perro canino = buscarPerroPorPlaca(placa);
        if (canino == null){
            System.out.println("No se encontro ningun perro con ese numero de placa");
            return;
        }
        boolean pudoAdoptar = persona.adoptarPerro(canino);
        if (pudoAdoptar) {
            perro.remove(canino);
            System.out.println("¡Adopción exitosa! " + persona.getNombre() + " ha adoptado a " + canino.getNombre());
        } else {
            System.out.println("Esta persona ya ha adoptado 3 perros. No puede adoptar más.");
        }

    }
    public Persona buscarPersonaPorDocumentoPub(String documento) {
        return buscarPersonaPorDocumento(documento);
    }


}
