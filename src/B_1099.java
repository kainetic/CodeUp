import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1099 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[][] matrix = new int[11][11];

		// ����б�
		for (int i = 1; i <= 10; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 1; j <= 10; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int start_y = 2;
		boolean bEnd = false;

		for (int i = 2; i <= 10; i++) {
			for (int j = start_y; j <= 10; j++) {
				if (matrix[i][j] == 2) {
					// ����
					matrix[i][j] = 9;
					bEnd = true;
					break;
				} else if (matrix[i][j] == 1) {
					// ���ٸ� ��
					bEnd = true;
					break;
				} else {
					matrix[i][j] = 9;
				}

				// ��üũ
				if (matrix[i][j + 1] == 1) {
					start_y = j;
					break;
				}
			}

			if (bEnd) {
				break;
			}
		}

		// ���ǥ��
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
