package _string;

public class StringTest3 {

    public static void main(String[] args) {

        String str1 = "ABCD";
        int countStr1 = str1.length();
        System.out.println("countStr1 : " + countStr1);

        // replace 메서드는 문자열 내에서 특정 문자열을 다른 문자나 문자열로 교체하는데
        // 사용할 수 있다.
        String str2 = "Hello World";
        // replace ( [기존문자], [바꿀문자] )
        String str3 = str2.replace("World","Java");
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);

        // 변수에 선언과 초기화
        // replace 는 특수문자로도 치환가능 --> 첫 번째 값으로 바꿀 문자열을 입력 받는 대신 첫 번째 인자 값으로 정규식이 들어감
        String a = "잠온다";
        a = a.replace("잠온다","###");
        System.out.println(a);

        // replaceAll 은 특수문자로 치환 불가능
        String b = "잠온다1";
        b = b.replaceAll("잠온다1","일어나");
        System.out.println(b);

        // replaceFirst
        String c = "잠온다2";
        c = c.replaceFirst("잠온다2","일어나2");
        System.out.println(c);



        // substring 메서드는 문자열 일부분을 추출하여 새로운 문자열을 반환합니다.
        // 두 가지 오버로딩된 메소드를 제공합니다.
        // startIndex --> 포함
        // endIndex --> 불포함
        // 문자열 인덱스는 0부터 시작한다.
        String result3 = str2.substring(0,5);
        System.out.println("result3 : " + result3);


        System.out.println("---------------");
        String str4 = "ABC";
        String result2 = str4.substring(3);
        System.out.println(result2);


    } // end of main
}
