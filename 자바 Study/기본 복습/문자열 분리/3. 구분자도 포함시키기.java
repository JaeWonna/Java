package java_package;

import java.util.StringTokenizer;

public class practice {
    public static void main(String[] args){
        String str = "안녕하세요!오늘!날씨는!맑음";
        StringTokenizer st = new StringTokenizer(str,"!",true);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}







