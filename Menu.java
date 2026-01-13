import java.util.*;

public class Menu {
    String[] entries;
    String title;
    Scanner scanner = new Scanner(System.in);


    Menu(String[] entries, String title) {
        this.entries = entries;
        this.title = title;
    }

    public void show() {
        Text.print("\n ~ " + title + " ~ \n", "black", "cyan");
        for(int i = 0; i < entries.length; i++) {
            String entry = entries[i];

            System.out.println((i + 1) + " - " + entry);
        }
    }

    public int select() {
        int selected = scanner.nextInt();

        return selected;
    }
}