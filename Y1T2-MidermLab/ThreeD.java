import java.util.Scanner;

public class ThreeD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare 3d Array
        int[][][] array3D = new int[1][3][3];

        String[] subjects = {"Java", "Database", "Networking"}; // Array for subjects
        // Data input
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print("Enter value for Section " +  ( i + 1 ) + ", Student " + ( j + 1 ) + " Subject \"" + subjects[k]  + "\" Grade: "); //using subjects[k] to display the subject name
                    array3D[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println();

        // Another Array for storing student averages
        int[] studentAverages = new int[3];
        // Data output - Nested Loops
        // Section Header
        System.out.println("SECTION 1");
        System.out.println("--------------------------");
        //Nested Loop - Student Data
        for (int j = 0; j < 3; j++){
            System.out.println("Student " + (j + 1));
            System.out.println("Java: " + array3D[0][j][0]);
            System.out.println("Database: " + array3D[0][j][1]);
            System.out.println("Networking: " + array3D[0][j][2]);

            // Student Average Calculation
            int sumStudent = 0;
            for (int k = 0; k < array3D[0][j].length; k++) {
                sumStudent += array3D[0][j][k];
            }
            studentAverages[j] = (int) sumStudent / 3;; // Student Average Storage
            System.out.println("Student Average: " + studentAverages[j]);
            System.out.println();
        }
        // Section Average Calculation
        int sum = 0;
        for (int j = 0; j < 3; j++) {
            sum += studentAverages[j]; // Getting Student Average from Array
        }
        float avg = (float) sum / 3;
        System.out.println("Section Average: " + avg);
        
        sc.close();
    }
}

//Modify the code for array and ACCEPT only 1 section
