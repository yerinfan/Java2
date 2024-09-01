package java0831;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class scoreSumAver {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 학생 수 입력 받은 후, 학생의 점수 입력 받아 합계 평균 출력
		
		int n = getNumberKeyboard("학생 수: ");
		
		int[] scores = getScoreLine(n);
		
		printSumAverage(scores);
	}

	private static void printSumAverage(int[] scores) {
		int sum = 0;
		for (int s : scores) {
			sum += s;
		}
		
		int aver = sum / scores.length;
		
		System.out.printf(">> 합계 : %d\n", sum);
		System.out.printf(">> 평균 : %d", aver);
	}
	
	private static int[] getScoreLine(int n) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("%d명의 성적 : ", n);
		String s = br.readLine();
		
		int[] scores = new int[n];
		StringTokenizer st = new StringTokenizer(s);
		for (int i = 0; i < n; i++) {
			scores[i] = Integer.parseInt(st.nextToken());		
		}
		
		return scores;
	}

	private static int getNumberKeyboard(String string) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(string);
		
		int n = Integer.parseInt(br.readLine());
		
		return n;
	}

}
