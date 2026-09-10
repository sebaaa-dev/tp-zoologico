public class Reptil extends Animal{
    private boolean esVenenoso;
    private boolean tienePatas;

    public Reptil(String nombre,String especie,String hambre,String salud,String higiene,String sonidoQueHace,boolean esVenenoso,boolean tienePatas){
        super(nombre, especie, hambre, salud, higiene,sonidoQueHace);
        this.esVenenoso=esVenenoso;
        this.tienePatas=tienePatas;
    }

    //getters y setters
    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public boolean isTienePatas() {
        return tienePatas;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public void setTienePatas(boolean tienePatas) {
        this.tienePatas = tienePatas;
    }

    ///metodos
    //mudar piel

    public void mudarPiel(){
        System.out.println("**muda de piel el "+getNombre()+"**");
    }

    /// metodos abstractos de animal
    @Override
    public Especialidad getTipo() {
        return Especialidad.REPTILES;
    }

}
