public class Main3 {
    public static void main (String [] args){
        Cliente cliente = new Cliente();
        cliente.setEdad(25);
        cliente.setNombre("Roberto");
        cliente.setTelefono("123-45-67-89");
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.compruebaCredito(2500));
    }
}
