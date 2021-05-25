import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        String data = "Hello";
        byte[] sendData = data.getBytes();
//        InetAddress a = InetAddress.getByName("vc.sharif.edu");
//        System.out.println(a.getHostAddress() + "   " + a.getHostName());
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getLocalHost(), 9000);

        DatagramSocket clientSocket = new DatagramSocket();
        clientSocket.send(sendPacket);

        byte[] receiveData = new byte[10];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        clientSocket.receive(receivePacket);
        System.out.println(new String(receiveData));

    }
}
