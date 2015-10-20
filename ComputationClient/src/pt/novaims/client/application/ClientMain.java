package pt.novaims.client.application;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ClientMain {

	public final static int PORT = 8888;
	public final static String KEYWORD = "Computation";
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		DatagramSocket datagramSocket;
		//while(true) {
		try {
			datagramSocket = new DatagramSocket();
			byte[] buffer = KEYWORD.getBytes();

			DatagramPacket packet = new DatagramPacket(
			        buffer, buffer.length, InetAddress.getByName("255.255.255.255"), PORT);
			datagramSocket.send(packet);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.err.println("Unknown host "); 
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//}
	}

}
