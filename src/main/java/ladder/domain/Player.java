package ladder.domain;

import java.util.Optional;

public class Player {
    private static final int MAX_LENGTH = 5;
    private String name;

    public Player(String name) {
        this.name = lengthValidation(name);
    }

    private String lengthValidation(String name) {
        return Optional.ofNullable(name)
                .filter(x -> x.length() <= MAX_LENGTH)
                .orElseThrow(() -> new IllegalArgumentException("Player 이름은 최대 5자 까지 입니다."));
    }

    public String isName() {
        return name;
    }

    public int lengthOfName() {
        return name.length();
    }
}
