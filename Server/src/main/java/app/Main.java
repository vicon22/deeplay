package app;

import server.Server;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Server server = null;
    static int port = 8080;

    public static void main(String[] args) throws IOException {

        port = Integer.parseInt(args[0].split("=")[1]);

        message();

        if (server != null) {
            server = new Server(port);
//            server.start();
        }
    }

    private static void message() {

        Scanner scanner = new Scanner(System.in);
        int i;

        System.out.println("Bot vs Player(1) | Bot vs Bot(2) | Bot vs SmartBot(3)");
        i = scanner.nextInt();
        if (i == 1 || i == 3) {
            server = new Server(port);
        }

    }
}
