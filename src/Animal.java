public abstract class Animal {
    private String nombre;
    private String especie;
    private String hambre;
    private String salud;
    private String higiene;

    public Animal(String nombre,String especie,String hambre,String salud,String higiene){
        this.nombre=nombre;
        this.especie=especie;
        this.hambre=hambre;
        this.higiene=higiene;
        this.salud=salud;
    }

    //getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getHambre() {
        return hambre;
    }

    public String getHigiene() {
        return higiene;
    }

    public String getSalud() {
        return salud;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setHambre(String hambre) {
        this.hambre = hambre;
    }

    public void setHigiene(String higiene) {
        this.higiene = higiene;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    /// metodos
    //comer
    //ensuciarse
    //enfermarse
//estadoActual
    //emitir sonido




}
