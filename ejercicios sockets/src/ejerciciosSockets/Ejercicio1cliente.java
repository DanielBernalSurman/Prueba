package ejerciciosSockets;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ejercicio1cliente {
	public static void main(String [] args){
		try {
			Socket s1=new Socket("localhost",6200);
			System.out.println("Conectando al puerto: "+s1.getPort());
			System.out.println("El nombre del servidor es: "+s1.getInetAddress().getHostName().toUpperCase());
			if(s1.isConnected())
			System.out.println("puerto local "+s1.getLocalPort());
			s1.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
