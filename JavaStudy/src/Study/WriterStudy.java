package Study;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterStudy {

	public static void main(String[] args) {
		try {
			//최상위 클래스 - 하위 클래스
			Writer fw = new FileWriter("c:\\test\\result.txt"); //파일 쓰기
			BufferedWriter bw = new BufferedWriter(fw);//한줄씩 쓰기
			OutputStreamWriter osw = new FileWriter("c:\\test\\result.txt");  //파일 쓰기
			
			osw.write("hello World");//출력
			osw.write("hello World\n");//출력 후 개행
			osw.getEncoding();//사용중인 문자인코딩 반환
			osw.flush();//버퍼에 남아있는 데이터를 모두 출력
			osw.close();//종료
			
			
			bw.write("hello World");//출력
			bw.write("hello World\n");//출력 후 개행
			bw.newLine();//개행 
			bw.flush();//버퍼에 남아있는 데이터를 모두 출력
			bw.close();//종료
	
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
