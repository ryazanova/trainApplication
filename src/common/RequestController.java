/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Arrays;
import java.util.List;

public class RequestController {

    private DialogView view;

    public RequestController() {
        this.view = new DialogView(this);
    }
    
    public void waitCommands() {
       view.waitCommands();
    }
    
    public void processCommand(String s) {
        //-get | db | id = 123
        //обработку команд ты или нет?
        printRequestResults(Arrays.asList(1,2,3));
    }
    
    public void printRequestResults(List response) {
        view.printRequestResults(response);
    }
}
