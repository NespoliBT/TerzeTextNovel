public class Main {
    public static void main(String[] args) {
        String[] entries = {
            "Start",
            "Options",
            "Exit"
        };

        Menu menu_principale = new Menu(entries);
        Menu menu_centrato = new MenuCentrato(entries);

        menu_principale.show();
        int selected = menu_principale.select();

        menu_centrato.show();
        selected = menu_centrato.select();
    }
}