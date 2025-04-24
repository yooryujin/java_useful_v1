package _string;

public final class MyTest1 extends Object{
    // String str = "abc";
    // 밑의 내용과 동일함
    char data[] = { 'a', 'b', 'c'};
    String str = new String(data);

    // public final 은 해당 클래스가 상속될 수 없고, 멤버 변수들이 변경될 수 없음을 의미
    // 이로 인해 final 로 선언된 변수는 한 번 초기화되면 변경될 수 없으며, 클래스를 상속받아 변경할 수도 없다




}
