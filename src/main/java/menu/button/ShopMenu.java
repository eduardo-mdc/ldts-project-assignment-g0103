package menu.button;

import element.position.PositionInterface;
import game.GameInterface;
import menu.Button;

public class ShopMenu extends Button {
    private GameInterface game;

    public ShopMenu(GameInterface game, PositionInterface position) {
        super(position);
        this.game = game;
        setText("CONTINUE");
    }

    @Override
    public void execute() {
        game.setState(8);
    }
}
