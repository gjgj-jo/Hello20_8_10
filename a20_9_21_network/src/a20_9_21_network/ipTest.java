package a20_9_21_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class ipTest {

	public static void main(String[] args) {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 InetAddress add[], myadd, add1;
		 try {
			String url=br.readLine();
			add1=InetAddress.getByName(url);
			add=InetAddress.getAllByName(url);
			myadd=InetAddress.getLocalHost();
			System.out.println("add1="+add1);
			
			for(Object xx : add) {
				System.out.println("add="+xx);
			}
			System.out.println("myip="+myadd);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
