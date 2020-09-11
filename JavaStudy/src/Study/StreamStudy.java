package Study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamStudy {

	public static void main(String[] args) {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new FileInputStream("c:\\test\\text.txt");
			outputStream = new FileOutputStream("c:\\test\\result.txt");
			
			while(true) {
				int data = inputStream.read();//1바이트씩 읽기
				
				if(data == -1) {//더 이상 없다면
					break;//중지
				}
				outputStream.write(data);//1바이트씩 쓰기
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(inputStream != null && outputStream != null) {//스트림이 닫히지 않았으면 
					inputStream.close();//종료
					outputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}

}
