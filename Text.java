import java.util.HashMap;
import java.util.Map;
import java.lang.Thread;

public class Text {
    public static final HashMap<String, String> colorMap =
        new HashMap<>(Map.of(
            "reset"  , "\u001B[0m",
            "black"  , "\u001B[30m",
            "red"    , "\u001B[31m",
            "green"  , "\u001B[32m",
            "yellow" , "\u001B[33m",
            "blue"   , "\u001B[34m",
            "purple" , "\u001B[35m",
            "cyan"   , "\u001B[36m",
            "white"  , "\u001B[37m"
        ));

    public static final HashMap<String, String> backgroundMap =
        new HashMap<>(Map.of(
            "black"  , "\u001B[40m",
            "red"    , "\u001B[41m",
            "green"  , "\u001B[42m",
            "yellow" , "\u001B[43m",
            "blue"   , "\u001B[44m",
            "purple" , "\u001B[45m",
            "cyan"   , "\u001B[46m",
            "white"  , "\u001B[47m"
        ));


    public static int print(String text) {
        return print(text, "white", "black");
    }

    public static int println(String text) {
        return println(text, "white", "black");
    }

    public static int println(String text, String color, String background) {
        int length = print(text, color, background);
        System.out.println();
        return length;
    }

    public static int print(
        String text,
        String color,
        String background
    )  {
        String colorCode = colorMap.get(color);
        String backgroundCode = backgroundMap.get(background);

        System.out.print(
            colorCode +
            backgroundCode +
            text +
            colorMap.get("reset")
        );

        return text.length();
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}