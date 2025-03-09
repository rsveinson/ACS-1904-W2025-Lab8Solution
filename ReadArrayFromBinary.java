import java.io.ObjectInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class ReadArrayFromBinary{
    public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException {
        char[] initials = new char[4];
        String[] name = new String[4];
        int[] age = new int[4]; 
        
        ObjectInputStream oIn = new ObjectInputStream( new FileInputStream("Lab8.ser"));
        
        initials = (char[]) oIn.readObject();
        name = (String[]) oIn.readObject();
        age = (int[]) oIn.readObject();
        
        for(int i = 0; i < initials.length; i++)
            System.out.println(initials[i] + ". " + name[i] + ", " + age[i]);


        System.out.println("end of program");
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
