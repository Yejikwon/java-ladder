package ladderGame.domain;

import java.util.Objects;

public class Position {

    private final static int MOVE_RIGHT = 1;
    private final static int MOVE_LEFT = -1;
    private final static int MOVE_STRAIGHT = 0;
    private final int position;

    public Position(int position) {
        this.position = position;
    }

    public boolean isEquals(int index) {
        return position == index;
    }

    public Position moveBy(Direction direction) {
        if(canMove(direction)) {
            throw new IllegalArgumentException("더이상 왼쪽으로 갈 수 가 없습니다.");
        }
        return moveDirection(direction);
    }

    private boolean canMove(Direction direction) {
        return position == 0 && direction == Direction.LEFT;
    }

    private Position moveDirection(Direction direction) {
        if (direction == Direction.RIGHT) {
            return new Position(position + MOVE_RIGHT);
        }
        if (direction == Direction.LEFT) {
            return new Position(position + MOVE_LEFT);
        }
        return new Position(position + MOVE_STRAIGHT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public String toString() {
        return "Position{" +
                "position=" + position +
                '}';
    }
}