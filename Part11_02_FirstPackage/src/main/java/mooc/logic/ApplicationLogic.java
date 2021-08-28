package mooc.logic;

import mooc.ui.TextInterface;
import mooc.ui.UserInterface;

public class ApplicationLogic {

    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }
    public void execute(int times){
        for (int i = 0; i < times; i++) {
            this.ui.update();
            System.out.println("Application Logic is working");
        }
    }
    
}
