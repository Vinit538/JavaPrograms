package JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FioStream {
	public static void main(String[] args) throws IOException {
		String Source="D:\\JavaOI\\input.txt";
		String Destination="D:\\JavaOI\\output.txt";
		int x=0;
		try {
			FileInputStream fis=new FileInputStream(Source);
			FileOutputStream fos=new FileOutputStream(Destination);
			while((x=fis.read())!=-1)
			{
				fos.write(x);
			}
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
