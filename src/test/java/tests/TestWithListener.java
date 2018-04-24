package tests;


import listeners.WorldAppTestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = WorldAppTestListener.class)
public class TestWithListener {

    @Test
    public void testSuccess(){
        System.out.println("testSuccess");
    }

    @Test
    public void testFailed(){
        throw new IllegalArgumentException();
    }

}
