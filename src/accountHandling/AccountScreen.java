package accountHandling;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Antho
 */
public class AccountScreen extends Application
{

    @Override
    public void start(Stage primaryStage)
    {
        BorderPane pane = new BorderPane();
        Scene scene = new Scene(pane, 500, 375);

        // I make a Button
        Button clickMe = new Button();
        clickMe.setText("Send");

        // Button for opening sesam
        Button openSesam = new Button();
        openSesam.setText("Delete");

        // I make a TextArea.
        TextArea area = new TextArea();
        TextArea area2 = new TextArea();

        // Here I just make a Text for the header
        Text shit = new Text("Secret Chat!");
        shit.setFont(Font.font("Britannic Bold", 40));
        shit.setFill(Color.BLACK);

        TilePane tileButtons = new TilePane(Orientation.HORIZONTAL);
        tileButtons.setPadding(new Insets(20, 10, 20, 0));
        tileButtons.setHgap(2.0);
        tileButtons.getChildren().addAll(clickMe, openSesam);

        // It is here I add all these objects i just made onto the GridPane
        // The text will for ex. always be the top left corner.
        // TextArea will always be all the way to the left and always right underneeth the header.
        // And so on and so on.
        pane.setCenter(area);
        pane.setBottom(tileButtons);
        pane.setTop(shit);

        // This is here I "make" the primaryStage.
        // (In some way it is already made. Just putting title and telling it to show)
        primaryStage.setTitle("Secret Chat");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }

}
