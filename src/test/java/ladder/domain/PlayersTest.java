package ladder.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayersTest {

    @Test
    @DisplayName("사람 한명 입력 테스트")
    void inputPlayer() {
        String player = "Going";
        Players players = new Players(player);
        assertThat(players.size()).isEqualTo(1);
    }

    @Test
    @DisplayName("쉼표(,) 구분자로 사람 여러명 입력 테스트")
    void inputPlayers() {
        String player = "Keep, Going, MJH, Super, Hero";
        Players players = new Players(player);
        assertThat(players.size()).isEqualTo(5);
    }

    @Test
    @DisplayName("플레이어 이름중 가장 긴 이름의 길이 확인 테스트")
    void lengthOfLongestName() {
        String player = "Keep, Going, MJH, Super, HeroM";
        Players players = new Players(player);
        assertThat(players.lengthOfLongestName()).isEqualTo(5);
    }
}
