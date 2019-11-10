import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class HelloWorld {
   @Test
   public void testHello() {
      String str= "Hello Junit";
      assertEquals("Hello Junit",str);
   }
}