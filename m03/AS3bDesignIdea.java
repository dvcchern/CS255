import java.util.Scanner;

//comparing by ignoring case
public class Main {
    public static void main(String[] args) 
    { 
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String name1 = keyboard.nextLine();
        
        System.out.print("Enter the second name: ");
        String name2 = keyboard.nextLine();
        
        System.out.print("Enter the third name: ");
        String name3 = keyboard.nextLine();
        
        //System.out.println("Using CompareTo()");
    
        if( name1.compareTo(name2) < 0) 
        { // current top is n1;
            if( name1.compareTo(name3) < 0 ) 
            { // n1 vs n3
                System.out.println(name1);  // confirm and print n1 as 1st
                if( name2.compareTo(name3) < 0 ) // placing 2nd & 3rd
                    System.out.println(name2 + "\n" + name3); // n1, n2, n3
                else
                    System.out.println(name3 + "\n" + name2); // n1, n3, n2
            }
            else 
            { // current top is n2
                {// compare ( n2 vs n3 )
                    // confirm and print n2 as 1st
                    // if(...) placing 2nd & 3rd
                        // n2, n1, n3
                    // else
                         // n2, n3, n1
                }
            }
        }
        else 
        { // current top is n2
            {// compare ( n2 vs n3 )
                // confirm and print n2 as 1st
                // if(...) placing 2nd & 3rd
                    // n2, n1, n3
                // else
                     // n2, n3, n1
            }
            else 
            {// current top is n3
                // confirm and print n3 as 1st
                // if(...) placing 2nd & 3rd
                    // n3, n1, n2
                // else
                    // n3, n2, n1
            }
        }
    }
}
