package Model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Girland extends TreeDecorator {
    public Girland(ChristmasTree tree) {
        super(tree);
    }

    public void draw(Pane paneGirland) {
        super.draw(paneGirland);
        this.drawGirland(paneGirland);
    }

    public void drawGirland(Pane pane) {
        Circle circle1 = new Circle();
        circle1.setRadius(15.0);
        circle1.setCenterX(60.0);
        circle1.setCenterY(130.0);
        circle1.setFill(Color.ORANGE);
        pane.getChildren().add(circle1);
        Circle circle2 = new Circle();
        circle2.setRadius(15.0);
        circle2.setCenterX(120.0);
        circle2.setCenterY(170.0);
        circle2.setFill(Color.DARKCYAN);
        pane.getChildren().add(circle2);
        Circle circle3 = new Circle();
        circle3.setRadius(15.0);
        circle3.setCenterX(40.0);
        circle3.setCenterY(200.0);
        circle3.setFill(Color.DARKRED);
        pane.getChildren().add(circle3);
        Circle circle4 = new Circle();
        circle4.setRadius(15.0);
        circle4.setCenterX(170.0);
        circle4.setCenterY(220.0);
        circle4.setFill(Color.LIGHTYELLOW);
        pane.getChildren().add(circle4);
        Circle circle5 = new Circle();
        circle5.setRadius(15.0);
        circle5.setCenterX(140.0);
        circle5.setCenterY(320.0);
        circle5.setFill(Color.SILVER);
        pane.getChildren().add(circle5);
        Circle circle6 = new Circle();
        circle6.setRadius(15.0);
        circle6.setCenterX(60.0);
        circle6.setCenterY(320.0);
        circle6.setFill(Color.BLUE);
        pane.getChildren().add(circle6);
        Circle circle7 = new Circle();
        circle7.setRadius(15.0);
        circle7.setCenterX(100.0);
        circle7.setCenterY(350.0);
        circle7.setFill(Color.RED);
        pane.getChildren().add(circle7);

        }
    }

