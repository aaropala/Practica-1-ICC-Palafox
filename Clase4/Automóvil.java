
public class Automóvil {

    int ruedas;
    int asientos;
    boolean estandar;
    int velocidad;
    int puertas;
    boolean llantaRefacción;

    public Automóvil(){
        ruedas = 4;
        asientos = 5;
        estandar = true;
        velocidad = 0;
    }

    public Automóvil(int ru,int asi, boolean est){
        ruedas = ru;
        asientos = asi;
        estandar = est;
        velocidad = 0;
    }

    public Automóvil(int ru,int asi, int vel){
        ruedas = ru;
        asientos = asi;
        estandar = true;
        velocidad = vel;
    }

    public int getNumRuedas(){
        return ruedas;
    }

    public int getVelocidad(){
        return velocidad;
    }

    public void ponerPrimera(){
        velocidad = 20;
    }

    public void ponerSegunda(){
        velocidad = 40;
    }

    public void ponerTercera(){
        velocidad = 60;
    }

    public void ponerCuarta(){
        velocidad = 80;
    }

    public void ponerQuinta(){
        velocidad = 100;
    }
    public void ponerVelocidad(int vel){
        velocidad = vel;
    }

    public void frenar (){
        velocidad = 0;
    }

    public static void main(String[] args){
        Automóvil miAuto = new Automóvil();
        Automóvil otroAuto = new Automóvil(3,2 , true);
        Automóvil tercerAuto = new Automóvil(6,5, 15);

        System.out.println(miAuto.getNumRuedas());
        System.out.println(miAuto.getVelocidad());
        miAuto.ponerPrimera();
        System.out.println(miAuto.getVelocidad());
        miAuto.ponerSegunda();
        System.out.println(miAuto.getVelocidad());
        miAuto.ponerTercera();
        System.out.println(miAuto.getVelocidad());
        miAuto.ponerCuarta();
        System.out.println(miAuto.getVelocidad());
        miAuto.ponerQuinta();
        System.out.println(miAuto.getVelocidad());
        miAuto.frenar();
        System.out.println(miAuto.getVelocidad());
        miAuto.ponerVelocidad(85);
        System.out.println(miAuto.getVelocidad());
        System.out.println(otroAuto.getNumRuedas());
        System.out.println(tercerAuto.getNumRuedas());
        System.out.println("Yo " + "tengo " + "18 " + "años " + "de " + "edad.");
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}