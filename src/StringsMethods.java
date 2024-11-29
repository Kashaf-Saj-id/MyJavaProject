import java.util.Arrays;

public class StringsMethods {
    public static void main(String[] args) {
        String str1 = "hello";
        //length():
        //Returns the length of the string (the number of characters in it).
        System.out.println(str1.length());
        //charAt(int index):
        //Returns the character at the specified index in the string.
        System.out.println(str1.charAt(1));
        //substring(int start):
        //Returns a substring starting from the specified index to the end of the string.
        System.out.println(str1.substring(2));
        //substring(int start, int end)
        //Returns a substring from the start index to the end index (exclusive).
        System.out.println(str1.substring(1, 4));
       // equals(String other)
       // Compares the string to the specified string for equality (case-sensitive).
        String stra = "Hello";
        String strb = "Hello";
        String strc = "hello";
        System.out.println(stra.equals(strb)); // Output: true
        System.out.println(stra.equals(strc)); // Output: false
        //equalsIgnoreCase(String other)
        //Compares the string to the specified string, ignoring case.
        String strd = "Hello";
        String stre = "hello";
        System.out.println(strd.equalsIgnoreCase(stre)); // Output: true
        //To Lower and upper case
        String str = "Hello, World!";
        System.out.println(str.toLowerCase()); // Output: hello, world!
        System.out.println(str.toUpperCase());
        //trim()
        //Removes leading and trailing whitespace from the string.
        String str2 = "   Hello, World!   ";
        System.out.println(str2.trim()); // Output: Hello, World!
        //replace(char oldChar, char newChar)
        //Replaces all occurrences of the specified old character with the new character.
        String str3 = "Hello, World!";
        System.out.println(str3.replace('o', '0')); // Output: Hell0, W0rld!
        //replaceAll(String regex, String replacement)
        //Replaces all substrings that match the given regular expression with the specified replacement.
        String str4 = "123-456-7890";
        System.out.println(str4.replaceAll("-", ":"));// Output: 123:456:7890
        //split(String regex)
        //Splits the string into an array of substrings based on the specified delimiter (regular expression).
        String str5 = "apple,banana,cherry";
        String[] fruits = str5.split(",");
        System.out.println(Arrays.toString(fruits));

        // Output: [apple, banana, cherry]
        //indexOf(String str)
        //Returns the index of the first occurrence of the specified substring. Returns -1 if not found
        String str6 = "Hello, World!";
        System.out.println(str6.indexOf("World")); // Output: 7
        System.out.println(str6.indexOf("Java"));


        //contains(CharSequence sequence)
        //Checks if the string contains the specified sequence of characters
        String str7 = "Hello, World!";
        System.out.println(str7.contains("World")); // Output: true
        System.out.println(str7.contains("Java"));  // Output: false


        //concat(String str)
        //Concatenates the specified string to the end of the current string.
        String str8 = "Hello, ";
        String str9 = "World!";
        System.out.println(str8.concat(str9)); // Output: Hello, World!

        //valueOf()
        //Converts other types (e.g., int, double, boolean) to a string.
        int num = 123;
        System.out.println(String.valueOf(num)); // Output: 123


        //isEmpty()
        //Checks if the string is empty (i.e., has length 0).
        String str10 = "";
        System.out.println(str10.isEmpty()); // Output: true


        //matches(String regex)
        //Checks if the string matches the given regular expression.
        String str11 = "12345";
        System.out.println(str11.matches("\\d+"));  // Output: true (matches digits only)
        System.out.println(str11.matches("\\w+"));  // Output: true (matches word characters)


        //All over example
         String num2 = "   Hello World   ";
        // Remove leading and trailing spaces
        num2 = num2.trim();

        // Convert to lowercase
        num2 = num2.toLowerCase();

        // Replace 'world' with 'java'
        num2 = num2.replace("world", "java");

        // Check if the string starts with "hello"
        boolean startsWithHello = num2.startsWith("hello");

        System.out.println(num2);  // Output: hello, java!
        System.out.println("Starts with 'hello': " + startsWithHello);  // Output: true

    }
}
