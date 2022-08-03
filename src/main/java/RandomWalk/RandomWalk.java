package RandomWalk;

import java.util.concurrent.ThreadLocalRandom;

public class RandomWalk {

    public int x0;
    public int y0;

    public RandomWalk(int x0, int y0) {
        this.x0 = x0;
        this.y0 = y0;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public int getX0() {
        return x0;
    }

    public int getY0() {
        return y0;
    }

    public void randomWalkingPoint() {

        int step = 1;
        int move = ThreadLocalRandom.current().nextInt(1, 5);

        if (move == 1) this.x0 += 1;
        if (move == 2) this.y0 += 1;
        if (move == 3) this.x0 -= 1;
        if (move == 4) this.y0 -= 1;

    }


    @Override
    public String toString() {
        return "RandomWalk.RandomWalk{" +
                "x0 = " + x0 +
                ", y0 = " + y0 +
                '}';
    }
}
