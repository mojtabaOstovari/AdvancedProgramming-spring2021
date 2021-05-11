import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
        File myFile = new File("text-file.txt");
        if(!myFile.exists()){
            myFile.createNewFile();
        }
        OutputStream outputStream =
                new BufferedOutputStream(new FileOutputStream(myFile), 3);

        String myString = "Hello";
        for (char c : myString.toCharArray()) {
//            if(c=='l'){
//                throw new IOException();
//            }
            // byte b = (byte)c;
            outputStream.write(c);
            outputStream.flush();
        }
        String myString2 = "World";
        outputStream.write(myString2.getBytes());

        outputStream.close();


        InputStream inputStream =
                new BufferedInputStream(new FileInputStream(myFile), 2);
        int a = inputStream.read();
        while (a != -1){
            System.out.print((char)a);
            a = inputStream.read();
//            inputStream.mark(3);
//            inputStream.reset();
        }
        inputStream.close();

    }

}
