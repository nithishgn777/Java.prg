public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; // number of rows

        for (int i = 1; i <= rows; i++) {
            // print spaces
            for (int j = i; j < rows; j++) {
                System.out.print("  "); // two spaces for alignment
            }
            // print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
