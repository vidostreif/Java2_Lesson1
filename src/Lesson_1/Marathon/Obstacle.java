package Lesson_1.Marathon;

public abstract class Obstacle {
    public abstract void doIt(Competitor competitor);
}

class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}

class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}


class MainClass {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
        Obstacle[] obstacles = {new Cross(4000), new Wall(10)};

        for(Competitor c: competitors) {
            for(Obstacle o: obstacles) {
                o.doIt(c);
                if(!c.isOnDistance()) break;
            }
        }

        for(Competitor c: competitors) {
            c.info();
        }
    }
}

