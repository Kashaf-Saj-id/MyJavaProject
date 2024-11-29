public class Star {
    public static void main(String[] args) {
        int n = 9;  // Size of the pattern (must be an odd number for symmetry)

        // Outer loop for rows
        for (int i = 0; i < n; i++) {
            // Inner loop for columns
            for (int j = 0; j < n; j++) {
                // Print stars to form a 5-pointed star
                if (isStar(i, j, n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    // Function to check if the current (i, j) is a part of the 5-pointed star
    public static boolean isStar(int i, int j, int n) {
        int mid = n / 2; // The center of the star

        // Conditions for the 5-pointed star
        // Top point
        if (i == 0 && j == mid) return true;

        // Bottom point
        if (i == n - 1 && j == mid) return true;

        // Left point of the star
        if (i == mid && j == 0) return true;

        // Right point of the star
        if (i == mid && j == n - 1) return true;

        // Diagonal lines forming the arms of the star
        if (i + j == mid) return true;  // Left diagonal
        if (i - j == mid) return true;  // Right diagonal
        if (j - i == mid) return true;  // Left diagonal from bottom
        if (i + j == mid + n - 1) return true; // Right diagonal from bottom

        return false;
    }
}
