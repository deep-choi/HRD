public class Ch04 {
    public static void main(String[] args) {
        example();
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();
        example8();
        example9();
    }

    public static void example() {
        System.out.println("----------example");
        int score = 90;

        if (score >= 80) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }
    }

    public static void example1() {
        System.out.println("----------example");
        int score = 90;

        if (score >= 80) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }
    }

    public static void example2() {
        System.out.println("----------example");
        int score = 70;
        
        if(score >=90){
            System.out.println("A등급입니다.");
        } else if(score >=80){
            System.out.println("B등급입니다.");
        } else if(score >= 60){
            System.out.println("C등급입니다.");
        } else{
            System.out.println("D등급입니다.");
        }
    }

    public static void example3() {
        System.out.println("----------example");
        int menu = 2;

        switch (menu) {
        case 1:
            System.out.println("커피를 선택했습니다.");
            break;

        case 2:
            System.out.println("주스를 선택했습니다.");
            break;

        case 3:
            System.out.println("물을 선택했습니다.");
            break;

        default:
            System.out.println("잘못된 메뉴입니다.");
        }
    }

    public static void example4() {
        System.out.println("----------example");
        int menu = 4;

        switch (menu) {
           case 1 -> System.out.println("커피");
           case 2 -> System.out.println("라떼");
           case 3 -> System.out.println("아아");
           case 4 -> System.out.println("김밥");
           default -> System.out.println("없는 메뉴입니다.");
        }
    }

    public static void example5() {
        System.out.println("----------example");

        String grade = "a";

        switch (grade) {
        case "A", "a" -> System.out.println("우수회원");
        case "B", "b" -> System.out.println("일반 회원");
        default -> System.out.println("손님");
        }
    }

    public static void example6() {
        System.out.println("----------example");
        for (int i = 1; i <= 5; i++)
            System.out.println(i);
    }
    
    public static void example7() {
        System.out.println("----------example");
        for (int i = 2; i <= 10; i +=2)
            System.out.println(i);

    }
    public static void example8() {
        System.out.println("----------example");

    }
    public static void example9() {
        System.out.println("----------example");

    }

}