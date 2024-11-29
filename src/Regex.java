import java.util.regex.*;

public class Regex {
    public static void main(String[] args) {
        String text = "I have 2 apples and 3 oranges.";
        String pattern = "\\d"; // Pattern to find any digit

        // Compile the pattern
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(text);

        // Find matches
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}
