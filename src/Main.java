public class Main {
    public static void main(String[] args) {

        Książka haryPoter = new Książka("Hary Potter", "Kamil", 69, true);
        Książka wladcaPierscieni = new Książka("Władca Pierścieni", "J.R.R. Tolkien", 1178, true);
        Książka wiedzmin = new Książka("Wiedźmin", "Andrzej Sapkowski", 332, false);

        System.out.println("Info o książkach");
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

    }
}
