package com.c159251.a1.jtexteditor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

/** This class is solely responsible for launching the Application window. **/

public class EditorLauncher extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(EditorLauncher.class.getResource("jtexteditor-layout.fxml"));
        Parent root = fxmlLoader.load();
        EditorController editorController = fxmlLoader.getController();
        editorController.initialize();
        Scene primaryScene = new Scene(root, 720, 480);
        primaryStage.setTitle("Simple Text Editor");
        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}