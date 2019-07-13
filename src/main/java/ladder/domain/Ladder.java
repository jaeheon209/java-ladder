package ladder.domain;

import java.util.Collections;
import java.util.List;

public class Ladder {
	private final List<LadderLine> ladder;

	public Ladder(List<LadderLine> ladder) {
		this.ladder = ladder;
	}

	public int height() {
		return ladder.size();
	}

	public List<LadderLine> getLadder() {
		return Collections.unmodifiableList(ladder);
	}

	public int result(Player player) {
		Position position = player.getPosition();
		for (LadderLine ladderLine : ladder) {
			position = ladderLine.move(position);
		}
		return position.getPosition();
	}
}
