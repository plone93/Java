package Study;

public class WrapperClassStudy {

	public static void main(String[] args) {
		//래퍼클래스
		Integer I = new Integer(10);
		Integer II = new Integer(10);
		//기본타입
		int i = 10;
		int ii = 10;
		
		System.out.println("기본 == 기본" + (i == ii));
		System.out.println("래퍼 == 래퍼" + (I == II));
		System.out.println("래퍼 == 기본" + (I == i));
		System.out.println("래퍼.equals(기본)" + I.equals(i));
		System.out.println("래퍼.equals(래퍼)" + I.equals(II));
		
		try {
			String str = null;
			Integer num1 = Integer.parseInt(str);
			int num2 = Integer.parseInt(str);
			
			System.out.println(num1);
			System.out.println(num2);
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		
		
		
		/*
		int a = null;
		Integer aa = null;
		Integer i = 10;
		int ii = 10;
		
		System.out.println(i.hashCode());
		System.out.println(i.byteValue());
		System.out.println(i.floatValue());
		
		Boolean b = true;
		System.out.println(b.booleanValue());
		System.out.println(b.compareTo(b));
		
		Character c = 'a';
		char cc = 'a';
		System.out.println("CCCCCCCCC");
		System.out.println(c.charValue());
		System.out.println(c.toString());
		
		Integer num = 10;
		int count = num;//언박싱, Integer > int
		Integer num2 = count;//박싱, int > Integer
		
		*/
	}

}
