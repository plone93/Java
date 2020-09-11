package Study;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderStudy {

	public static void main(String[] args) {
		try {
			//최상위 클래스 - 하위 클래스
			Reader fr = new FileReader("c:\\test\\text.txt");//파일 읽기
			BufferedReader br = new BufferedReader(fr);//한줄씩 읽기
			InputStreamReader isr = new FileReader("c:\\test\\text.txt");//파일 읽기
			
			isr.read();//문자를 정수로 읽어옴
			isr.getEncoding();//사용중인 문자인코딩 반환
			isr.close();//종료
			
			System.out.println("BufferedReader : "+br.readLine());
			br.close();//종료
			br.read();//한글자만 읽어서 정수로 반환
			br.readLine();//한줄을 읽어서 문자열로 반환
			br.ready();//입력 스트림이 사용할 준비가 되어 있는지 확인, 1이면 준비완료
			br.skip(1);//n개의 문자를 건너 뜀
			br.reset();//처음부터 다시 시작
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
