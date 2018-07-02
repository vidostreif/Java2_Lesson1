package Lesson_1.Marathon;

public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }


    public void goDistance(Team team){
        for(Competitor c: team.competitors) {
            for(Obstacle o: obstacles) {
                o.doIt(c);
                if(!c.isOnDistance()) break;
            }
        }
    }

}
