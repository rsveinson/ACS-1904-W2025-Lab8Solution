
/** 
 * ACS-1904 Lab 8
 * @Sveinson 
 * Oops, there seems to be a problem here
 * fix this class so that it writes out
 * to the XML fle correctly
*/

public class CatDebugXML{
    // fields
    private String name;
    private int age;
    
    // constructors
    /* added the no-arg constructor
     * no-arg constructor is required by
     * without it the .xml file is empty of Cat objects
     */
    public CatDebugXML(){
        name = "unknown";
        age = 0;
    }
    public CatDebugXML(String name, int age){
        this.name = name;
        this.age = age;
    }// end full arg

    // getters and setters
    /* fixed the name of this getter
     * from gEtName to getName
     * it won't work if the method is not
     * named correctly
     */
    public String getName(){
        return name;
    }
    
    /* fixed the name of this getter
     * from GetAge to getAge
     * it won't work if the method is not
     * named correctly
     */
    public int getAge(){
        return age;
    }
    
    /* fixed the name of this setter
     * from SEtName to setName
     * it won't work if the method is not
     * named correctly
     */
    public void setName(String name){
        this.name = name;
    }
    
    /* fixed the name of this setter
     * from SetAge to setAge
     * it won't work if the method is not
     * named correctly
     */
    public void SetAge(int age){
        this.age = age;
    }
    
    
    @Override
    public String toString(){
        //return this.getName() + ": " + this.getAge();
        return name + " " + age;
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
