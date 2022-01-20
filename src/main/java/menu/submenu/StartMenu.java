package menu.submenu;


import com.googlecode.lanterna.screen.Screen;
import element.position.Position;
import game.GameInterface;
import menu.Menu;
import menu.button.ExitButton;
import menu.button.InstructionsButton;
import menu.button.LeaderboardButton;
import menu.button.StartButton;

import java.util.Arrays;

public class StartMenu extends Menu {
    private final int xIncr;
    private final int yIncr;

    public StartMenu(GameInterface game, Screen screen) {
        super(game, screen);
        xIncr = 10;
        yIncr = 15;
        setButtonList(Arrays.asList(
                new StartButton(game, new Position(xIncr, yIncr)),
                new InstructionsButton(game, new Position(xIncr, yIncr + 5)),
                new LeaderboardButton(game, new Position(xIncr, yIncr + 10)),
                new ExitButton(game, new Position(xIncr, yIncr + 15))

        ));
    }
}
