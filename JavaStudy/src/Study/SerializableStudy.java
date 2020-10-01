package Study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableStudy {

	public static void main(String[] args) {
		SerializableStudy study = new SerializableStudy();//클래스 객체 생성
		study.serializableStudy();//직렬화 실행
		study.deserializeStudy();//역직렬화 실행
		
	}
	
	public void serializableStudy() {
		MemberBean memberBean1 = new MemberBean(1, "ABC123", "1234", "010-1111-1111", "tokyo", "tanaka");//Bean객체 생성
		MemberBean memberBean2 = new MemberBean(1, "DEF456", "5678", "010-2222-2222", "osaka", "kimura");//Bean객체 생성
		List<MemberBean> memberList = new ArrayList<MemberBean>();//Bean객체를 받는 리스트 생성
		memberList.add(memberBean1);//리스트 추가
		memberList.add(memberBean2);
		
		try{
			FileOutputStream fos = new FileOutputStream("c:\\test\\result.txt");//출력위치
			ObjectOutputStream oos = new ObjectOutputStream(fos);//객체를 출력하는 스트림
			
			/*객체 쓰기*/
			oos.writeObject(memberBean1);//FileOutputStream : java.io.FileOutputStream@15db9742
			oos.writeObject(memberList);//ObjectOutputStream : java.io.ObjectOutputStream@6d06d69c
			oos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public void deserializeStudy() {
		try {
			FileInputStream fis = new FileInputStream("c:\\test\\result.txt");//입력위치
			ObjectInputStream ois = new ObjectInputStream(fis);//객체를 입력하는 스트림

			Object memberBean = ois.readObject();//첫번째 객체를 읽어 들임
			Object memberList = ois.readObject();//두번째 객체를 읽어 들임
			
			System.out.println(memberBean.toString());//읽어들인 객체 출력
			System.out.println(memberList.toString());
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
