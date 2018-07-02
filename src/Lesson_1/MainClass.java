package Lesson_1;

import Lesson_1.Marathon.*;

class MainClass {
    public static void main(String[] args) {
        Team team = new Team("NameTeam", new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"));
        Course course = new Course(new Cross(4000), new Wall(10));
        course.goDistance(team);
        team.infoWiner();
    }
}




