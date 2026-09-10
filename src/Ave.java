public class Ave extends Animal{
    private CapacidadDeVuelo capacidadDeVuelo;
    private EstadoPlumas estadoPlumas;

    public Ave(String nombre,String especie,String hambre,String salud,String higiene,String sonidoQueHace,CapacidadDeVuelo capacidadDeVuelo,EstadoPlumas estadoDeLasPlumas){
        super(nombre, especie, hambre, salud, higiene,sonidoQueHace);
        this.capacidadDeVuelo=capacidadDeVuelo;
        this.estadoPlumas=estadoDeLasPlumas;
    }

    public CapacidadDeVuelo getCapacidadDeVuelo() {
        return capacidadDeVuelo;
    }

    public EstadoPlumas getEstadoPlumas() {
        return estadoPlumas;
    }

    public void setCapacidadDeVuelo(CapacidadDeVuelo capacidadDeVuelo) {
        this.capacidadDeVuelo = capacidadDeVuelo;
    }

    public void setEstadoPlumas(EstadoPlumas estadoPlumas) {
        this.estadoPlumas = estadoPlumas;
    }

    /// metodos
    //mudar plumaas
    //volar

    public void cambiarPlumas(){
        if(this.estadoPlumas==EstadoPlumas.BIEN){
            System.out.println("no hace falta cambiar las plumas porque estan bien");
        }else{
            System.out.println("ya tiene plumas nuevas");
            this.estadoPlumas=EstadoPlumas.BIEN;
        }
    }

    public void volar(){
        if (this.capacidadDeVuelo==CapacidadDeVuelo.VUELA){
            System.out.println("**vuela bien**");
        }else if (this.capacidadDeVuelo==CapacidadDeVuelo.VUELO_LIMITADO){
            System.out.println("**vuela pero le cuesta, mas q volar planea**");
        }else{
            System.out.println("**intenta pero no puede**");
        }
    }

    /// metodos abstractos de animal
    @Override
    public Especialidad getTipo() {
        return Especialidad.AVES;
    }
}
