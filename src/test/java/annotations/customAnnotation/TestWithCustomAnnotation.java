package annotations.customAnnotation;


import com.worldapp.testng.annotations.WorldAppTest;

public class TestWithCustomAnnotation {

    @WorldAppTest(description = "worldapp custom annotation", version = 1)
    public void testRunCustomAnnotion(){
        System.out.println("Annotation executed");
    }

}
