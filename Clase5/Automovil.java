
public class Automovil {

    int ruedas;
    int asientos;
    boolean estandar;
    int velocidad;
    int puertas;
    boolean llantaRefaccion;

    public Automovil(){
        ruedas = 4;
        asientos = 5;
        estandar = true;
        velocidad = 0;
    }

    public Automovil(int ru,int asi, boolean est){
        ruedas = ru;
        asientos = asi;
        estandar = est;
        velocidad = 0;
    }

    public Automovil(int ru,int asi, int vel){
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

        int a=3, b=4, c=5;
        a=b=0;
        a=2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Automovil miAuto = new Automovil();
        Automovil mate = miAuto;
        Automovil franchesco = miAuto;

        franchesco.ponerVelocidad(50);
        System.out.println(miAuto.getVelocidad());
        System.out.println(mate.getVelocidad());
        System.out.println(franchesco.getVelocidad());
        miAuto=null;
        //System.out.println(miAuto.getVelocidad());
        miAuto = new Automovil();
        System.out.println(miAuto.getVelocidad());
        System.out.println(mate.getVelocidad());
        System.out.println(franchesco.getVelocidad());
        franchesco.ponerVelocidad(100);
        System.out.println(miAuto.getVelocidad());
        System.out.println(mate.getVelocidad());
        System.out.println(franchesco.getVelocidad());
        miAuto.ponerVelocidad(75);
        System.out.println(miAuto.getVelocidad());
        System.out.println(mate.getVelocidad());
        System.out.println(franchesco.getVelocidad());

        mate = miAuto;
	miAuto.ponerVelocidad(75);
	System.out.println(miAuto.getVelocidad());
	System.out.println(mate.getVelocidad());
	System.out.println(franchesco.getVelocidad());

	miAuto = null;
	miAuto = new Automovil();
	System.out.println(miAuto.getVelocidad());
	System.out.println(mate.getVelocidad());
	System.out.println(franchesco.getVelocidad());

    }
}
