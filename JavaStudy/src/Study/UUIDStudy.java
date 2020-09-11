package Study;

import java.util.UUID;

public class UUIDStudy {

	public static void main(String[] args) {
		UUID uuid = UUID.randomUUID();
		String uuidStr = UUID.randomUUID().toString();
		
		System.out.println(uuid);//0a9fd869-c8e7-4aa9-b927-5488b82df1fe
		System.out.println(uuidStr);//d30b4dea-0521-4436-b1f0-99a07c82606a
	}

}
