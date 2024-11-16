package edu.miracosta.cs112.threadiv1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
    @FXML
    private Label welcomeText;
    
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void openAddProductWindow() {
        try {
            // Load the CreateProduct.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AddProduct.fxml"));
            Parent root = loader.load();


            // Create a new stage (window)
            Stage stage = new Stage();
            stage.setTitle("Add Product");
            stage.setScene(new Scene(root, 600, 350));
            stage.setResizable(false);// Set your preferred dimensions
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Print error details if the FXML fails to load
        }
    }

    public void openAddLogoWindow() {
        try {
            // Load the CreateProduct.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AddLogo.fxml"));
            Parent root = loader.load();


            // Create a new stage (window)
            Stage stage = new Stage();
            stage.setTitle("Add Logo");
            stage.setScene(new Scene(root, 600, 350));
            stage.setResizable(false);// Set your preferred dimensions
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Print error details if the FXML fails to load
        }


    }
}