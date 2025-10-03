//Username= Ayush07415
//Aim= Binary serach tree
//Date=4/10/2025

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAndHostname {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();

        
            String ipAddress = localHost.getHostAddress();

         
            String hostName = localHost.getHostName();

            System.out.println("Hostname: " + hostName);
            System.out.println("IP Address: " + ipAddress);
        } catch (UnknownHostException e) {
            System.out.println("Could not determine IP address or hostname.");
            e.printStackTrace();
        }
    }
}
