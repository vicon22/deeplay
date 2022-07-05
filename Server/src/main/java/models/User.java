package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class User implements Player{

    private final Map map;
    private final int checkersColor;


    public User(Map map, int checkersColor) {
        this.map = map;
        this.checkersColor = checkersColor;
        try {
            start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void doMove() {

    }


    public void start() throws IOException {

        Scanner scanner = new Scanner(System.in);

        int port;

        System.out.print("Enter port number for connect to user: ");
        port = scanner.nextInt();

        ServerSocket ss = new ServerSocket(port);
        System.out.println("Waiting user to connect");
        Socket s = ss.accept();
        System.out.println("User successfully connected");

        PrintWriter printWriter = new PrintWriter(s.getOutputStream(), true);
        printWriter.println("Successfully connect to server!");
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(s.getInputStream()));
        System.out.println(bufferedReader.readLine());
    }

    public static void main(String[] args) {

        User user = new User(null, 1);
    }
}
