import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_1901 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuffer sb = new StringBuffer();
	static int N;

	public static void main(String[] args) throws Exception {
		N = Integer.parseInt(br.readLine());
		func(1);
		bw.write(sb.toString());
		bw.flush();
	}

	private static void func(int num) {
		if (num > N)
			return;
		else {
			sb.append(num + "\n");
			func(num + 1);
		}
	}
}