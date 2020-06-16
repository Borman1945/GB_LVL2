package lesson6network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    public static final String END_CMD = "/end";

    public static void main(String[] args) throws IOException {
        Socket clientsocket = null;
        ServerSocket serverSocket = null;
        try{
                serverSocket = new ServerSocket(8189);
                System.out.println("Сервер запущен ожидаем подключения...");
                clientsocket = serverSocket.accept();
            System.out.println("Клиент подключился...");
            DataInputStream in = new DataInputStream(clientsocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientsocket.getOutputStream());





            Thread  thred1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    //Scanner sc = new Scanner(System.in);
                    while (true) {
                        String message = null;
                        try {
                            message = in.readUTF();

                            System.out.println("From client: " + message);
                            if (message.equals(END_CMD)) {
                                break;
                            }
                            sendMessegeServer("Клиент: ",message,out);
                        } catch (IOException e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                }
            });


            Thread  thred2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    Scanner sc = new Scanner(System.in);
                    while(true) {
                        String message = null;


                        try {
                            message = sc.nextLine();
                            System.out.println("From server: " +message);

                            if (message.equals(END_CMD)){
                                sc.close();
                                sendMessegeServer(END_CMD,out);

                                break;
                            }

                            sendMessegeServer("Сервер: ",message,out);

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }


                }
            });
            thred1.start();
            thred2.start();
            thred1.join();
            thred2.join();

        } catch (IOException | InterruptedException e){
            e.printStackTrace();
        } finally {
            if (serverSocket != null){
                serverSocket.close();
            }
            if (clientsocket != null){
                clientsocket.close();
            }
        }
    }

    synchronized static void sendMessegeServer(String aoutor,String message,DataOutputStream out) throws IOException {

            out.writeUTF(aoutor + message);


    }

    synchronized static void sendMessegeServer(String message,DataOutputStream out) throws IOException {
        out.writeUTF(message);
    }


}
