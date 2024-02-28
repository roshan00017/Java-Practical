package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("server-ip-address", 1098);
            RemoteInterface helloObj = (RemoteInterface) registry.lookup("HelloService");
            String message = helloObj.sayHello();
            System.out.println("Message from server: " + message);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

