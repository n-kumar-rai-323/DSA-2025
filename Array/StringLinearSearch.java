public class StringLinearSearch {

    public static int linearSearch(String[] menu, String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) { // Use .equals() for String comparison
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        String[] menu = {"Nishan", "Alisha", "Gita", "Sita"};
        String key = "Gita"; // The string you're searching for

        int index = linearSearch(menu, key);

        if (index == -1) {
            System.out.println("'" + key + "' not found in the menu.");
        } else {
            System.out.println("'" + key + "' found at index: " + index);
        }

        String key2 = "Ram";
        int index2 = linearSearch(menu, key2);

        if (index2 == -1) {
            System.out.println("'" + key2 + "' not found in the menu.");
        } else {
            System.out.println("'" + key2 + "' found at index: " + index2);
        }

    }
}