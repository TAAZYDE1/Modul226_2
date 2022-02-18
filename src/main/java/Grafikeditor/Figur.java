package Grafikeditor;

class Figur {
    int x,y;
}
class Rechteck extends Figur{
    int breite, hoehe;
}
class Kreis extends Figur{
    int radius;
}
class Linie extends Figur{
    int endX, endY;
}

public class Testfiguren {
    public static void main(String[] args){
        Kreis r = new Kreis();
        r.x = 100;
        r.y = 150;
        r.breite = 20;
        r.hoehe = 30;

        Figur f;
        f = r;
        f.x = 400;
        f.breite = 50;

        Kreis k = new Kreis();
        f = k;

        r = k;
        r = f;
    }
}