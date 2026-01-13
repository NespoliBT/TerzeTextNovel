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

        Text.clear();
        
        Text.println("Come ti chiami?", "yellow", "black");
        String name = scanner.nextLine();

        Text.println("Benvenut_, " + name + "!", "green", "black");
    }
}