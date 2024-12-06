package StringFormattingExample;

public class TextBlock {

    public static void main(String[] args) {
        String BulletList = " Print a Bullet list : \n "+ "\u2022  \t First Point \n"+ "\u2022 \tSub Point \n ";
        System.out.println(BulletList);

        // Text Block Example
        String textBlock = """
                Print Bullet List:
                \u2022 first point
                    \u2022 second point
                """;
        System.out.println(textBlock);

        // printf Examples
        int age = 23;
        System.out.printf("The int value is %d %n", age);
        System.out.printf("Same value in Float will be %.2f%n", (float) age); // Casting

        // Formatting Numbers with width
        for (int i = 1; i <= 100000; i *= 10) {
            System.out.format("Printing %6d %n", i);
        }

        // String.format Example
        String formatedString = String.format("Your age is %d", age);
        System.out.println(formatedString);

        // info Method Example
        info("Hello");
        info("");
        info("\t     \n");

        // Indexing and Comparing Strings
        String s = "Hello World";
        System.out.printf("Index of First L = %d \n", s.indexOf('l'));
        System.out.printf("Index of Last L = %d \n", s.lastIndexOf('l'));
        System.out.printf("Index of 3RD L = %d \n", s.indexOf('l', 3));
        System.out.printf("Index of Last L = %d \n", s.lastIndexOf('l', 8));

        System.out.printf("Index of r = %d \n", s.indexOf('r'));
        System.out.printf("Index of World = %d \n", s.indexOf("World"));

        // String Case Comparisons
        String sLower = s.toLowerCase();
        if (s.equals(sLower)) {
            System.out.println("Value Matches");
        }
        if (s.equalsIgnoreCase(sLower)) {
            System.out.println("Value Matches, ignoring cases");
        }
        if (s.startsWith("Hello")) {
            System.out.println(" Yes it starts with hello");
        }
        if (s.startsWith("world")) {
            System.out.println(" Yes it ends with World");
        }
        if (s.contains("World")) {
            System.out.println(" Yes it contains the word - World");
        }
        if (s.contentEquals("World")) {
            System.out.println(" Yes it contents matches ");
        }

        // Date String Manipulations
        String dob = "26/03/2004";
        int startingIndex = dob.indexOf("2004");
        System.out.printf("Starting index: %d\n", startingIndex);
        System.out.println("BirthYear = " + dob.substring(startingIndex));
        System.out.println("Birth Month  = " + dob.substring(3, 5));

        // Joining Strings and Replacing
        String newDate = String.join("/", "25", "11", "1992");
        System.out.println("new Date = " + newDate);
        newDate = newDate.concat("/");
        System.out.println(newDate);
        System.out.println(dob.replace('/', '-'));
        System.out.println(dob.replaceFirst("/", "-"));
        System.out.println(dob.replaceAll("/", "--"));

        // String Repeat and Indentation
        System.out.println("ABC \n".repeat(3).indent(2));
        System.out.println("----".repeat(10));

        // StringBuilder Example
        String word1 = "Bla" + "bla";
        word1.concat(" and goodbye");
        print(word1);
        StringBuilder word2 = new StringBuilder("bla" + "bla"); // We cannot pass literal to StringBuilder; we have to pass it in constructor
        print(word2);
    }

    /* ----------Methods ----------*/

    public static void info(String s) {
        int length = s.length();
        if (s.isEmpty()) {
            System.out.println("GIVEN STRING IS EMPTY");
        } else if (s.isBlank()) {
            System.out.println("GIVEN STRING IS Blank ");
        } else {
            System.out.printf("Length of string is : %d \n", length);
            System.out.printf("First char in string : %c %n", s.charAt(0));
            System.out.printf("First char in string : %c %n", s.charAt(length - 1));
        }
    }

    public static void print(String s) {
        System.out.println("String = " + s);
        System.out.println("Length = " + s.length());
    }

    public static void print(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("Length = " + builder.length());
    }
}
