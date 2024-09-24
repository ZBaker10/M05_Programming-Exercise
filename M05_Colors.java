import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ColorSelector extends Application {

    @Override
    public void start(Stage primaryStage) {
        //red, green, blue, and opacity sliders
        Slider redSlider = createSlider();
        Slider greenSlider = createSlider();
        Slider blueSlider = createSlider();
        Slider opacitySlider = createSlider();
        
        //text
        Text text = new Text("Colorful Text");
        text.setFont(Font.font(24));
        
        //labels for sliders
        Label redLabel = new Label("Red");
        Label greenLabel = new Label("Green");
        Label blueLabel = new Label("Blue");
        Label opacityLabel = new Label("Opacity");

        //GridPane to hold sliders and labels
        GridPane pane = new GridPane();
        pane.setVgap(10);
        pane.setHgap(10);

        //labels and sliders in GridPane
        pane.add(redLabel, 0, 0);
        pane.add(redSlider, 1, 0);
        
        pane.add(greenLabel, 0, 1);
        pane.add(greenSlider, 1, 1);
        
        pane.add(blueLabel, 0, 2);
        pane.add(blueSlider, 1, 2);
        
        pane.add(opacityLabel, 0, 3);
        pane.add(opacitySlider, 1, 3);
        
        pane.add(text, 1, 4);

        //update text color when sliders move
        ChangeListener<Number> colorChangeListener = (ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
            updateTextColor(text, redSlider, greenSlider, blueSlider, opacitySlider);
        };
        
        redSlider.valueProperty().addListener(colorChangeListener);
        greenSlider.valueProperty().addListener(colorChangeListener);
        blueSlider.valueProperty().addListener(colorChangeListener);
        opacitySlider.valueProperty().addListener(colorChangeListener);

        //scene and display
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Color Selector");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Helper method to create a standard slider
    private Slider createSlider() {
        Slider slider = new Slider(0, 255, 0);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(50);
        slider.setBlockIncrement(1);
        return slider;
    }

    // Update the text color based on slider values
    private void updateTextColor(Text text, Slider redSlider, Slider greenSlider, Slider blueSlider, Slider opacitySlider) {
        double red = redSlider.getValue() / 255.0;
        double green = greenSlider.getValue() / 255.0;
        double blue = blueSlider.getValue() / 255.0;
        double opacity = opacitySlider.getValue() / 255.0;
        text.setFill(new Color(red, green, blue, opacity));
    }

    public static void main(String[] args) {
        launch(args);
    }
}