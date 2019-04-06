/**
 * 
 */
package aula_05_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author ayrtons
 *
 */
public class Cliente {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("localhost", 9000);

		BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		
		
		PrintWriter saida = new PrintWriter(socket.getOutputStream()); // saida.flush() false
		
		socket.close();
		
	}

}
