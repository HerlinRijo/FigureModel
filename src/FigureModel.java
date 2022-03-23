import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.ImageIcon;

public class FigureModel {
    private String caption;
    private ImageIcon image;

    // constructor
    public FigureModel() {
    }

    private PropertyChangeSupport changes = new PropertyChangeSupport(this);

    // Gets The Image, throws exception if null
    public ImageIcon getImage() {
        return image;
    }

    // Gets the Caption throws exception if null or empty
    public String getCaption() {
        return caption;
    }

    // Takes in a ImageIcon object as a parameter, sets the image to img
    public void setImage(ImageIcon img) {
        if (img == null) {
            throw new IllegalArgumentException("Image is Null");
        }
        changes.firePropertyChange("image", image, image = img);

    }

    // Takes String as a parameter, sets saption to cap
    public void setCaption(String cap) {
        if (cap == "" || cap == null) {
            throw new IllegalArgumentException("Caption is Null or Empty");
        }
        changes.firePropertyChange("caption", image, caption = cap);
    }

    /*
     * Checks if image is complete
     * returns false if image is null
     * returns true if image is not null
     */
    public boolean isComplete() {

        if (getImage() == null) {
            return false;
        }

        if (getCaption() == "" || getCaption() == null) {
            return false;
        }

        return true;
    }

    /*
     * Checks if caption is complete
     * returns false if caption is null or empty
     * returns true if caption is not null or empty
     */
    public boolean isCaptionComplete(String cap) {
        if (cap == null || cap == "") {
            return false;
        }
        return true;
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        changes.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        changes.removePropertyChangeListener(l);
    }
}
