


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteInterfaceImp extends UnicastRemoteObject implements RemoteInterface {
    protected RemoteInterfaceImp() throws RemoteException {
        super();
    }

    public String sayHello() throws RemoteException {
        return "Hello from the server!";
    }
}
