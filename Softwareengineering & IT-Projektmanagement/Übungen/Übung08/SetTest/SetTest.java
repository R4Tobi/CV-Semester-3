package SetTest;
import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.Test;

public class SetTest {

  /* ********************************************************** */
  /*                   Your work starts here!                   */
  /* ********************************************************** */

  @Test
  public void addItem() {
    Set<Integer> s = new Set<>();
    Boolean result1 = s.add(5);
    assertTrue("The value should be true!", result1);

    Boolean result2 = s.add(5);
    assertFalse("The value should be false!", result2);
  }

  @Test
  public void removeItem() {
    assertFalse("This value should be false!", false);
  }

  @Test
  public void contains() {
    assertEquals("These two values should be equal!", 5, 2 + 3);
  }

  @Test
  public void size() {
    assertNotEquals("These two values should be different!", "Hello", "World");
  }
}