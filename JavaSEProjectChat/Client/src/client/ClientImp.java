/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import Server.Client;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Hossam
 */
public class ClientImp extends UnicastRemoteObject implements Client{
    MyClass my;
    ClientImp(MyClass my) throws RemoteException{
     this.my =my;
    }

    @Override
    public void receive(String msg){
        my.display(msg);        
    }
    
}
