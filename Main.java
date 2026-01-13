import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] entries = {
            "Inizia",
            "Opzioni",
            "Esci"
        };

        MenuCentrato menu_principale = new MenuCentrato(entries, "Text Novel 9000");

        menu_principale.show();
        int selected = menu_principale.select();

        // https://wiki.pokemoncentral.it/Professor_Oak#Citazioni
        Text.clear();
        Text.printWithDelay(Characters.oak[0], 15);
        String gender = scanner.nextLine();

        Text.clear();
        Text.printWithDelay(Characters.oak[1], 15);
        String name = scanner.nextLine();

        Text.clear();
        Text.printWithDelay(
            Characters.oak[2].replace("<giocatore>", name),
            15
        );
        String rivalName = scanner.nextLine();

        Text.clear();
        Text.printWithDelay(
            Characters.oak[3].replace("<giocatore>", name).replace("<rivale>", rivalName),
            15
        );
    }
}