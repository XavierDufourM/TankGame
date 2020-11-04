package xavierdufour;

import xavierdufour.engine.Buffer;
import xavierdufour.engine.controls.MovementController;
import xavierdufour.engine.entity.ControllableEntity;

import java.awt.*;

public class Tank extends ControllableEntity {

    public Tank(MovementController controller) {
        super(controller);
        super.setDimension(30, 30);
        super.setSpeed(4);
        super.teleport(100, 100);
    }

    @Override
    public void update() {
        moveAccordingToHandler();
    }

    @Override
    public void draw(Buffer buffer) {
        buffer.drawRectangle(x, y, width, height, Color.RED);
    }
}
