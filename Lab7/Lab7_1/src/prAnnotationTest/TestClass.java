package prAnnotationTest;

public class TestClass {

    @Test(a = 2, b = 5)
    public static void test(int a, int b) {
        System.out.println("Parameters are: " + a + " and " + b);
    }
}
