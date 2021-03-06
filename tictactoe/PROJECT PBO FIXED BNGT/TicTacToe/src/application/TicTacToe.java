package application;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author ADIPSAGALA
 */
public class TicTacToe extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ticTacToe.fxml"));
       
        Scene scene = new Scene(root);
        stage.setTitle("Tic Tac Toe");
        stage.setResizable(false);
        
        //call on CSS File
        scene.getStylesheets().add(getClass().getResource("TicTacToe.css").toExternalForm());
        //add Application Icon to window
        
        stage.getIcons().add(new Image("icon.png"));
       
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
