import java.util.*;
import java.util.regex.*;

public class CardFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("(\\d+)\\s+(.+?)\\s+\\[([A-Za-z0-9]+)\\s+(\\d+)\\]");

        System.out.println("Paste your list below. Press ENTER on a blank line when done:\n");

        while (true) {
            String line = scanner.nextLine();

            if (line.trim().isEmpty()) {
                break;
            }

            Matcher matcher = pattern.matcher(line);

            if (matcher.matches()) {
                String qty = matcher.group(1);
                String name = matcher.group(2);
                String set = matcher.group(3).toLowerCase();
                String number = matcher.group(4);

                System.out.println(qty + "x " + name + " (" + set + ") " + number);
            }
        }

        scanner.close();
    }
}