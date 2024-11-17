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


    private Stage addProductStage;
    private Stage addLogoStage;
    private Stage editProductStage;

    @FXML
    public void openAddProductWindow() {
            try {

                // Load the CreateProduct.fxml file
                FXMLLoader loader = new FXMLLoader(getClass().getResource("AddProduct.fxml"));
                Parent root = loader.load();


                // Create a new window
                Stage addProductStage  = new Stage();
                addProductStage.setTitle("Add Product");
                addProductStage.setScene(new Scene(root, 600, 350));
                addProductStage.setResizable(false);// Set your preferred dimensions
                addProductStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }



    @FXML
    public void openAddLogoWindow() {
            try {

                // Load the AddLogo.fxml file
                FXMLLoader loader = new FXMLLoader(getClass().getResource("AddLogo.fxml"));
                Parent root = loader.load();


                // Create a new window
                Stage addLogoStage = new Stage();
                addLogoStage.setTitle("Add Logo");
                addLogoStage.setScene(new Scene(root, 600, 350));
                addLogoStage.setResizable(false);// Set your preferred dimensions
                addLogoStage.show();
            } catch (IOException e) {
            e.printStackTrace();
            }
    }


    @FXML
    public void openEditProductWindow() {

        // Load the EditProduct.fxml file
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("EditProduct.fxml"));
                Parent root = loader.load();


                // Create a new stage (window)
                Stage editProductStage = new Stage();
                editProductStage.setTitle("Add Logo");
                editProductStage.setScene(new Scene(root, 600, 350));
                editProductStage.setResizable(false);// Set your preferred dimensions
                editProductStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}