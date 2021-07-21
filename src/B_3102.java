import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_3102 {

	public static void main(String[] args) throws IOException {

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(rd.readLine());

		int cmdNum = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < cmdNum; i++) {
			st = new StringTokenizer(rd.readLine());
			String cmd = st.nextToken();

			switch (cmd) {
			case "push(":
				stack.push(Integer.parseInt(st.nextToken()));
				break;

			case "top()":
				if (stack.empty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.peek());
				}
				break;

			case "pop()":
				if (!stack.empty())
					stack.pop();
				break;

			case "size()":
				System.out.println(stack.size());
				break;

			case "empty()":
				System.out.println(stack.empty());
				break;
			}
		}

	}

}
