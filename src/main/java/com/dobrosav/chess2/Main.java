package com.dobrosav.chess2;

import com.dobrosav.chess2.game.Game;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private Group root;
    @Override
    public void start(Stage stage) throws IOException {
        this.root = new Group();
        GridPane chessBoard = new GridPane();
        Game game = new Game(chessBoard,"Coral");
        root.getChildren().add(chessBoard);
        Scene scene = new Scene(root, 800, 800);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
