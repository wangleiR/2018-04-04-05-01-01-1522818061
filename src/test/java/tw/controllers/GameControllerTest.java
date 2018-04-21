package tw.controllers;

import org.junit.Test;
import tw.commands.InputCommand;
import tw.core.Game;
import tw.views.GameView;
import static org.mockito.Mockito.*;

/**
 * 在GameControllerTest文件中完成GameController中对应的单元测试
 */
public class GameControllerTest {

    @Test
    public void should_get_right_with_input() throws Exception{
        GameView gameView = mock(GameView.class);
        InputCommand inputCommand = mock(InputCommand.class);
        Game game = mock(Game.class);
        GameController gameController = new GameController(game,gameView);
        when(game.checkCoutinue()).thenReturn(true,false);
        gameController.play(inputCommand);
        verify(gameView,times(1)).showGuessHistory(game.guessHistory());
    }


}