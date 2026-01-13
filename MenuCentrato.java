public class MenuCentrato extends Menu {
    MenuCentrato(String[] entries, String title) {
        super(entries, title);   
    }

    public void show() {
        int titleLength = Text.print("\n ~ " + title + " ~ \n", "black", "cyan");
        int maxLength = Math.max(this.entries[0].length(), titleLength);

        for(int i = 0; i < entries.length; i++) {
            String entry = entries[i];
            int entryLength = entry.length();
            
            if(entryLength > maxLength) maxLength = entryLength;
        }

        for(int i = 0; i < entries.length; i++) {
            String entry = entries[i];
            int entryLength = entry.length();
            int spacing = (maxLength-entryLength)/2;
            System.out.print((i + 1) + " - ");

            for(int j = 0; j < spacing - 4; j++) {
                System.out.print(" ");
            }
            System.out.println(entry);
        }
    }
}