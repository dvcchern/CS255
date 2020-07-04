import java.util.Scanner; // Needed for Scanner class
import java.io.*; // Needed for File and IOException

class Main {
    public static int add(int n1, int n2) {
        return (n1 + n2);
    }
    
    public static void main(String[] args) throws IOException {    
        Scanner keyboard = new Scanner(System.in);

        // Get the input data file name, then create it.
        System.out.print("Enter the name of input file: ");
        String filename = keyboard.nextLine();
        File inFile = new File(filename);
        Scanner lineInput = new Scanner(inFile);
        int n1 = lineInput.nextInt();
        int n2 = lineInput.nextInt();
        lineInput.close();

        // Send the output to output.txt
        PrintWriter outFile = new PrintWriter("output.txt");
        int sum = add(1, 2);
        outFile.print( "1 + 2 = " + sum );
        outFile.close();
    }
}
