package ba.unsa.etf.rs.tutorijal9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/glavni.fxml"));
        ba.unsa.etf.rs.tutorijal9.GlavniController ctrl = new ba.unsa.etf.rs.tutorijal9.GlavniController();
        loader.setController(ctrl);
        Parent root = loader.load();
        primaryStage.setTitle("Vozaci i busevi");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}