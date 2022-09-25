public class Main {

    public static void main(String[] args) {
        suma(2,3,4);
        Coche coche = new Coche(2);
        System.out.println(coche.numeroPuerta);
        System.out.println(coche.aumentarPuertas());

    }
    public static int suma(int a, int b, int c) {

        return a + b + c;
    }
}

class Coche {
    int numeroPuerta;

    public Coche(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public int aumentarPuertas() {
        return ++this.numeroPuerta;
    }
}
