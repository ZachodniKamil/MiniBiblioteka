
public class Main {
    public static void main(String[] args) {

        Ksiazka haryPoter = new Ksiazka("Hary Potter", "Kamil", 69, true);
        Ksiazka wladcaPierscieni = new Ksiazka("Władca Pierścieni", "J.R.R. Tolkien", 1178, true);
        Ksiazka wiedzmin = new Ksiazka("Wiedźmin", "Andrzej Sapkowski", 332, false);

        System.out.println("Info o Ksiazkach");
        haryPoter.wypiszInfo();
        System.out.println();
        wladcaPierscieni.wypiszInfo();
        System.out.println();
        wiedzmin.wypiszInfo();
        System.out.println();

        System.out.println("Test wypożyczania");
        haryPoter.wypozycz();
        haryPoter.wypozycz();

        System.out.println("Test zwracania");
        haryPoter.zwroc();
        haryPoter.zwroc();

        System.out.println("Wiedźmin");
        wiedzmin.wypozycz();
        wiedzmin.zwroc();
        wiedzmin.wypozycz();

        System.out.println("Władca Pierścieni");
        wladcaPierscieni.wypozycz();
        wladcaPierscieni.zwroc();


        Czytelnik czytelnik1 = new Czytelnik("Jan", "Kowalski", 1);
        Czytelnik czytelnik2 = new Czytelnik("Anna", "Nowak", 2);

        czytelnik1.wypiszDane();
        czytelnik1.zwiekszLiczbeWypozyczen();
        czytelnik1.wypiszDane();
        czytelnik1.zmniejszLiczbeWypozyczen();
        czytelnik1.wypiszDane();

        czytelnik2.wypiszDane();

        //zad3
        Biblioteka biblioteka = new Biblioteka(20);
        biblioteka.dodajKsiazke(haryPoter);
        biblioteka.dodajKsiazke(wladcaPierscieni);
        biblioteka.dodajKsiazke(wiedzmin);

        biblioteka.wypiszDostepneKsiazki();

        System.out.println("Liczba dostępnych: " + biblioteka.policzDostepneKsiazki());

        Ksiazka znaleziona = biblioteka.znajdzKsiazkePoTytule("Hary Potter");

        if (znaleziona != null) {
            System.out.println("Znaleziono książkę:");
            znaleziona.wypiszInfo();
        } else {
            System.out.println("Nie znaleziono książki.");
        }


        System.out.println("-----ZAD4-----");
        biblioteka.wypozyczKsiazke("Hary Potter", czytelnik1);


        biblioteka.wypiszDostepneKsiazki();


        biblioteka.zwrocKsiazke("Hary Potter", czytelnik1);


        biblioteka.wypiszDostepneKsiazki();
    }
}