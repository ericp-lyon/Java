import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="bonjour serveur, c'est le client";
		
		try {
			
			Socket socket = new Socket(InetAddress.getLocalHost(), 1001);
			
			OutputStream out= socket.getOutputStream();
			PrintWriter ostream = new PrintWriter(out);
			ostream.println(str);
			ostream.flush();
			socket.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
	}

}
