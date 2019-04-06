/**
 * 
 */
package aula_05_04;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ayrtons
 *
 */
public class Servidor {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/**
		 * Reservando a porta 9000, para começar a ouvir as requisições TCP
		 */
		ServerSocket serverSocket = new ServerSocket(9000);
		
		while (true) {
			Socket cliente = serverSocket.accept();
		}
		cliente.close();
		serverSocket.close();

	}

}
