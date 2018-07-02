package Lesson_1.Marathon;

public interface Competitor {

    void run(int dist);
    void swim(int dist);
    void jump(int height);
    void info();
    boolean isOnDistance();

}

class Animal implements Competitor {

    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;


    boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if(dist <= maxRunDistance) {
            System.out.println(type + " " + name + " справился с дистанцией");
        } else {
            System.out.println(type + " " + name + " не справился с дистанцией");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if(dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " справился с дистанцией");
        } else {
            System.out.println(type + " " + name + " не справился с дистанцией");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height <= maxJumpHeight) {
            System.out.println(type + " " + name + " справился высотой");
        } else {
            System.out.println(type + " " + name + " не справился высотой");
            onDistance = false;
        }
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " " + onDistance);
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super("Кот", name, 200,10,5);
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super("Пес", name, 500,5,10);
    }
}
