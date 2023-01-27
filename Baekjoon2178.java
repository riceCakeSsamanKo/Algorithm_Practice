package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon2178 {
    static int n,m;
    static int map[][];
    static boolean visited[][];
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        visited = new boolean[n][m];
        visited[0][0] = true;

        System.out.println(bfs(0, 0));
    }

    static int bfs(int currentX, int currentY) {
        if(currentX == n-1 && currentY == m-1)
            return count;
        for (int i = 0; i < 4; i++) {
            int nextX = currentX+dx[i];
            int nextY = currentY+dy[i];

            if(nextX<0||nextX>=n||nextY<0||nextY>=m)
                continue;

            if(map[nextX][nextY] == 1 && !visited[nextX][nextY]){
                count++;
                visited[nextX][nextY] = true;
                return bfs(nextX,nextY);
            }
        }  // There is no way

        /*
        for(int i=0;i<4;i++){
            int beforeX = currentX+dx[i];
            int beforeY = currentY+dy[i];

            if(beforeX<0||beforeX>=n||beforeY<0||beforeY>=m)
                continue;

            if(visited[beforeX][beforeY]){  //지나온 자리
                count--;
                map[currentX][currentY] = 2; // 현재 자리는 길 없음. 지나가면 안됨
                return bfs(beforeX,beforeY);
            }
        } // Way back
        큐 안쓰고 구현함. 고쳐야함*/
        return -1;
    }
}
