package java_package;

import java.util.StringTokenizer;

public class practice {
    public static void main(String[] args){
        String str = "블로그>오늘뭐먹지 :몰라";
        StringTokenizer st = new StringTokenizer(str,">:");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}







