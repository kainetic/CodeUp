import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P_1507 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = 4;
		int x1, x2, y1, y2;
		boolean[][] area = new boolean[101][101];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());

			for (int j = x1; j < x2; j++) {
				for (int k = y1; k < y2; k++) {
					area[j][k] = true;
				}
			}
		}

		int cnt = 0;

		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if (area[i][j])
					cnt++;
			}
		}

		sb.append(cnt);

		bw.write(sb.toString());

		br.close();
		bw.flush();
		bw.close();
	}

}
