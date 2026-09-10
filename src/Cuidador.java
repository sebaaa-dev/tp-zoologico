public class Cuidador extends Persona{
    private Especialidad especialidad;

    public Cuidador(String nombre, String dni, String legajo, double salario, Especialidad especialidad) {
        super(nombre, dni, legajo, salario);
        this.especialidad = especialidad;
    }

    //getter y setter

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    ///metodos
    //alimentar
    //vacunar
    // limpiar
    // puede cuidar
    //

    public boolean puedeCuidar(Animal animal){
        if (animal.getTipo()==especialidad){
            return true;
        }else{
            return false;
        }
    }
    public void alimentar(Animal animal){
        System.out.println("");
        if (puedeCuidar(animal)==true){
            System.out.println("**el cuidador "+getNombre()+" alimento a "+animal.getNombre()+"**");
            animal.setHambre("alimentado");
        }else {
            System.out.println("no puede porque el animal no es de su especialidad");
        }
    }
    public void vacunar(Animal animal){
        System.out.println(" ");
        if (puedeCuidar(animal)==true){
            System.out.println("**el cuidador "+getNombre()+" vacuno a "+animal.getNombre()+"**");
            animal.setSalud("vacunado");
        }else {
            System.out.println("no puede porque el animal no es de su especialidad");
        }
    }
    public void limpiar(Animal animal){
        System.out.println(" ");
        if (puedeCuidar(animal)==true){
            System.out.println("**el cuidador "+getNombre()+" limpio a "+animal.getNombre()+"**");
            animal.setHambre("limpio");
        }else {
            System.out.println("no puede porque el animal no es de su especialidad");
        }
    }




}
