import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1902 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		func(Integer.parseInt(br.readLine()));
	}

	private static void func(int num) {
		if (num == 0)
			return;
		else {
			System.out.println(num);
			func(num - 1);
		}
	}
}