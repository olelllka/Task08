package Model;

import javafx.scene.layout.Pane;

public class TreeDecorator implements ChristmasTree {

    private ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    public void draw(Pane pane) {
        this.tree.draw(pane);
    }
}
