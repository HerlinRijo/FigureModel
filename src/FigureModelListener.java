import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class FigureModelListener implements PropertyChangeListener {
    private FigureModel test;
    private boolean captionChanged;
    private boolean imageChanged;

    public FigureModelListener() {
        test = new FigureModel();
        test.addPropertyChangeListener(this);
    }

    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName() == "image") {
            System.out.println("Image Changed");
            imageChanged = true;

        } else {
            System.out.println("Caption Changed");
            captionChanged = true;
        }

    }

    public FigureModel getFigureModel() {
        return test;
    }

    public boolean getCaptionChanged() {
        return captionChanged;
    }

    public boolean getImageChanged() {
        return imageChanged;
    }

    public static void main(String[] args) {
        new FigureModelListener(); // do everything in the constructor
    }
}