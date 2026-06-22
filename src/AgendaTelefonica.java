import java.util.ArrayList;
import java.util.Arrays;

public class AgendaTelefonica {

    private Contacto list[] = new Contacto[10];
    //Contactos de prueba
    public AgendaTelefonica(){

        list[0] = new Contacto("John", "Doe", "1234567890");
        list[1] = new Contacto("Mary", "Smith", "9876543210");
        list[2] = new Contacto("Peter", "Jones", "5551234567");
        list[3] = new Contacto("Ana", "Lopez", "4421234567");
        list[4] = new Contacto("Carlos", "Garcia", "5512345678");
        list[5] = new Contacto("Laura", "Martinez", "3312345678");
        list[6] = new Contacto("David", "Brown", "6671234567");
        list[7] = new Contacto("Sofia", "Hernandez", "8112345678");
        list[8] = new Contacto("Michael", "Wilson", "7221234567");
        list[9] = new Contacto("Emma", "Taylor", "9991234567");
    }

    public Contacto[] getList() {
        return list;
    }

    public void setList(Contacto[] list) {
        this.list = list;
    }

    //Lizeth
    public boolean existeContacto(Contacto c){

        for (Contacto contacto : list) {

            if (contacto != null &&
                    contacto.getNombre().equalsIgnoreCase(c.getNombre()) &&
                    contacto.getApellido().equalsIgnoreCase(c.getApellido())) {

                return true;
            }// if
        }// for

        return false;
    }// existeContacto



        public boolean añadirContacto(Contacto c) {

            if (c.getNombre() == null || c.getNombre().trim().isEmpty() ||
                    c.getApellido() == null || c.getApellido().trim().isEmpty()) {

                System.out.println("Nombre o apellido no válidos");
                return false;
            }// if

            if (existeContacto(c)) {
                System.out.println("El contacto ya existe");
                return false;
            }// if

            for (int i = 0; i < list.length; i++) {

                if (list[i] == null) {
                    list[i] = c;
                    System.out.println("Contacto añadido");
                    return true;
                }// if
            }// for

            System.out.println("La agenda está llena");
            return false;
        }// añadirContacto




    //Erick
    public void listarContactos(){
        ArrayList<String> nombres = new ArrayList<>();
        for(int i = 0 ; i<list.length ; i++){
            if(list[i]!= null){
                nombres.add(list[i].getNombre() + " " + list[i].getApellido() + " - " + list[i].getTelefono());
            }// if

        }// for
        nombres.sort(null);
        for (String nom: nombres){
            System.out.println(nom);
        }// for
    }// listarContactos

    //Ivonne
    public String buscaContacto(String nombre, String apellido){

        return Arrays.stream(list)
                .filter(contact -> contact != null)
                .filter(contact ->
                        contact.getNombre().equals(nombre) &&
                                contact.getApellido().equals(apellido))
                .findFirst()
                .map(contact -> String.valueOf(contact.getTelefono()))
                .orElse("Not Found");

    }// buscaContacto

    //PARA ELIMINAR CONTACTO
    public Contacto buscaContc(String nombre, String apellido){

        return Arrays.stream(list)
                .filter(contact -> contact != null)
                .filter(contact ->
                        contact.getNombre().equals(nombre) &&
                                contact.getApellido().equals(apellido))
                .findFirst()
                .orElse(null);

    }

    //Jesus
    public void eliminarContacto(Contacto c){

        if(c!=null) {
            for (int i = 0; i < list.length; i++) {
                if (list[i] != null && list[i].equals(c)) {

                    for (int j = i; j < list.length - 1; j++) {
                        list[j] = list[j + 1];
                    }//for (recorre contactos)
                    list[list.length - 1] = null;
                    System.out.println("El contacto " + c.getNombre() + " se elimino correctamente de la agenda");
                    //this.numeroDeContacto--; //TODO Modificar en base a variable de registro
                    return;
                }//if
            }//for (recorre el arreglo)
        }
        else{

            System.out.println("El contacto no se encuentra en la  agenda");
        }

    }//eliminarContacto

    //Michael
    public void modificarTelefono(String nombre, String apellido, String nuevoTelefono){
        for (int i = 0 ; i < list.length ; i++) {

                 if (list[i] != null && list[i].getNombre().equals(nombre) && list[i].getApellido().equals(apellido) ) {
                    //String nuevoTel = Double.parseDouble(nuevoTelefono);
                    list[i].setTelefono(nuevoTelefono);
                    System.out.println("Número de telefono modificado");
                    return;
                 }// if
        }// for
        System.out.println("No existe el contacto");
    }// modificarTelefono

    //Isaac
    public boolean agendaLlena(){

        boolean lleno = true;
        for(int i=0; i<list.length; i++){

            if(list[i]==null){

                lleno = false;
                break;
            }// if
        }// for

        return lleno;
    }// agendaLlena

    //Isaac
    public void espaciosLibres(){

        int espacios=0;
        for(int i=0; i<list.length; i++){

            if(list[i]==null){

                espacios+=1;
            }// if
        }// for
        System.out.println("Espacios libres en la agenda: "+espacios);
    }// espaciosLibres
}// class AgendaTelefonica
