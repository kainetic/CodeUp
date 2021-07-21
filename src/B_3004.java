import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_3004 {

	public static void main(String[] args) throws IOException {

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(rd.readLine());
		st = new StringTokenizer(rd.readLine());
		int value;
		int[] origin = new int[N];
		int[] sort = new int[N];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			value = Integer.parseInt(st.nextToken());
			origin[i] = sort[i] = value;
		}

		Arrays.sort(sort);

		for (int i = 0; i < N; i++)
			sb.append(Arrays.binarySearch(sort, origin[i]) + " ");

		System.out.println(sb.toString());
	}

}
