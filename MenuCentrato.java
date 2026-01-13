public class MenuCentrato extends Menu {
    MenuCentrato(String[] entries) {
        super(entries);   
    }

    public void show() {
        int maxLength = this.entries[0].length();

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
            for(int j = 0; j < spacing; j++) {
                System.out.print(" ");
            }
            System.out.println(entry);
        }
    }
}