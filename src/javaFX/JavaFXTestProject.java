package javaFX;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Anthon Steiness
 */
public class JavaFXTestProject extends Application
{

    private int counter;
    private int openCount = 0;
    private String pwStr;
    private String pass = "open";

    @Override
    public void start(Stage primaryStage)
    {

//  ---------------------------------------------------------------------------------------------
//        #######        This is all show Logic for the Start Stage!       ########
//  ---------------------------------------------------------------------------------------------
        // This is here I make the pane, in this case GridPane
        // Then I position it in the center
        // And then I make a new Scene with the GridPane and the size of the window.
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 800, 800);

        // I make a Button
        Button clickMe = new Button();
        clickMe.setText("Click Me!");

        // I make a TextArea.
        TextArea area = new TextArea();

        // Here I just make a Text for the header
        Text shit = new Text("This text is shit...");
        shit.setFont(Font.font("Chiller", 40));
        shit.setFill(Color.FIREBRICK);
//        sceneTitle.setFont(Font.font("Magneto", FontWeight.NORMAL, 20));

        // Here I make the TextField for the secret door...
        TextField pw = new TextField();
        pw.setPromptText("Put the password here if you know it");

        // Button for opening sesam
        Button openSesam = new Button();
        openSesam.setText("Open Sesam!");

        // It is here I add all these objects i just made onto the GridPane
        // The text will for ex. always be the top left corner.
        // TextArea will always be all the way to the left and always right underneeth the header.
        // And so on and so on.
        pane.add(shit, 0, 0);
        pane.add(area, 0, 1);
        pane.add(clickMe, 2, 2);
        pane.add(openSesam, 2, 0);
        pane.setGridLinesVisible(false);

        // This is here I "make" the primaryStage.
        // (In some way it is already made. Just putting title and telling it to show)
        primaryStage.setTitle("This is the primaryStage Title...");
        primaryStage.setScene(scene);
        primaryStage.show();
//  -----------------------------------------------------------------------------------------------------

        // Click Me button, it just appends some text to the textArea.
        clickMe.setOnAction((ActionEvent event) ->
        {
            counter++;
            area.appendText("\nYou Clicked it for the " + counter + " time!");

            switch (counter)
            {
                case 50:
                    area.setText("You made it to the 50 click milestone! \nGood for yoooou :)");
                    break;
                case 100:
                    area.setText("I hope by now you are getting bored....");
                    break;
                case 200:
                    area.setText("Wooow... You must really be bored to "
                            + "\nto be doin' this for so long..."
                            + "\n\nCongratz man, I feel a bit bad for ya...");
                    break;
                default:
                    System.out.println("This is meant to happen.");
                    break;
            }
        });

// --------------------------------------------------------------------------------------------
//   #######    This is the openSesam Button. It adds a textField and might even reveale the first secret.
//  -----------------------------------------------------------------------------------------------------------------
        openSesam.setOnAction((ActionEvent event) ->
        {
            area.setText("Sooo you wanna se if you are able to open the great door."
                    + "\nMuhahahahahaaaaaa... You will never be able to guess the password..");

            if (openCount < 1)
            {
                pane.add(pw, 0, 2);
                openCount++;
            }

            pwStr = pw.getText();
//            System.out.println("This is the String... If it works I'm stupid..." + pwStr);

            if (pwStr.equals(this.pass))
            {

                LoginForm loginForm = new LoginForm();
                Stage stage2 = new Stage();
                
                try
                {
                    loginForm.start(stage2);
                } catch (Exception ex)
                {
                    Logger.getLogger(JavaFXTestProject.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Something went wrong with the Exception...");
                }
            }

        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }

}
