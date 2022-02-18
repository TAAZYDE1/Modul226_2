package Lektion2;

public class Personen {
    public static void main(String args[]) {
        Fachangestellter personal1= new Fachangestellter();
        Fachangestellter personal2= new Fachangestellter();
        Chef personal3 = new Chef();
        Fachangestellter personal4= new Fachangestellter();
        personal3.name ="Sattler";
        personal3.vorname ="Beatrice";
        personal3.abteilung ="Verkauf";
        personal1.name ="Klein";
        personal1.vorname ="Thomas";
        personal1.vorgesetzter = personal3; //*1
        personal4 = personal1; //*2
        personal4.vorgesetzter = personal3; //*3
        personal1 = (Fachangestellter) personal4; //*5
    }

}

//Firma f = new Firma(
// new Person[] {new Chef("Sattler", "Beatrice",25, "Verkauf")} );

