package Study;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;


public class ByteArrayInputStreamStudy {

	public static void main(String[] args) {
		String str = "ABC123";
		int i;
		
		try {
			byte[] byteArr = str.getBytes("UTF-8");//문자열을 바이트배열로 변환
			
			ByteArrayInputStream  bais = new ByteArrayInputStream(byteArr);//바이트배열읽기스트림으로 읽어들임
			ByteArrayOutputStream  baos = new ByteArrayOutputStream();
			
			while ( (i=bais.read()) != -1 ){//읽어서 변수 i에 넣고, 값이 더 이상 없다면 read()는 -1을 반환 
				baos.write(i);//바이트배열쓰기스트림에 입력
				}

			byte[] byteArrCopy = baos.toByteArray();//바이트 배열 복사
			
			for(i=0; i<byteArrCopy.length; i++) {
				System.out.print(byteArrCopy[i]);//아스키 코드로 출력
				System.out.print("[" + (char)byteArrCopy[i] + "] ");//아스키 코드로 출력
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
