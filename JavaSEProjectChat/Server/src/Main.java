/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hossam
 */
public class Main {
        public static void main(String args[]){
       
            new Main();
        
    }
    public Main(){
        try {
            MyClass server = new MyClass();
            Registry reg = LocateRegistry.getRegistry();
            reg.rebind("chat", server);
                    } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }

}
