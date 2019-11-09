package Lesson_7;

public class ClassForTest1 {
    private int a,b;

    @BeforeSuite
    public void before(){
        System.out.println("Start testing");
    }

    @AfterSuite
    public void finish(){
        System.out.println("Finish testing");
    }


    @Test(priority = 1)
    public int summ (int a, int b){
        return a+b+1;
    }

    @Test
    public int diff (int a, int b){
        return a-b+100;
    }

    @Test(priority = 10)
    public int mult (int a, int b){
        return a*b+200;
    }

    @Test(priority = 3)
    public int div (int a, int b){
        return a/b+50;
    }


}
