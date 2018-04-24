package annotations.executing;


import org.testng.annotations.*;

public class WorldAppAnnotationsOne {
    
    private static final String name = WorldAppAnnotationsOne.class.getSimpleName();

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

    @Test
    public void runTest2() {
        System.out.println("@Test - test without group " + name);
    }

    @Test(groups = "worldapp")
    public void runTest1() {
        System.out.println("@Test - testWithGroup " + name);
    }

}
