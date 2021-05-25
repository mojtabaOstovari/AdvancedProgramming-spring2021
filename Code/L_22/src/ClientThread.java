import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientThread extends Thread {
    private Socket socket;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            String message = "Hello";
            output.println(message);

            Scanner input = new Scanner(socket.getInputStream());
            System.out.println(input.nextLine());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
