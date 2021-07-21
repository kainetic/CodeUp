import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_3129 {

	public static void main(String[] args) throws IOException {

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String input = rd.readLine();
		Stack<Character> stack = new Stack<Character>();

		int length = input.length();

		for (int i = 0; i < length; i++) {
			char ch = input.charAt(i);

			if (ch == '(') {
				stack.push(ch);
			} else {
				if (stack.empty()) {
					System.out.println("bad");
					return;
				}

				stack.pop();
			}

		}

		if (stack.size() == 0)
			System.out.println("good");
		else
			System.out.println("bad");

	}

}
