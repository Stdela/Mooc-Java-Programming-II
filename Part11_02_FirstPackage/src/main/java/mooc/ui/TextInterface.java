
package mooc.ui;

//n the same package, create the class TextInterface that implements the UserInterface interface. 
//Implement the method public void update(), required by the interface UserInterface, 
//so that the only thing it does is print the string "Updating UI" by calling the method System.out.println.
public class TextInterface implements UserInterface {

    public void update(){
    System.out.println("Updating UI");
}
}
