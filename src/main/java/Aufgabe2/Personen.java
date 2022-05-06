package Aufgabe2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract class Person {
    private String name;
    private String vorname;
    private int alter;
    private int personalNummer;

    public String print(){
        return (vorname + " " + name + " " + personalNummer);
    }

    public Person(String name, String vorname, int alter, int personalNummer) {
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;
        this.personalNummer = personalNummer;
    }

    public abstract int calculateVacations(int alter);
}
class Chef extends Person {
    private String abteilung;

    public Chef(String name, String vorname, int alter, int personalNummer, String abteilung) {
        super(name, vorname, alter, personalNummer);
        this.abteilung = abteilung;
    }
    @Override
    public String print(){
        return super.print() + " " + abteilung;
    }
    @Override
    public int calculateVacations(int alter) {
        int vacations = 4;

        if(alter >= 50){
            vacations += 1;
        }
        if(alter >= 60){
            vacations += 1;
        }

        return vacations;
    }
}
class Fachangestellter extends Person {
    private Chef vorgesetzter;

    public Fachangestellter(String name, String vorname, int alter, int personalNummer, Chef vorgesetzter) {
        super(name, vorname, alter, personalNummer);
        this.vorgesetzter = vorgesetzter;
    }
    @Override
    public int calculateVacations(int alter) {
        int vacations = 4;

        if(alter >= 50){
            vacations++;
        }
        if(alter >= 60){
            vacations++;
        }

        return vacations;
    }
}
class Lernender extends Person {
    private int lehrjahr;
    public Lernender(String vorname, String name, int alter, int personalNummer, int lehrjahr) {
        super(name, vorname, alter, personalNummer);
        this.lehrjahr = lehrjahr;
    }

    @Override
    public String print() {
        return super.print() + " " + lehrjahr;
    }

    @Override
    public int calculateVacations(int alter) {
        return 5;
    }
}

class Firma {

    private Person[] mitarbeiter;

    public Firma (Person[] mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }
}
public class Personen {
    public static void main(String[] args) {
        Person[] angestellte = new Person[2];
        angestellte[0] = new Chef("Sattler", "Beatrice", 35, 23, "Verkauf");
        angestellte[1] = new Fachangestellter("Denis", "Kohler", 51, 76, (Chef)angestellte[0]);

        for (Person angestellter : angestellte) {
            System.out.println(angestellter.print() + " Ferienwochen: " + angestellter.calculateVacations(angestellter.getAlter()));
        }
    }
}
