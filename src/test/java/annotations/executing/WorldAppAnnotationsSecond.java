package annotations.executing;

import org.testng.annotations.*;

public class WorldAppAnnotationsSecond {

    private static final String name = WorldAppAnnotationsSecond.class.getSimpleName();

    @BeforeGroups("worldapp")
    public void beforeGroups() {
        System.out.println("@BeforeGroups  " + name);
    }

    @AfterGroups("worldapp")
    public void afterGroups() {
        System.out.println("@AfterGroups  " + name);
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass " + name);
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass " + name);
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod " + name);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod " + name);
    }
}
