package Main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import Detoretors.LowerCaseInputStream;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		
		try {
			InputStream in = new LowerCaseInputStream(
					new BufferedInputStream(
							new FileInputStream("test.txt")));
			
			while ((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
			
			in.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
