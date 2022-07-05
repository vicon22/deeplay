package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();

        Scanner scanner = new Scanner(System.in);

        int port;

        System.out.print("Enter port number for connect to user: ");
        port = scanner.nextInt();

        try {
            client.getConnection(port);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void getConnection(int port) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Socket s = new Socket("localhost", port);

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(s.getInputStream()));
        PrintWriter printWriter = new PrintWriter(s.getOutputStream(), true);

        System.out.println(bufferedReader.readLine());

        printWriter.println(scanner.nextLine());

        System.out.println(bufferedReader.readLine());
        printWriter.println(scanner.nextLine());
        System.out.println(bufferedReader.readLine());
        printWriter.println(scanner.nextLine());
        System.out.println(bufferedReader.readLine());
    }
}
