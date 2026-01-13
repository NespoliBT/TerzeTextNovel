import java.util.*;

public class Menu {
    String[] entries;
    Scanner scanner = new Scanner(System.in);

    Menu(String[] entries) {
        this.entries = entries;
    }

    public void show() {
        for(int i = 0; i < entries.length; i++) {
            String entry = entries[i];

            System.out.println((i + 1) + " ~ " + entry);
        }
    }

    public int select() {
        int selected = scanner.nextInt();

        return selected;
    }
}