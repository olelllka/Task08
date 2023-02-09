package Model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Presents extends TreeDecorator {
    public Presents(ChristmasTree tree) {
        super(tree);
    }

    public void draw(Pane panePresents) {
        super.draw(panePresents);
        this.drawPresents(panePresents);
    }
   // new Double[]{75.0, 450.0, 75.0, 380.0, 125.0, 380.0, 125.0, 450.0}
    public void drawPresents(Pane pane) {
        Polygon pres1 = new Polygon();
        pres1.getPoints().addAll(new Double[]{25.0, 470.0, 25.0, 430.0, 75.0, 430.0, 75.0, 470.0});
        pres1.setFill(Color.BLUE);
        pane.getChildren().add(pres1);
        Polygon pres2 = new Polygon();
        pres2.getPoints().addAll(new Double[]{140.0, 470.0, 140.0, 420.0, 190.0, 420.0, 190.0, 470.0});
        pres2.setFill(Color.RED);
        pane.getChildren().add(pres2);
        Polygon pres3 = new Polygon();
        pres3.getPoints().addAll(new Double[]{170.0, 470.0, 170.0, 380.0, 220.0, 380.0, 220.0, 470.0});
        pres3.setFill(Color.BLUEVIOLET);
        pane.getChildren().add(pres3);
    }
}
