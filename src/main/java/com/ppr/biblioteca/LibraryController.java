package com.ppr.biblioteca;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LibraryController {
    @FXML
    private Button connectButton;
    @FXML
    private Button closeConnectionButton;
    private DBConnection dbConnection;

    @FXML
    void initialize() {
        // Initialize the database connection class
        dbConnection = new DBConnection();
    }

    @FXML
    void onConnectDB(ActionEvent event) {
        // Handle the click event on the connect button
        dbConnection.connectToDatabase();
    }

    @FXML
    void onDisconnectDB() {
        // Handle the click event on the close connection button
        dbConnection.closeConnection();
    }
}