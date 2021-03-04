/**
* This is a simple Java class with set and get methods
* @version 1.0
* @author  Eranda Upeshitha
* @since 2021-03-04
*/
public class Animal{

    private String name;

	/**
	* get the name of animal
	* @return the name of the animal
	*/
    public String getName(){
        return name;
    }

	/**
	* set the name of animal
	* @param the name of the animal
	*/
    public void setName(String newName){
	name = newName;
    }
	
	public static void main(String[] args){
		System.out.println("Welcome!");
	}

}

