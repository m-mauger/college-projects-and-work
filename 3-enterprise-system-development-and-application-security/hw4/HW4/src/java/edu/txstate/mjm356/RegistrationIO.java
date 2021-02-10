/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.txstate.mjm356;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Owner
 */
public class RegistrationIO {
            public static void save(Registration aRegistration, String filePath){
        try {
                File file = new File(filePath);
                PrintWriter out = new PrintWriter(new FileWriter(file, true));
                String output = String.format("|%-20s| |$%-20s|"
                ,aRegistration.getRegistrationDate()
                ,aRegistration.getTotalPayment());
                out.println(output);
                out.close();
            } catch (Exception ex){
                ex.printStackTrace();
            }
    }
}
