package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private int port;

    public Server(int port) {
        this.port = port;
    }

//    public static void main(String[] args) throws IOException {
//
//
//        Integer port = Integer.parseInt(args[0].split("=")[1]);
//        ApplicationContext context = new AnnotationConfigApplicationContext(Server.class);
//        UsersService usersService = context.getBean(Server.class).usersService;
//
//
//        ServerSocket ss = new ServerSocket(port);
//        Socket s = ss.accept();
//
//        PrintWriter printWriter = new PrintWriter(s.getOutputStream(), true);
//        printWriter.println("Hello from Server!");
//
//        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(s.getInputStream()));
//
//        if (bufferedReader.readLine().equals("signUp")){
//            signUp(bufferedReader, printWriter, usersService);
//        }else{
//            System.out.println("ByBy");
//            printWriter.println("Server: ByBy");
//        }
//
//
//    }

//    public void start() throws IOException {
//
//        ServerSocket ss = new ServerSocket(port);
//        Socket s = ss.accept();
//
//        PrintWriter printWriter = new PrintWriter(s.getOutputStream(), true);
//        printWriter.println("Hello from Server!");
//        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(s.getInputStream()));
//
//        if (bufferedReader.readLine().equals("signUp")) {
//            signUp(bufferedReader, printWriter, usersService);
//        }else {
//            System.out.println("ByBy");
//            printWriter.println("Server: ByBy");
//        }
//
//    }

    private static void signUp(BufferedReader bufferedReader, PrintWriter printWriter) throws IOException {
        printWriter.println("Enter username:");
        String username = bufferedReader.readLine();
        printWriter.println("Enter password:");
        String password = bufferedReader.readLine();

    }
}
