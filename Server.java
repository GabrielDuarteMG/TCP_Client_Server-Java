
  import java.io.*;
  import java.net.*;
  import java.util.*;
  import java.util.logging.*;
public class main {
public static void main(String[] args) throws Exception {
	 try {
         ServerSocket server = new ServerSocket(8007);                       
         Socket cliente = server.accept();
         System.out.println("Cliente conectado do IP "+cliente.getInetAddress().
                 getHostAddress());
         Scanner entrada = new Scanner(cliente.getInputStream());
         while(entrada.hasNext()){
             System.out.println(entrada.next());
         }         
         entrada.close();
         server.close();
         
     } catch (IOException ex) {
         Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
     }
  }
}

