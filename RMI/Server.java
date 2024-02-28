

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
        	RemoteInterfaceImp helloObj = new RemoteInterfaceImp();
            Registry registry = LocateRegistry.createRegistry(1098);
            registry.rebind("HelloService", helloObj);
            System.out.println("Server started.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
