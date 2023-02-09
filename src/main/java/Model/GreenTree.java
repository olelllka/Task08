package Model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class GreenTree implements ChristmasTree {
    public GreenTree() {
    }

    public void draw(Pane pane) {
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(new Double[]{100.0, 50.0, 200.0, 250.0, 0.0, 250.0});
        triangle.setFill(Color.GREEN);
        pane.getChildren().add(triangle);
        Polygon triangle1 = new Polygon();
        triangle1.getPoints().addAll(new Double[]{100.0, 120.0, 230.0, 380.0, -30.0, 380.0});
        triangle1.setFill(Color.GREEN);
        pane.getChildren().add(triangle1);
        Polygon trunk = new Polygon();
        trunk.getPoints().addAll(new Double[]{75.0, 450.0, 75.0, 380.0, 125.0, 380.0, 125.0, 450.0});
        trunk.setFill(Color.BROWN);
        pane.getChildren().add(trunk);
    }
}
