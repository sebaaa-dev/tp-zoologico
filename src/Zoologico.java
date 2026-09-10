public class Zoologico {
    private String nombre;
    private String ubicacion;
    private Animal[] animales;
    private Cuidador[] cuidadores;
    private int cantidadCuidadores;
    private int cantidadAnimales;

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.animales=new Animal[20];
        this.cuidadores=new Cuidador[10];
        this.cantidadAnimales=0;
        this.cantidadCuidadores=0;
    }

    //getters y settters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidadAnimales() {
        return cantidadAnimales;
    }

    public void setCantidadAnimales(int cantidadAnimales) {
        this.cantidadAnimales = cantidadAnimales;
    }

    public int getCantidadCuidadores() {
        return cantidadCuidadores;
    }

    public void setCantidadCuidadores(int cantidadCuidadores) {
        this.cantidadCuidadores = cantidadCuidadores;
    }
    /// metodos
    //agregar animal
    // agregar cuidador
    //mostrar animales
    //mostrar cuidadores
    // mostrar estado de todo

    public void agregarAnimal(Animal animal){
        animales[cantidadAnimales]=animal;
        cantidadAnimales++;
    }
    public void agregarCuidador(Cuidador cuidador){
        cuidadores[cantidadCuidadores]=cuidador;
        cantidadCuidadores++;
    }
    public void mostrarAnimales(){
        for(int i=0;i<cantidadAnimales;i++){
            System.out.println(" ");
            System.out.println(animales[i].estadoActual());
        }
    }
    public void mostrarCuidadores(){
        for(int i=0;i<cantidadCuidadores;i++){
            System.out.println(" ");
            System.out.println(cuidadores[i].mostrarDatos());

        }
    }
    public void mostrarInfoDeTodo(){
        System.out.println("\nzoologico: "+getNombre());
        System.out.println("ubicacion: "+getUbicacion());
        System.out.println("cantidad de animales: "+getCantidadAnimales());
        System.out.println("cantidad de cuidadores: "+getCantidadCuidadores());
        System.out.println(" ");
        System.out.println("los animales a continuacion y su estado: ");
        mostrarAnimales();
        System.out.println(" ");
        System.out.println("los cuidadores y sus datos: ");
        mostrarCuidadores();
    }






}
