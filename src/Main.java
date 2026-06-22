import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        AgendaTelefonica agenda = new AgendaTelefonica();
        int opcion;

        System.out.println("=== BIENVENIDO A LA AGENDA TELEFÓNICA ===");

        do {
            System.out.println("\n---------- MENÚ ----------");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar teléfono de contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Modificar teléfono");
            System.out.println("6. Verificar si la agenda está llena");
            System.out.println("7. Mostrar espacios libres");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(sn.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido.");
                opcion = 0;
                continue;
            }// try-catch

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre: ");
                    String nomAñadir = sn.nextLine();
                    System.out.print("Introduce el apellido: ");
                    String apeAñadir = sn.nextLine();
                    System.out.print("Introduce el teléfono (solo números): ");
                    String telAñadir = sn.nextLine();

                    try {
                        Contacto nuevoContacto = new Contacto(nomAñadir, apeAñadir, telAñadir);
                        agenda.añadirContacto(nuevoContacto);
                        break;
                    } catch (IllegalArgumentException e){

                        System.out.println("ERROR. Ingresa un número válido.");
                    }

                case 2:
                    System.out.println("\n--- Lista de Contactos ---");
                    agenda.listarContactos();
                    break;

                case 3:
                    System.out.print("Introduce el nombre a buscar: ");
                    String nomBuscar = sn.nextLine();
                    System.out.print("Introduce el apellido a buscar: ");
                    String apeBuscar = sn.nextLine();

                    String resultadoBusqueda = agenda.buscaContacto(nomBuscar, apeBuscar);
                    System.out.println("Resultado: " + resultadoBusqueda);
                    break;

                case 4:
                    System.out.print("Introduce el nombre del contacto a eliminar: ");
                    String nomEliminar = sn.nextLine();
                    System.out.print("Introduce el apellido del contacto a eliminar: ");
                    String apeEliminar = sn.nextLine();

                    Contacto contacto = agenda.buscaContc(nomEliminar, apeEliminar); //Contacto contactoAEliminar = new Contacto(nomEliminar, apeEliminar, "");
                    agenda.eliminarContacto(contacto);
                    break;

                case 5:
                    System.out.print("Introduce el nombre del contacto: ");
                    String nomModificar = sn.nextLine();
                    System.out.print("Introduce el apellido del contacto: ");
                    String apeModificar = sn.nextLine();
                    System.out.print("Introduce el nuevo teléfono: ");
                    String nuevoTel = sn.nextLine();
                    try{

                        agenda.modificarTelefono(nomModificar, apeModificar, nuevoTel);
                    }
                    catch (IllegalArgumentException e){

                        System.out.println("ERROR. Ingresa un número válido.");
                    }
                    break;

                case 6:
                    if (agenda.agendaLlena()) {
                        System.out.println("La agenda está completamente llena.");
                    } else {
                        System.out.println("Aún hay espacio disponible en la agenda.");
                    }
                    break;

                case 7:
                    agenda.espaciosLibres();
                    break;

                case 8:
                    System.out.println("¡Gracias por usar la agenda! Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Introduce un número del 1 al 8.");
            }// switch

        } while (opcion != 8);

        sn.close();
    } // main
}// class Main
