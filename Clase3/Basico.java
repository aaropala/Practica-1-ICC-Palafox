public class Basico {

  public static void main (String[] args){
    int numero=1234342;
    numero=123;
    double pi= Math.PI;
    numero=(int)pi;

    char letra='a';
    String frase="hola";
    boolean termino = false;
    System.out.println(numero);
    final int IVA=16;
    //IVA=16;
    System.out.println(IVA);
    //a
    //c=8;
    //d=b;
    //c=a*a +  b*b;
    //System.out.println(c)

    int a= 8, b = 3, c = -8, d = 25;
    a=b=c=0;
    a=b=c=d*2;
    System.out.println(a);

    int segundo=1;
    int minuto=60*segundo;
    int hora=60*minuto;
    int dia=24*hora;
    int semana=7*dia;
    int mes=4*semana;
    int febrero=28*dia;
    System.out.println(febrero);

    int veces=6;
    //++veces + 4;
    System.out.println(++veces + 4);
    System.out.println(veces);
    veces--;
    System.out.println(veces);
    //int i=90, j=5;
    //i/=45;
    //i*=j+5;
    //j=20;
    //System.out.println(i);
    //System.out.println(j);
    //System.out.println(i>=j);
    //System.out.println(mes==febrero);

    //System.out.println(true&&true);
    //System.out.println(true&&false);
    //System.out.println(false&&false);
    //System.out.println(false&&true);
    //System.out.println(true||true);
    //System.out.println(false||false);
    //System.out.println(true||false);
    //System.out.println(false||true);
    //System.out.println(!true);
    //System.out.println(!false);

    String hola="hola ";
    String mundo="k ase";
    String saludo=hola+mundo;
    System.out.println(saludo);
    System.out.println("Anita "+"lava "+"la "+"tina");

    int calificacion= 7;
    System.out.println("Su calificacion es "+calificacion);

    a=-8; 
    b=25;
    System.out.println("a="+a+", b="+b+" y la suma es "+(a+b));
    int i;
    float f;
    i=(int)3.8;
    f=4.5f;
    long largo = 94324782732423L;
    int entero = (int) largo;
    System.out.println(largo);

  }

}