package class02;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testing2 {

    @BeforeSuite
    public void beforesiut() {
        System.out.println("I am before suit in another class");
    }

    @BeforeTest
    public void beforetest2() {
        System.out.println("I am before test in another class");
    }

    @Test
    public void Testb() {
        System.out.println("drive me 8888");
    }

    @Test
    public void Testa() {
        System.out.println("drive me to 9999");
    }
}
