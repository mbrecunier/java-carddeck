import org.junit.*;
import static org.junit.Assert.*;

public class CardTest {

  @Test
  public void card_initializesCorrectlt_true() {
    Card testCard = new Card("Spades", "Ace");
    assertEquals(true, testCard instanceof Card);
  }
}
