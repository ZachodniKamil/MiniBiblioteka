
import java.util.Objects;

public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc){
        this.ksiazki = new Ksiazka[pojemnosc];
        this.liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka ksiazka){
        if(liczbaKsiazek < ksiazki.length){
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
            System.out.println("Ksiazka zostala dodana");
        } else {
            System.out.println("Brak miejsca dla ksiazka");
        }
    }

    public void wypiszDostepneKsiazki() {
        System.out.println("Dostepne ksiazki:");
        for(int i=0;i<liczbaKsiazek;i++){
            if(ksiazki[i].jestDostepna()){
                ksiazki[i].wypiszInfo();
            }
        }
    }

    public Ksiazka znajdzKsiazkePoTytule(String tytulSzukanejKsiazki){
        for(int i=0;i<liczbaKsiazek;i++){
            if(Objects.equals(ksiazki[i].dajTytul(), tytulSzukanejKsiazki)) {
                return ksiazki[i];
            }
        }
        return null;
    }

    public int policzDostepneKsiazki() {
        int licznik = 0;

        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].jestDostepna()) {
                licznik++;
            }
        }

        return licznik;
    }

    public void wypozyczKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);

        if (ksiazka != null) {
            if (ksiazka.jestDostepna()) {
                ksiazka.wypozycz();
                czytelnik.zwiekszLiczbeWypozyczen();
                System.out.println("Czytelnik wypożyczył książkę");
            } else {
                System.out.println("Książka jest niedostępna");
            }
        } else {
            System.out.println("Nie znaleziono książki");
        }
    }

    public void zwrocKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);

        if (ksiazka != null) {
            ksiazka.zwroc();
            czytelnik.zmniejszLiczbeWypozyczen();
            System.out.println("Czytelnik zwrócił książkę");
        } else {
            System.out.println("Nie znaleziono książki");
        }
    }
}
