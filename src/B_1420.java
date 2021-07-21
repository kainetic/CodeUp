import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B_1420 {

	static class Member {
		String name;
		int score;

		Member(String name, int score) {
			this.name = name;
			this.score = score;
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Member> list = new ArrayList<Member>();
		StringTokenizer st;
		int num = Integer.parseInt(rd.readLine());

		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(rd.readLine());
			list.add(new Member(st.nextToken(), Integer.parseInt(st.nextToken())));
		}
		
		System.out.println(list.size());

		Collections.sort(list, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				System.out.println(o1.score + " " + o2.score);
				if (o1.score > o2.score)
					return 1;
				else if (o1.score < o2.score)
					return -1;
				else
					return 0;
			}
		});

		System.out.println(list.get(2).name);

	}

}
