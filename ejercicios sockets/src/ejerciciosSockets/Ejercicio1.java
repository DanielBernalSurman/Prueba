package ejerciciosSockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//Crear un socket de servidor y enlazarlo al puerto 6200 
//-visualizar el puerto por el que se esperan las conexiones
//-visualizar dirección tipo inetadress del servidor como un string y esperar a que se conecten 2 clientes
//-cerrar el servidor
//Crear un socket cliente que se conecte al servidor, visualizar el puerto asociado al cliente y al servidor
//Visualizar el nombre del host remoto en mayúsculas
// Y la ip del host remoto
//Cerrar el cliente
//Modificar el servidor para que una vez el cliente se haya conectado imprimir su número de puerto asociado


public class Ejercicio1 {
	public static void main(String [] args){
		try {
			ServerSocket s=new ServerSocket(6200,2);
			System.out.println("Escuchando el puerto "+s.getLocalPort()+"\n En la direccion: "+s.getInetAddress().toString());
			
			System.out.println("Esperando conexión");
			
			Socket conexion=s.accept();
			
			if (conexion.isConnected())
			System.out.println("conexion desde: "+conexion.getInetAddress().toString());
			Socket conexion2=s.accept();
			if (conexion2.isConnected())
			System.out.println("conexion desde: "+conexion2.getInetAddress().toString());
			s.close();
			conexion.close();
			conexion2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
