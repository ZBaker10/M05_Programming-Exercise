import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageGridPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        //create a GridPane
        GridPane gridPane = new GridPane();

        //load images
        Image image1 = new Image("file:path/to/flag1.jpg");
        Image image2 = new Image("file:path/to/flag2.jpg");
        Image image3 = new Image("file:path/to/flag6.jpg");
        Image image4 = new Image("file:path/to/flag7.jpg");

        //create ImageViews for each image
        ImageView imageView1 = new ImageView(flag1);
        ImageView imageView2 = new ImageView(flag2);
        ImageView imageView3 = new ImageView(flag6);
        ImageView imageView4 = new ImageView(flag7);

        //set the width and height of each image
        imageView1.setFitWidth(200);
        imageView1.setFitHeight(200);
        imageView2.setFitWidth(200);
        imageView2.setFitHeight(200);
        imageView3.setFitWidth(200);
        imageView3.setFitHeight(200);
        imageView4.setFitWidth(200);
        imageView4.setFitHeight(200);

        //add ImageViews to the GridPane
        gridPane.add(imageView1, 0, 0);
        gridPane.add(imageView2, 1, 0);
        gridPane.add(imageView3, 0, 1);
        gridPane.add(imageView4, 1, 1);

        //create a scene and place it in the stage
        Scene scene = new Scene(gridPane, 450, 450);
        primaryStage.setTitle("Flag Grid Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}