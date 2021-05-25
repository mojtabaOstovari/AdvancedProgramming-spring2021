import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",9000);

        Scanner input = new Scanner(socket.getInputStream());
        System.out.println(input.nextLine());

        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
        String message = new Scanner(System.in).nextLine();
        output.println(message);
        socket.close();
    }
}

class Request{
    String method = "sendMessage";
    String data = "";
    String sender = "ali";
}
