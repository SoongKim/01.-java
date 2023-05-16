import java.util.HashMap;
import java.util.HashSet;

public class E_HashSet {
	public static void main(String[] args) {
		// HashSet과 HashMap 강의
		
		HashSet<String> t = new HashSet<String>();
		t.add("1");
		t.add("2");
		t.add("3");
		t.add("4");
		t.add("5");
		System.out.println(t);
		// 이렇게 보면 ArrayList랑 무슨 차이인지 모르겠다.
		// 그냥 출력이 수월한 정도인 것 같은데
		
//		ArrayList<String> nes = new ArrayList<String>();
//		nes.add("1");
//		nes.add("2");
//		nes.add("3");
//		System.out.println(nes);
//		뭐가 다른거지
		
		
		HashMap<String, String> e = new HashMap<String, String>();
		// 첫 <>는 Key, 두 번째 <>는 Value. 사용하는 Generic type이 두 개.
		e.put("abc", "-----");
		e.put("tt", "*****");
		
		System.out.println(e.get("abc"));
		// abc라는 변수에 ----- 를 담아두고, 추후 abc 변수를 불러오면 담긴 값 -----를 가져온다.
		// == Key를 호출함으로써 Value를 불러온다.
		// 뭔가 알쏭달쏭 신기한 친구.
		
		// Queue : 선입선출. 먼저 넣은 놈이 호출하면 먼저 나간다.
		// Stack : 후입선출. 데이터가 퇴적된다. 꺼내면 위엣 놈 먼저 나간다.
		
		// 핵심 프레임워크:
		// HashMap과 ArrayList. 반드시 기억해라.
	}
}
