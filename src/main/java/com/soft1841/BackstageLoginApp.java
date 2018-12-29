package com.soft1841;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class BackstageLoginApp extends  Application {
    public void start (Stage primaryStage) throws Exception {
        primaryStage.setTitle("智行超市");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/backlogin.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root,500,600);
        scene.getStylesheets().addAll(
                "/css/style.css");
        primaryStage.getIcons().add(new Image("/img/logo.png"));
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main (String[] args) {
        Application.launch(args);
    }
}

