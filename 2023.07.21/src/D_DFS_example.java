import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D_DFS_example {
	// 정수 값을 담는 ArrayList A를 선언
	// boolean 값을 담는 배열 visited를 선언
	static ArrayList<Integer>[] A;
	static boolean visited[];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 위에서 선언한 ArrayList A와 배열 visited의 길이를 선언
		A = new ArrayList[N+1];
		visited = new boolean[N+1];
		// ArrayList A 내에 객체로써 새로운 ArrayList를 선언
		for(int i = 0; i < N+1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		// 한 노드가 몇 개의 인접 노드를 가질지 알 수 없으므로
		// 선언 간 길이가 Fixed 되는 배열 대신 ArrayList를 선언한 것!
		for(int i = 0; i < M; i++) {
			// 연결된 접점들을 각 ArrayList A 요소 내에 산입
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		// DFS 횟수는 기본 0에서 출발
		int count = 0;
		
		// 만약 visited[i] -- 방문 판별 배열의 값이 False라면 DFS(i)를 호출
		for(int i = 1; i < N+1; i++) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		// 최종적으로 쌓인 count를 출력한다.
		System.out.println(count);
	}
	
	// int v를 매개 변수로 하는 DFS 메소드
	static void DFS(int v) {
		// 만약 visited[i]가 True라면 == 이미 방문한 노드라면
		if(visited[v]) {
			// 뭐 건드리지 말고 고대로 종료할 것
			return;
		}
		// visited[v]가 False였다면 True로 바꾸고,
		visited[v] = true;
		for(int i : A[v]) {
			// 연결된 노드 중 False 값을 지니는 visited[i]를 탐색하여
			// DFS(i)를 재귀 호출한다.
			if(visited[i] == false) {
				DFS(i);
			}
		}
	}
}
