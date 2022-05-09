package calss01;

import org.testng.annotations.Test;

public class DependsOn {

    @Test
    public void login(){
        System.out.println("this is login test ");
    }

    @Test(dependsOnMethods = "login")
    public void verificationOfDashboard(){
        System.out.println("this is dashboard");//skip that

    }
}
