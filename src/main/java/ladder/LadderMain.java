package ladder;

import ladder.domain.LadderGame;
import ladder.view.InputView;
import ladder.view.ResultView;

public class LadderMain {

    public static void main(String[] args) {
        String players = InputView.enterPlayers();
        int heightOfLadder = InputView.enterHeightOfLadder();

        LadderGame ladderGame = new LadderGame(players, heightOfLadder);
        ResultView.outputOfResult(ladderGame);
    }

}
