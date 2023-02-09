package com.example.task08;

import java.net.URL;
import java.util.ResourceBundle;

import Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

public class HelloController implements Initializable {
    @FXML
    public Pane paneLight;

    public HelloController() {
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        ChristmasTree greenTree = new TreeDecorator(new GreenTree());
        greenTree.draw(this.paneLight);
    }
    public void AddGirlStar(ActionEvent actionEvent) {
        ChristmasTree decoratedStar = new Girland(new Star(new GreenTree()));
        decoratedStar.draw(this.paneLight);
    }
    public void AddLights(ActionEvent actionEvent) {
        ChristmasTree girland = new Girland(new GreenTree());
        girland.draw(this.paneLight);
    }
    public void AddStar(ActionEvent actionEvent) {
        ChristmasTree decoratedStar = new Star(new GreenTree());
        decoratedStar.draw(this.paneLight);
    }
    public void AddPresents(ActionEvent actionEvent) {
        ChristmasTree presents = new Presents(new GreenTree());
        presents.draw(this.paneLight);
    }

    public void DeleteAll(ActionEvent actionEvent) {
        this.paneLight.getChildren().clear();
        ChristmasTree greenTree = new TreeDecorator(new GreenTree());
        greenTree.draw(this.paneLight);
    }

    public void AddAll(ActionEvent actionEvent) {
        ChristmasTree all = new Star(new Presents(new Girland(new GreenTree())));
        all.draw(this.paneLight);

    }
}