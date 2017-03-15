/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Anthon Steiness
 */
public class LoginForm extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //                This is just a simple new window with a GridPane scene algorithm
//                Which also hides the window that iy originated from.
// --------------------------------------------------------------------------------
//            GridPane pane2 = new GridPane();
//            pane2.setAlignment(Pos.CENTER);
//            Scene scene2 = new Scene(pane2, 600, 600);
//            
//            Stage stage2 = new Stage();
//            stage2.setTitle("This is beyond the great door of sesam");
//            stage2.setScene(scene2);
//            stage2.show();
//
//            Hide this current window (if this is what you want)
//            ((Node)(event.getSource())).getScene().getWindow().hide();
//  ---------------------------------------------------------------------------------------------
//  ---------------------------------------------------------------------------------------------
//        #######        This is all show Logic for the Login Stage!       ########
//  ---------------------------------------------------------------------------------------------
        GridPane loginPane = new GridPane();
        loginPane.setAlignment(Pos.CENTER);
        Scene scene2 = new Scene(loginPane, 425, 150);

        Text header = new Text("Please Login: ");
        header.setFont(Font.font("Matura MT Script Capitals", 40));
        header.setFill(Color.BLUE);

        Label userLbl = new Label("Username: ");
        Label pwLbl = new Label("Password: ");

        TextField userField = new TextField();
        PasswordField pswdField = new PasswordField();
        userField.setPromptText("Enter your username here.");
        pswdField.setPromptText("********");

        Button loginBtn = new Button();
        loginBtn.setText("Login");

        HBox loginBox = new HBox(10);
        loginBox.setAlignment(Pos.BOTTOM_CENTER);
        loginBox.getChildren().add(loginBtn);

        loginPane.add(header, 0, 0);
        loginPane.add(userLbl, 0, 1);
        loginPane.add(pwLbl, 0, 2);
        loginPane.add(userField, 1, 1);
        loginPane.add(pswdField, 1, 2);
        loginPane.add(loginBox, 0, 4);

        loginPane.setGridLinesVisible(true);

        Stage stage2 = new Stage();
        stage2.setTitle("Beyond the great door of Sesam");
        stage2.setScene(scene2);
        stage2.show();
//  ------------------------------------------------------------------------------------
//  ------------------------------------------------------------------------------------
//      ######      This is the logic for the Login Button      #########
//  ------------------------------------------------------------------------------------

        
    }

}
