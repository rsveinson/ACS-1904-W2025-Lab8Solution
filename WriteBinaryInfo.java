import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class WriteBinaryInfo{
    public static void main(String[] args)throws IOException {
        
        // the arrays of data
        char[] initials = {'W', 'J', 'B', 'D'};
        String[] name = {"Yeats", "Joyce", "Behan", "Brudair"};
        int[] age = {74, 59, 41, 25};

        DataOutputStream ods = new DataOutputStream(new FileOutputStream("Lab8.ser"));
        
        for(int i = 0; i < initials.length; i++){
            ods.writeChar(initials[i]);
            ods.writeUTF(name[i]);
            ods.writeInt(age[i]);
        }
        
        ods.close();
        System.out.println("Data written to file");

        System.out.println("\nend of program");
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
