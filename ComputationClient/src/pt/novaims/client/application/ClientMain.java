package pt.novaims.client.application;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ClientMain {

	public final static int PORT = 8888;
	
	public static void main(String[] args) {
		
		
		DatagramSocket datagramSocket;
		
			try {
				datagramSocket = new DatagramSocket();
				byte[] buffer = "Computation".getBytes();
				InetAddress receiverAddress = InetAddress.getLocalHost();
	
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
		

		

	}

}
