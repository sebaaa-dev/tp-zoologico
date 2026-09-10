public abstract class Animal {
    private String nombre;
    private String especie;
    private String hambre;
    private String salud;
    private String higiene;
    private String sonidoQueHace;

    public Animal(String nombre,String especie,String hambre,String salud,String higiene,String sonidoQueHace){
        this.nombre=nombre;
        this.especie=especie;
        this.hambre=hambre;
        this.higiene=higiene;
        this.salud=salud;
        this.sonidoQueHace=sonidoQueHace;
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

    public String getSonidoQueHace() {
        return sonidoQueHace;
    }

    public void setSonidoQueHace(String sonidoQueHace) {
        this.sonidoQueHace = sonidoQueHace;
    }

    /// metodos
    //comer
    //ensuciarse
    //enfermarse
    //estadoActual
    //emitir sonido

    public void comer(){
        System.out.println("");
        System.out.println("**"+getNombre()+" come**");
        this.hambre="lleno";
    }
    public void ensuciarse(){
        System.out.println(" ");
        System.out.println("**"+getNombre()+" se ensucia**");
        this.higiene="sucio";
    }
    public void enfermarse(){
        System.out.println("");
        System.out.println("**"+getNombre()+" se enferma**");
        this.salud="enfermito";
    }
    public String estadoActual(){

        return "\n_nombre: "+getNombre()+"\n_especie: "+getEspecie()+"\n_hambre: "+getHambre()+"\n_higiene: "+getHigiene()+"\n_salud: "+getSalud();
    }
    public void emitirSonido(){
        System.out.println("hace "+getSonidoQueHace());
    }


    /// metodo abstracto
    public abstract Especialidad getTipo();



}
