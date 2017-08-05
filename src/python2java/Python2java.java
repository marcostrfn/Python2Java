/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package python2java;

import java.io.*;

/**
 *
 * @author ubuntu
 */
public class Python2java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter("result.txt", "UTF-8");
            String s = bufferRead.readLine();
            while (s.equals("x") == false) {
                writer.println(s);
                
                System.out.println("Recibido : " + s);

                s = bufferRead.readLine();
            }                        
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
