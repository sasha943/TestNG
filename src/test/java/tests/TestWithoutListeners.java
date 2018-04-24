package tests;


import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestWithoutListeners {
    
    private int counter = 0;
    private Method[] methods = getClass().getMethods();

    @Test(groups = "broken")
    public void test0(){
        System.out.println("no listener:   " + methods[counter++].getName());
    }

    @Test
    public void test1(){
        System.out.println("no listener:   " + methods[counter++].getName());
    }

    @Test(groups = "broken")
    public void test2(){
        System.out.println("no listener:   " + methods[counter++].getName());
    }

    @Test
    public void test3(){
        System.out.println("no listener:   " + methods[counter++].getName());
    }

    @Test
    public void test4(){
        System.out.println("no listener:   " + methods[counter++].getName());
    }

    @Test
    public void test5(){
        System.out.println("no listener:   " + methods[counter++].getName());
    }

    @Test
    public void test6(){
        System.out.println("no listener:   " + methods[counter++].getName());
    }

    @Test(groups = "broken")
    public void test7(){
        System.out.println("no listener:   " + methods[counter++].getName());
    }
}
