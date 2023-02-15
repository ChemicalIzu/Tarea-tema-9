public class Main2 {
    public static void main(String[] args){
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(48);
        trabajador.setNombre("Ana");
        trabajador.setTelefono("123-45-67-89");
        trabajador.setSalario(1500);
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());

    }
}
