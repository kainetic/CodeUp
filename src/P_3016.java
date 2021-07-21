import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P_3016 {

	static class Student implements Comparable<Student> {
		String name;
		int score1, score2, score3;

		public Student(String name, int score1, int score2, int score3) {
			super();
			this.name = name;
			this.score1 = score1;
			this.score2 = score2;
			this.score3 = score3;
		}

		@Override
		public int compareTo(Student o) {
			return o.score1 - this.score1;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Student[] arr;

		int N;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());

		arr = new Student[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()));
		}

		Arrays.sort(arr);

		sb.append(arr[0].name + " ");

		int score2 = arr[0].score2;
		int idx = 1;
		for (int i = 1; i < N; i++) {
			if (arr[i].score2 > score2) {
				idx++;
			}
		}
		sb.append(idx + " ");

		int score3 = arr[0].score3;
		idx = 1;
		for (int i = 1; i < N; i++) {
			if (arr[i].score3 > score3) {
				idx++;
			}
		}
		sb.append(idx + " ");

		bw.write(sb.toString());

		br.close();
		bw.flush();
		bw.close();
	}

}
