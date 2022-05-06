package Grafikeditor;

abstract  class Figur {
    protected int x, y;
    public Figur(int x, int y) {
    }
        public abstract int flaeche ();
}

class Rechteck extends Figur {
    private int breite, hoehe;
    public Rechteck(int x, int y, int b, int h) {
        super(x, y);
        breite = b;
        hoehe = h;
    }
    public int flaeche() {
        return breite * hoehe;
    }
}

class RechteckAbgekantet extends Rechteck {
    private int kante;
    public RechteckAbgekantet(int x, int y, int b, int h, int k){
    super(x,y,b,h);
    kante = k;
    }

    @Override
    public int flaeche(){
    return super.flaeche() -2 *kante*kante;
    }
}

class Kreis extends Figur{
    private int radius;
    public Kreis(int x, int y, int r) {
    super(x,y);
    radius = r;
    }

    @Override
    public int flaeche() {
        return 0;
    }
}

public class Testfiguren {
    public static void main(String[] args) {
        Rechteck r = new Rechteck(10,10,100,50);
        System.out.println(r.flaeche());

        RechteckAbgekantet ra = new RechteckAbgekantet(10, 10, 100, 50, 10);
        r = ra;
        System.out.println(ra.flaeche());

        Figur f = ra;
        System.out.println(f.flaeche());
        f = new Kreis(10, 10, 50);
        System.out.println(f.flaeche());
    }
}