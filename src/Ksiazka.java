

public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;


    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna){
        this.autor = autor;
        this.tytul = tytul;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    public void wypiszInfo() {
        System.out.println("tytul: " + this.tytul);
        System.out.println("autor: " + this.autor);
        System.out.println("LicbzaStron: " + this.liczbaStron);
        System.out.println("Dostępna: " + this.dostepna);
    }

    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Wypożyczono: " + tytul);
        } else {
            System.out.println("Książka jest już wypożyczona");
        }
    }

    public void zwroc() {
        if (!dostepna) {
            dostepna = true;
            System.out.println("Zwrócono: " + tytul);
        } else {
            System.out.println("Książka nie jest wypożyczona");
        }
    }

    public boolean jestDostepna(){
        return this.dostepna;
    }

    public String dajTytul(){
        return this.tytul;
    }
}
