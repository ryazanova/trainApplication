/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

public class TrainApplication {

    public static void main(String[] args) {
        RequestController controller = new RequestController();
        controller.waitCommands();
    }
}
