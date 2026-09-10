
/// este tp lo hicimos en un grupo d 3, pero nos dividimos, haciendo ellos el modelo del club y yo el zoologico (sebastian vallejos)
/// y los demas integrantes son joaquin core y octavio bellini(creo).
public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico("zoologico utn", "Mar del Plata");

        Mamifero leon = new Mamifero("milei","leon","con hambre","debil","limpio","roar", TipoPelaje.CORTO);
        Reptil serpiente = new Reptil("cristina","serpiente","llena","vieja","sucia","zzz",true,false);
        Ave loro = new Ave("mordecai","pajaro azul grande","normal","bien","limpio","wooooo",CapacidadDeVuelo.NO_VUELA,EstadoPlumas.BIEN);




        Cuidador juan = new Cuidador("Juan","1234567","654321",1200, Especialidad.MANIFEROS);
        Cuidador ayelen = new Cuidador("ayelen","2345678","765432",1000,Especialidad.AVES);

        zoo.agregarAnimal(leon);
        zoo.agregarAnimal(serpiente);
        zoo.agregarAnimal(loro);

        zoo.agregarCuidador(juan);
        zoo.agregarCuidador(ayelen);

    //    zoo.mostrarCuidadores();

      //  zoo.mostrarAnimales();

        //zoo.mostrarInfoDeTodo();

        leon.cambiarPelaje();
leon.estadoActual();
    }
}