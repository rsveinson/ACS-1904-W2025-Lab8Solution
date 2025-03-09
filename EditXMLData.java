import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EditXMLData {
    public static void main(String[] args)throws IOException{
        // constant
        final int N = 10;     // how many numbers to write

        // variables
        int multiplier = 0;

        // decoder object references the XML file
        XMLDecoder decoder = new XMLDecoder(new FileInputStream("lab8.xml"));

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // assumes we know how many ints are in the data file
        int[] list = new int[N];

        for (int i = 0; i < N; i++) 
            list[i] = (int) decoder.readObject();
            
        /* note that the readObject() method will throw
         * an array inex out of bounds exception if
         * there is no object in the stream
         */

        // finished with the data for now so close the stream
        decoder.close();

        // display the array and close the file
        printList(list);

        // edit the data
        System.out.println("enter mutiplier.");
        multiplier = scanner.nextInt();

        // do the multiplication
        for (int i = 0; i < N ; i++)
            list[i] *= multiplier;

        // print the list again to verify math
        printList(list);

        // write the modified data back to the file
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("lab8.xml"));

        for(int i = 0; i < list.length; i++)
            encoder.writeObject(list[i]);

        encoder.close();
        
        // Closing
        System.out.println("program ended normally");
    }// end main

    public static void printList(int[] list){
        for (int i: list)
            System.out.println(i);  
    }// end print list
}
