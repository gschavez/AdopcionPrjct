import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona regPer = new Persona();
        ControladorClases controlador = new ControladorClases();

        boolean play = true;
        do {


            System.out.println("""
                    
                    Bienvenido a nuestro servicio de adopcion de caninios!!!
                    ¿Que deseas hacer el dia de hoy?
                    
                        1. Registrar Personas.
                        2. Registrar Canino.
                        3. Ver Personas registradas.
                        4. Ver Caninos disponibles.
                        5. Adoptar Canino.
                        6. Consultar canino adoptado con mas longevidad.
                        7) Salir del programa.
                        
                    """);
            int caso = scanner.nextInt();

            switch (caso) {
                case 1 -> {
                    controlador.registrarPersona();
                }
                case 2 -> {
                    controlador.registrarCanino();
                }
                case 3 -> {
                    controlador.mostrarPersonas();
                }

                case 4 -> {
                    controlador.mostrarListaPerros();
                }
                //por temas de orden y estructura poble algunos datos aca
                case  5 -> {
                    System.out.print("Ingrese el documento de la persona: ");
                    String doc = scanner.next();
                    System.out.print("Ingrese la placa del perro: ");
                    String placa = scanner.next();
                    controlador.adoptarPerro(doc, placa);
                }
                case  6 ->{
                    System.out.print("Ingrese el documento de +¿la persona: ");
                    String doc = scanner.next();
                    Persona persona = controlador.buscarPersonaPorDocumentoPub(doc);
                    if (persona != null) {
                        Perro viejo = persona.perroMasGrande();
                        if (viejo != null) {
                            System.out.println("El pwerro más viejo adoptado por " + persona.getNombre() + " es: " + viejo);
                        } else {
                            System.out.println("Esta persona aún no ha adoptado perros.");
                        }
                    } else {
                        System.out.println("Persona no encontrada.");
                    }

                }
                case 7 -> {
                    System.out.println("Gracias por usar el sistema!!");
                    play = false;
                }

                default -> System.out.println("opcion no valida");

            }
        }while (play == true);
    }
}