package Chap_01_Array;

import java.util.Arrays;
import java.util.Scanner;

public class _02_TriSnail {

    public int[] answer(int n) {
        int[][] triangle = new int[n][n];
        int num = 1; //배열안에 넣을 숫자. 넣을때마다 1씩 증가 시켜 준다.

        int x = 0;
        int y = 0; //배열 위치를 나타내는 좌표
            // 아래로 이동
            // 처음 선언한 배열 내부의 범위에서만
            // 범위를 넘거나 이동하고 싶은 곳에 숫자가 있을 시에는 while문 탈출

        while(true){

            while (true){
                triangle[y][x] = num++;
                if (y + 1 == n || triangle[y + 1][x] != 0) break;
                y += 1;
            }
            if (x + 1 == n || triangle[y][x + 1] != 0) break;
            x += 1;
            //아래로 이동하다가 오른쪽으로 가려고 할때,
            //지정된 범위를 초과하거나 이미 숫자가 채워져 있다면
            //더이상 채울수 있는 공간이 없다고 생각하고 가장 바깥 while 탈출

            // 오른쪽으로 이동
            while (true) {
                triangle[y][x] = num++;
                if (x + 1 == n || triangle[y][x + 1] != 0) break;
                x += 1;
            }
            if (triangle[y - 1][x - 1] != 0) break;
            x -= 1;
            y -= 1;

            // 왼쪽 위로 이동
            while (true) {
                triangle[y][x] = num++;
                if (triangle[y - 1][x - 1] != 0) break;
                x -= 1;
                y -= 1;
            }
            if (y + 1 == n || triangle[y + 1][x] != 0) break;
            y += 1;
        }

        int[] result = new int[num - 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (triangle[i][j] != 0) { result[index++] = triangle[i][j];}
            }
        }

        return result;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of : ");
        int n = scanner.nextInt();


        _02_TriSnail solution = new _02_TriSnail();
        int[] result = solution.answer(n);

        System.out.println(Arrays.toString(result));

    }

}
