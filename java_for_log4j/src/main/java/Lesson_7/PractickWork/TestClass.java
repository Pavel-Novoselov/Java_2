package Lesson_7.PractickWork;

public class TestClass {
    // по логике методы должны выполниться 3 потом 2 потом 4
    public static  void method1() {
        System.out.println("met1");
    }
    @BeforeSuite
    public static void start() {
        System.out.println("start");
    }
    @Test
    public static  void method2() {
        System.out.println("met2");
    }
    @Test(priority = 5)
    public static  void method3() {
        System.out.println("met3");
    }
    @Test(priority = 7)
    public static  void method4() {
        System.out.println("met4");
    }
    @AfterSuite
    public static void shutdown() {
        System.out.println("shutdown");
    }
//    если добавить второй метод с анотацией AfterSuite будет ошибка
//    @AfterSuite
//    public static void shutdown1() {
//        System.out.println("shutdown");
//    }
}