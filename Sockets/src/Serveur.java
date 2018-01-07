import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ServerSocket serveur = null;
		Socket socket = null;
		try {

			serveur = new ServerSocket(1001);
			// while (true) {
			socket = serveur.accept();
			System.out.println("j'ai detecte la connexion");

			InputStream in = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(in);
			
			BufferedReader istream = new BufferedReader(reader);
			String line = istream.readLine();
			// }
			System.out.println(line);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			socket.close();
			serveur.close();
		}

	}
}