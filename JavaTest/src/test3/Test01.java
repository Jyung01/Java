package test3;

public class Test01 {
    private String name;
    private int age;

    public Test01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("================");
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age);
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        // 변수 선언과 함께 빈칸을 채우시면 됩니다.
        Test01 kim = new Test01("김유신", 23);
        Test01 lee = new Test01("이순신", 31);

        kim.show();
        lee.show();
    }
}
