package com.ppr.biblioteca;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LibraryApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LibraryApplication.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 500);

        LibraryController controller = fxmlLoader.getController();
        controller.initialize();

        primaryStage.setTitle("Biblioteca App [PPR] 🤘");

        primaryStage.setOnCloseRequest(event -> {
            controller.onDisconnectDB();
            Platform.exit();
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}