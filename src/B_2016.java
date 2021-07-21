import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_2016 {

	public static void main(String[] args) throws IOException {

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> st = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		int len = Integer.parseInt(rd.readLine());
		String input = rd.readLine();

		for (int i = 0; i < len; i++) {
			st.push(input.charAt(i));
		}

		for (int i = 1; i <= len; i++) {
			sb.insert(0, st.pop());

			if (i % 3 == 0 && !st.isEmpty()) {
				sb.insert(0, ",");
			}

		}

		System.out.println(sb.toString());
		rd.close();

	}

}
