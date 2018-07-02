package Lesson_1.Marathon;

public class Human implements Competitor {

    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;


    boolean active;

    public Human(String name) {

        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 30;
        this.maxSwimDistance = 200;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if(dist <= maxRunDistance) {
            System.out.println(name + " справился с дистанцией");
        } else {
            System.out.println(name + " не справился с дистанцией");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if(dist <= maxSwimDistance) {
            System.out.println(name + " справился с дистанцией");
        } else {
            System.out.println(name + " не справился с дистанцией");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height <= maxJumpHeight) {
            System.out.println(name + " справился высотой");
        } else {
            System.out.println(name + " не справился высотой");
            active = false;
        }
    }

    @Override
    public void info() {
        System.out.println(name + " " + active);
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }
}
