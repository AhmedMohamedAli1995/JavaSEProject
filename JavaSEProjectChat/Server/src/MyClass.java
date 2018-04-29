/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Server.ServerInterface;
import Server.Client;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hossam
 */
public class MyClass extends UnicastRemoteObject implements ServerInterface{
    MyClass()throws RemoteException{}
    static ArrayList<Client> al = new ArrayList<>();
    public void register(Client c){
        al.add(c);
        System.out.println("added");
    }
    public void unregister(Client c){
        al.remove(c);
        System.out.println("removed");
    }
    @Override
    public void tellOthers(String msg){
        System.out.println("msg received"+msg);
        for(Client c:al){            
            try {
                c.receive(msg);
            } catch (RemoteException ex) {
                Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
