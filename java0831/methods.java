package java0831;

import java.io.IOException;
import java.util.Arrays;

public class methods {

	public static void main(String[] args) throws IOException {
		int[] listN = {10 , 2, 4, 67, 1, 6, 12, 7, 8, 3};
		
		// 정수형 배열에 저장된 모든 값 더하여 반환 
		System.out.println(getSum(listN));
		
		// 배열에 저장된 숫자 중 입력된 숫자보다 큰 수가 몇 개 있는지 구하기
		System.out.println(getSum(listN, 6));
		
		// 정수형 배열에 저장된 숫자 중 가장 큰 숫자 출력
		System.out.println(getMax(listN));
		
		// 배열에 저장된 숫자를 역순으로 저장하여 출력
		 System.out.println(Arrays.toString(getReserve(listN, listN[3])));
	}

	private static int[] getReserve(int[] listN, int n) {
		int[] reversed = new int[listN.length];
		
        for (int i = 0; i < listN.length; i++) {
            reversed[i] = listN[listN.length - 1 - i];
        }
        
        return reversed;
	}
	
	private static int getMax(int[] listN) {
		int max = listN[0];
		 
        for (int i : listN) {
            if (i > max) {
                max = i;
            }
        }
        
        return max;
	}

	private static int getSum(int[] listN, int i) {
		int count = 0;
		 
        for (int j : listN) {
            if (j > i) {
                count++;
            }
        }
        
        return count;
	}

	private static int getSum(int[] listN) {
		int sum = 0;
		
        for (int i : listN) {
            sum += i;
        }
        
        return sum;
	}

	
}
