import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P_1904 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuffer sb = new StringBuffer();
	static StringTokenizer st;
	static int A, B;

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());

		func(A);
		bw.write(sb.toString());
		bw.flush();
	}

	private static void func(int num) {
		if (num > B)
			return;
		else {
			if (num % 2 != 0) {
				sb.append(num + " ");
				func(num + 2);
			} else {
				func(num + 1);
			}
		}
	}
}