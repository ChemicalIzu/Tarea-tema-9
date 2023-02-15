public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Cliente cliente = new Cliente ();
        Trabajador trabajador = new Trabajador ();
        persona.setEdad(21);
        persona.setNombre("Izumi");
        persona.setTelefono("123-45-67-89");
        trabajador.setSalario(2500);
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
        System.out.println(cliente.compruebaCredito(1800));
        System.out.println(trabajador.getSalario());
    }
}
class Persona{
    int edad;
     String nombre;
     String telefono;
    public void setEdad (int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTelefono (String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return telefono;
    }
}
class Cliente extends Persona{
    int credito;
    public boolean compruebaCredito (int credito){
        if (credito > 0){
            return true;
        }

        return false;
    }
}

class Trabajador extends Persona{
    int salario;
            public void setSalario (int salario){
                this.salario = salario;
            }
            public int getSalario(){
                return salario;
            }
}