package Study;

//쓰레드 클래스 상속
public class ThreadStudy extends Thread {
	
	//쓰레드 클래스의 run() 메서드
	public void run() {
		System.out.println("dd");
	}

	public static void main(String[] args) {
		ThreadStudy threadStudy = new ThreadStudy();
		threadStudy.start();//run() 메서드 실행

	}

}
