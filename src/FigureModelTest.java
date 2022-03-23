import org.junit.Test;
import static org.junit.Assert.assertEquals;
import javax.swing.ImageIcon;

public class FigureModelTest {

  /*
   * Test setImageMethod
   * image is null
   * IllegalArgument Exception should be thrown
   */

  @Test(expected = IllegalArgumentException.class) // test that came with sample file
  public void testSetImageNull() {
    FigureModel figureCop = new FigureModel();
    figureCop.setImage(null);
  }

  /*
   * Test setImage Method
   * image is not empty
   * image should match tempImg object
   */

  @Test
  public void setImage() {
    FigureModel figureCop = new FigureModel();
    String filename = "tempImage.JPG";
    ImageIcon tempImg = new ImageIcon(filename);
    figureCop.setImage(tempImg);
    assertEquals(tempImg, figureCop.getImage());
  }

  /*
   * Test setCaption Method
   * caption is null
   * IllegalArgument Exception should be thrown
   */
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalArgumentCaptionNull() {
    FigureModel figureCop = new FigureModel();
    figureCop.setCaption(null);
  }

  /*
   * Test setCaption Method
   * caption is empty
   * IllegalArgument Exception should be thrown
   */
  @Test(expected = IllegalArgumentException.class)
  public void testIllegalArgumentCaptionEmpty() {
    FigureModel figureCop = new FigureModel();
    figureCop.setCaption("");
  }

  /*
   * Test setCaption Method
   * caption is not null
   * caption should be "zoo"
   */
  @Test
  public void testSetCaption() {
    FigureModel figureCop = new FigureModel();
    String cap = "Zoo";
    figureCop.setCaption(cap);
    String expected = "Zoo";
    assertEquals(expected, figureCop.getCaption());
  }

  // Testing Is Complete Method//

  /*
   * Test if all fields are complete
   * image is not null
   * capion is null
   * should return false
   */
  @Test
  public void testIsCompleteImageButNotCaption() {
    FigureModel figureCop = new FigureModel();
    String filename = "tempImage.JPG";
    ImageIcon tempImg = new ImageIcon(filename);
    figureCop.setImage(tempImg);
    boolean expected = false;
    assertEquals(expected, figureCop.isComplete());
  }

  /*
   * Test if all fields are complete
   * image is null
   * capion is set to "zoo"
   * should return false
   */
  @Test
  public void testIsCompleteCaptionButNotImage() {
    FigureModel figureCop = new FigureModel();
    String cap = "Zoo";
    figureCop.setCaption(cap);
    boolean expected = false;
    assertEquals(expected, figureCop.isComplete());
  }

  /*
   * Test if all fields are complete
   * should return true
   */
  @Test
  public void testIsComplete() {
    FigureModel figureCop = new FigureModel();
    String cap = "Zoo";
    figureCop.setCaption(cap);
    String filename = "tempImage.JPG";
    ImageIcon tempImg = new ImageIcon(filename);
    figureCop.setImage(tempImg);
    boolean expected = true;
    assertEquals(expected, figureCop.isComplete());
  }

}
