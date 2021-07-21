import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P_1905 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		System.out.println(func(Integer.parseInt(br.readLine())));
	}

	private static int func(int num) {
		if (num == 0)
			return 0;
		else
			return num + func(num - 1);
	}
}