import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P_1805 {

	static class Machine implements Comparable<Machine> {
		int num;
		int gas;

		public Machine(int num, int gas) {
			super();
			this.num = num;
			this.gas = gas;
		}

		@Override
		public int compareTo(Machine o) {
			return this.num - o.num;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Machine[] arr;

		int N;

		N = Integer.parseInt(br.readLine());
		arr = new Machine[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = new Machine(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}

		Arrays.sort(arr);

		for (int i = 0; i < N; i++) {
			sb.append(arr[i].num + " " + arr[i].gas + "\n");
		}

		bw.write(sb.toString());

		br.close();
		bw.flush();
		bw.close();
	}

}
