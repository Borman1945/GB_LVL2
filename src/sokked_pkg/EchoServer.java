package sokked_pkg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class EchoServer {

    private static ServerSocket serverSocket = null;
    private static HashMap<String,DataOutputStream> outMap = new HashMap<>();


    public static void sendMessage(String message){
        outMap.keySet().forEach(tdName -> {
            try {
                outMap.get(tdName).writeUTF(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    void createConnection() {
        Socket clientsocket = null;
        try {
            clientsocket = serverSocket.accept();
            System.out.println("Клиент подключен!!!");
            DataInputStream in = new DataInputStream(clientsocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientsocket.getOutputStream());
            outMap.put(Thread.currentThread().getName(),out);
            while (true) {
                String message = in.readUTF();
                System.out.println("From client: " + message);
                if (message.equals("/end")) {
                    break;
                }
                sendMessage(message);
                //out.writeUTF(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (clientsocket != null) {
                try {
                    clientsocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    void serverStart() throws IOException {
        Socket clientsocket = null;
        try {
            serverSocket = new ServerSocket(8190);
            System.out.println("Сервер запущен, ожидаем подключения...");
            int i = 0;
            do {
                new Thread(() -> createConnection()).start();
                i++;
            } while (i < 3);

            clientsocket = serverSocket.accept();
            System.out.println("Клиент подключен!!!");
            DataInputStream in = new DataInputStream(clientsocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientsocket.getOutputStream());
            while (true) {
                String message = in.readUTF();
                System.out.println("From client: " + message);
                if (message.equals("/end")) {
                    break;
                }
                out.writeUTF(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (clientsocket != null) {
                clientsocket.close();
            }
            if (serverSocket != null) serverSocket.close();
        }
    }


    public static void main(String[] args) throws IOException {
        new EchoServer().serverStart();
    }

}
