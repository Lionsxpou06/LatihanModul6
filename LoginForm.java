package com.example.latihanmodul6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginForm extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login Form");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        // Labels
        Label usernameLabel = new Label("Username:");
        grid.add(usernameLabel, 0, 1);

        TextField usernameInput = new TextField();
        grid.add(usernameInput, 1, 1);

        Label passwordLabel = new Label("Password:");
        grid.add(passwordLabel, 0, 2);

        PasswordField passwordInput = new PasswordField();
        grid.add(passwordInput, 1, 2);

        // Login Button
        Button btn = new Button ("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn,1,4);

        final Text actiontarget = new Text();
        grid.add(actiontarget,1,6);

        primaryStage.show();
    }



    private void handleLogin(String username, String password) {
        // Implement your login logic here
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
