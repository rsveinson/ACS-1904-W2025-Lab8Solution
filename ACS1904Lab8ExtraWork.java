import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class ACS1904Lab8ExtraWork{
    /* IOExcepton includes the FileNotFoundException */
    public static void main(String[] args)throws IOException, ClassNotFoundException {
        ArrayList<Cat> cats = new ArrayList<>();
        
        // add some cats
        cats.add(new Cat("Emerson", 17));
        cats.add(new Cat("Rincewind", 1));
        cats.add(new Cat("Alax", 16));
        
        printList(cats);
        
        // **** write the list to an xml file ****
        // open the output stream
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("cats.xml"));
        encoder.writeObject(cats);
      
        /* let's see what the file looks
         * like when we write a series of individual
         * Cat objects to the file
         */
        // for(Cat c : cats){
            // encoder.writeObject(c);
        // }
        encoder.close();
        
        // ****** now read it back *************
        XMLDecoder decoder = new XMLDecoder(new FileInputStream("cats.xml"));
        ArrayList<Cat> newCats = new ArrayList<>();
        newCats = (ArrayList)decoder.readObject();
        printList(newCats);
        decoder.close();
        
        // **** write to a binary file ****
        ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream("Cats.ser"));
        oOut.writeObject(cats);
        oOut.close();
        
        // *** now read and print it ****
        ObjectInputStream oIn = new ObjectInputStream( new FileInputStream("Cats.ser"));
        ArrayList<Cat> objectCats = new ArrayList<>();
        objectCats = (ArrayList)oIn.readObject();
        
        System.out.println("\nPrint list form the binary file.\n");
        printList(objectCats);
        
        System.out.println("end of program");
    }
    /*****************************************
    * Description: Print a list of Cats
    * 
    * @param        ArrayList<Cat>: a list of cats
    * 
    * @return       nothing
    * ****************************************/
    public static void printList(ArrayList<Cat> list){
        for(Cat c : list){
            System.out.println(c);
        }
    }
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
