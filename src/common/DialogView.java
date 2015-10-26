/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

public class DialogView {

    private PrintWriter out;
    private BufferedReader in;
    private RequestController controller;

    public DialogView(RequestController controller) {

        this.controller = controller;

        this.out = new PrintWriter(System.out);
        this.in = new BufferedReader(new InputStreamReader(System.in));
    }

    public void waitCommands() {
        try {
            String nextCommand;
            while ((nextCommand = in.readLine()) != null) {
                controller.processCommand(nextCommand);
            }
        } catch (IOException exception) {
            System.err.println("Error on read : " + exception.getMessage());
        }
    }
    
    public void printRequestResults(List response) {
        for (Object element : response) {
            out.println(element.toString());
        }
        out.flush();
    }
}
