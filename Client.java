import java.io.*;
import java.net.*;
public class main {
public static void main(String[] args) throws Exception {
	  Socket socket = null;
      PrintWriter out = null;
      BufferedReader in = null;
      BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
      try
      {
          socket = new Socket("127.0.0.1", 8007);
          out = new PrintWriter(socket.getOutputStream(), true);
          in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          String textToServer;
          while(true) {
        	  textToServer = read.readLine();
              out.print(textToServer + "\r\n"); // send to server
              out.flush();
          }
      }
      catch (IOException e)
      {
          e.printStackTrace();
      }
  }
}

