import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuffer sb = new StringBuffer();
	static StringTokenizer st;
	static long A, B, ans;

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(br.readLine());
		A = Long.parseLong(st.nextToken());
		B = Long.parseLong(st.nextToken());

		ans = pow(A, B);
		bw.write("" + ans);
		bw.flush();
	}

	private static long pow(long A, long B) {
		long result = 0;

		if (B == 1)
			return A;

		if (B % 2 == 0) {
			result = pow(A, B / 2);
			result = result * result;
		} else {
			result = pow(A, B - 1);
			result = A * result;
		}

		return result % Long.MAX_VALUE;
	}
}