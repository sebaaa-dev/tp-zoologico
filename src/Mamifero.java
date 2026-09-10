public class Mamifero extends Animal {
    private TipoPelaje pelajeEstado;

    public Mamifero(String nombre,String especie,String hambre,String salud,String higiene,String sonidoQueHace,TipoPelaje estadoPelaje){
        super(nombre,especie,hambre,salud,higiene,sonidoQueHace);
        this.pelajeEstado=estadoPelaje;
    }

    //getters y setters


    public TipoPelaje getEstado() {
        return pelajeEstado;
    }

    public void setEstado(TipoPelaje estadoPelaje) {
        this.pelajeEstado = estadoPelaje;
    }

    ///metodos
    //amamantar
    //cambiarpelaje

    public void amamantar(){
        System.out.println(" ");
        System.out.println("**el "+getNombre()+" amamanta**");
    }

    public void cambiarPelaje(){
        System.out.println(" ");
        System.out.println("**se le cae el pelaje a "+getNombre()+",pero ya le esta saliendo**");
        this.pelajeEstado=TipoPelaje.CORTO;
    }


    /// metodos abstractos de animal
    @Override
    public Especialidad getTipo() {
        return Especialidad.MANIFEROS;
    }
}

