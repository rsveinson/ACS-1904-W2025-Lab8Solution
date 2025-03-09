import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/** 
 * ACS-1904 Lab 8
 * @Sveinson 
*/

public class Lab8DebugXML{
    public static void main(String[] args)throws IOException{
        ArrayList<CatDebugXML> cats = new ArrayList<>();
        
        // add some cats
        cats.add(new CatDebugXML("Emerson", 17));
        cats.add(new CatDebugXML("Rincewind", 1));
        cats.add(new CatDebugXML("Alax", 16));
        
        printList(cats);
        
        // **** write the list to an xml file ****
        // open the output stream
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("Lab8DebugXML.xml"));
        encoder.writeObject(cats);
      
        /* let's see what the file looks
         * like when we write a series of individual
         * Cat objects to the file
         */
        // for(CatDebugXML c : cats){
            // encoder.writeObject(c);
        // }
        encoder.close();
        
        // ****** now read it back *************
        XMLDecoder decoder = new XMLDecoder(new FileInputStream("Lab8DebugXML.xml"));
        ArrayList<CatDebugXML> newCats = new ArrayList<>();
        newCats = (ArrayList)decoder.readObject();
        printList(newCats);
        decoder.close();
        
        System.out.println("end of program");
    }
    /*****************************************
    * Description: Print a list of Cats
    * 
    * @param        ArrayList<Cat>: a list of cats
    * 
    * @return       nothing
    * ****************************************/
    public static void printList(ArrayList<CatDebugXML> list){
        for(CatDebugXML c : list){
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
