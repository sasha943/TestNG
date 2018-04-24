package annotations.executing;


import org.testng.annotations.*;

public class WorldAppAnnotationsThird {

    private static final String name = WorldAppAnnotationsThird.class.getSimpleName();

    @BeforeGroups("worldapp")
    public void thirdBeforeGroups() {
        System.out.println("@BeforeGroups  " + name);
    }

    @AfterGroups("worldapp")
    public void thirdAfterGroups() {
        System.out.println("@AfterGroups  " + name);
    }

    @BeforeClass
    public void thirdBeforeClass() {
        System.out.println("@BeforeClass " + name);
    }

    @AfterClass
    public void thirdAfterClass() {
        System.out.println("@AfterClass " + name);
    }

    @BeforeMethod
    public void thirdBeforeMethod() {
        System.out.println("@BeforeMethod " + name);
    }

    @AfterMethod
    public void thirdAfterMethod() {
        System.out.println("@AfterMethod " + name);
    }
}
