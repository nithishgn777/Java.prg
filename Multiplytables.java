public class MultiplicationTables {
    public static void main(String[] args) {
        // Loop for each table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Loop for each multiplication (1 to 10)
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + "\t"); // print only answer with tab space
            }
            System.out.println(); // move to next line after each table
        }
    }
}
