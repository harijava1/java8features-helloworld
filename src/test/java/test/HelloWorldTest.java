package test;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.rule.OutputCapture;
import static org.assertj.core.api.Assertions.assertThat;
public class HelloWorldTest {

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Test
    public void sayHelloWorld() {
        HelloWorld.main(null);
        assertThat(this.outputCapture.toString()).contains("Hello World!");
    }

    @Test
    public void sayHelloNewYork() {
        HelloWorld.main("New York");
        assertThat(this.outputCapture.toString()).contains("Hello New York!");
    }

    @Test
    public void sayHello() {
        HelloWorld.main("New York", "Boston", "Chicago");
        assertThat(this.outputCapture.toString()).contains("Hello New York!");
        assertThat(this.outputCapture.toString()).contains("Hello Boston!");
        assertThat(this.outputCapture.toString()).contains("Hello Chicago!");

    }
}
