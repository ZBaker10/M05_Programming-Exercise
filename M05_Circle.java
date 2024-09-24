import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeColorWithMouse extends Application {

    @Override
    public void start(Stage primaryStage) {
        //circle radius 50
        Circle circle = new Circle(50);
        circle.setFill(Color.WHITE);  // Set initial color to white

        //pane to hold circle
        StackPane pane = new StackPane(circle);

        //mouse pressed event to change circle color to black
        circle.setOnMousePressed((MouseEvent event) -> {
            circle.setFill(Color.BLACK);
        });

        //mouse released event to change circle color to white
        circle.setOnMouseReleased((MouseEvent event) -> {
            circle.setFill(Color.WHITE);
        });

        // scene and place it in stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Change Circle Color with Mouse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}