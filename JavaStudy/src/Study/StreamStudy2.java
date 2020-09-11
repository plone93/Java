package Study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamStudy2 {

	public static void main(String[] args) {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new FileInputStream("c:\\test\\text.txt");
			outputStream = new FileOutputStream("c:\\test\\result.txt");
			
			/*inputStream*/
			int i = inputStream.read();//65
			char c = (char)inputStream.read();//A
			outputStream.write(i); // outputStream.write(c)과 동일 결과
			
			inputStream.available();//읽을 수 있는 byte수를 반환
			inputStream.mark(1);//현재위치 표시
			inputStream.read();//1byte를 읽어 byte값으로 반환, 더 이상 읽을 수 없을때는 -1을 반환
			inputStream.skip(1);//n byte만큼건너뛰고 byte수를 반
			inputStream.markSupported();//mark()로 지정된 지점이 있는지 검사
			inputStream.reset();//mark()를 마지막으로 호출한 위치로 이동, 없으면 처음으로 이동
			
			
			/*outputStream*/
			String str = "ABC123";
			byte[] arr = str.getBytes();//[B@15db9742
			outputStream.write(arr);//byte만 쓰기 가능,결과 : ABC123
			
			outputStream.flush();//비우기
			outputStream.write(1);//쓰기(문자, 정수형 둘다 가능)
			
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
