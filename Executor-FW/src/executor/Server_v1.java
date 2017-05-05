package executor;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

public class Server_v1
{
   public static void main(String[] args) throws IOException
   {
      ServerSocket socket = new ServerSocket(9000);
      while (true)
      {
         final Socket s = socket.accept();
         Runnable r = new Runnable()
                      {
                         @Override
                         public void run()
                         {
                            doWork(s);
                         }
                      };
         new Thread(r).start();
      }
   }

   static void doWork(Socket s)
   {
   }
}


/*
 * 
 * java.util.concurrent includes the Executor framework, 
 * a small framework of types that decouple task submission from task-execution policies.
 * 
 */


