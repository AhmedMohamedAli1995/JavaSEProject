package Server;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Server.Client;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Hossam
 */
public interface ServerInterface extends Remote {
    public void tellOthers(String msg) throws RemoteException;
    public void register(Client ref) throws RemoteException;
    public void unregister(Client ref)throws RemoteException;
}
