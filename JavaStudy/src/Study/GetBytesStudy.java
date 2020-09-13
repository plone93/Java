package Study;


public class GetBytesStudy {

	public static void main(String[] args) {
		String str1 = "ABC123";
		String str2 = "안녕";
		
		try {			
			byte[] byteArr1 = str1.getBytes("UTF-8");
			byte[] byteArr2 = str2.getBytes("UTF-8");
			
			System.out.println(byteArr1);//[B@15db9742
			System.out.println(byteArr2);//[B@6d06d69c
			
			System.out.println(new String(byteArr1, "UTF-8"));//ABC123
			System.out.println(new String(byteArr2, "UTF-8"));//안녕
			
			for(int i=0; i<byteArr1.length;i++) {
				System.out.print(byteArr1[i]);//아스키 코드로 출력
				System.out.print("[" + (char)byteArr1[i] + "] ");//아스키 코드로 출력
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
