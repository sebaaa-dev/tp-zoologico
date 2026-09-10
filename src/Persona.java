public abstract class Persona {
    private String nombre;
    private String dni;
    private String legajo;
    private double salario;

    //constru
    public Persona(String nombre,String dni,String legajo,double salario){
        this.nombre=nombre;
        this.dni=dni;
        this.legajo=legajo;
        this.salario=salario;
    }
    //getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getDni() {
        return dni;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    ///metodos
    //mostrarDatos
    //calcularSalarioAnual

public String mostrarDatos(){
    return " nombre: "+this.nombre+"\n dni: "+this.dni+"\n legajo: "+this.legajo+"\n salario: "+this.salario+" ";
}

public double calcularSalarioAnual(){
    return salario*12;
}

}
