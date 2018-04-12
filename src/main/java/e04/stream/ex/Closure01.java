package e04.stream.ex;

public class Closure01 {
    private int number = 99;

    public static void main(String[] args) {
//        final int number = 100;
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(number);
//            }
//        };
//        runnable.run();
//
//        final Runnable  runnable1 = () -> System.out.println(number);
//        runnable1.run();
        final int number = 100;
        closureTest("Anonymous Class", new Runnable() {
            @Override
            public void run() {
                System.out.println(number);
            }
        });

        closureTest("Lambda Expression", () -> System.out.println(number));


        new Closure01().test1();
    }

    private void test1() {
        final int number = 100;
        closureTest("Anonymous Class", new Runnable() {
            @Override
            public void run() {
                System.out.println(Closure01.this.number);
            }
        });
        // scope 확장에 대한 예시
        closureTest("Lambda Expression", () -> System.out.println(this.number));
    }

    private void test2() {
        final int number = 100;
        closureTest("Anonymous Class", new Runnable() {
            @Override
            public void run() {
                System.out.println(Closure01.this.number);
            }
        });

        closureTest("Lambda Expression", () -> {
            //int number =99; // scope 확장에 대한 예시
            System.out.println(this.number);
        });
    }


    public static void closureTest(final String name, final Runnable runnable) {
        System.out.println("=============================");
        System.out.println(name);
        runnable.run();
        System.out.println("=============================");
    }
}
