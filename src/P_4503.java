import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P_4503 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int N, E, cnt;
	static ArrayList<ArrayList<Integer>> adjList;
	static boolean[] isVisited;

	public static void main(String[] args) throws Exception {

		N = Integer.parseInt(br.readLine());
		E = Integer.parseInt(br.readLine());

		adjList = new ArrayList<>();
		for (int i = 1; i <= N + 1; i++) {
			adjList.add(new ArrayList<Integer>());
		}

		int A, B;
		for (int i = 1; i <= E; i++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());

			adjList.get(A).add(B);
			adjList.get(B).add(A);
		}

		isVisited = new boolean[N + 1];
		cnt = -1;
		dfs(1);

		System.out.println(cnt);
		br.close();
	}

	private static void dfs(int cur) {
		isVisited[cur] = true;
		cnt++;

		for (int next : adjList.get(cur)) {
			if (!isVisited[next]) {
				dfs(next);
			}
		}
	}
}