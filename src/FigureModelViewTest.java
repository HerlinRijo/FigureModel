import org.junit.Test;
import static org.junit.Assert.assertEquals;
import javax.swing.ImageIcon;

public class FigureModelViewTest {

  /*
   * Test if setImage calls Listener when image is changed
   * image is set to tempImage
   * should return true
  */
  @Test 
  public void testSetImageChanged() {
    FigureModelListener figureListener = new FigureModelListener();
    String filename = "tempImage.JPG";
    ImageIcon tempImg = new ImageIcon(filename);
    figureListener.getFigureModel().setImage(tempImg);
    boolean expectedOutput = true;
    // Do the actual assertion.
    assertEquals(expectedOutput, figureListener.getImageChanged());
  }

  /*
   * Test if setCaption calls Listener when caption is changed
   * captionis set to zoo
   * should return true
  */
  @Test // test that came with sample file
  public void testSetCaptionChanged() {
    FigureModelListener figureListener = new FigureModelListener();
    figureListener.getFigureModel().setCaption("zoo");
    boolean expectedOutput = true;
    // Do the actual assertion.
    assertEquals(expectedOutput, figureListener.getCaptionChanged());
  }

  /*
   * Test if setImage does not call Listener when image is  notchanged
   * image is not set to anything
   * should return false
  */
  @Test 
  public void testSetImageNotChanged() {
    FigureModelListener figureListener = new FigureModelListener();
    boolean expected = false;
    assertEquals(expected, figureListener.getImageChanged());
  }


  /*
   * Test if setCaption does not call Listener when caption is notchanged
   * caption is not set to anything
   * should return false
  */
  @Test 
  public void testSetCaptionNotChanged() {
    FigureModelListener figureListener = new FigureModelListener();
    boolean expected = false;
    assertEquals(expected, figureListener.getCaptionChanged());
  }


  /*
   * Test if setImage does not call Listener when image is not changed but caption is changed
   * caption is set to zoo
   * image is not set to anything
   * should return false
  */
  @Test 
  public void testSetImageNotChangedButCaptionIsChanged() {
    FigureModelListener figureListener = new FigureModelListener();
    boolean expected = false;
    figureListener.getFigureModel().setCaption("zoo");
    assertEquals(expected, figureListener.getImageChanged());
  }


   /*
   * Test if setCaption does not call Listener when caption is not changed but image is changed
   * caption is not set to anything
   * image is set to tempImg
   * should return false
  */
  @Test 
  public void testSetCaptionNotChangedButImageIsChanged() {
    FigureModelListener figureListener = new FigureModelListener();
    boolean expected = false;
    String filename = "tempImage.JPG";
    ImageIcon tempImg = new ImageIcon(filename);
    figureListener.getFigureModel().setImage(tempImg);
    assertEquals(expected, figureListener.getCaptionChanged());
  }
}
