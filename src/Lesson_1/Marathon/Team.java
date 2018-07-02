package Lesson_1.Marathon;

public class Team {
    String nameTeam;
    Competitor[] competitors;


    public Team(String inNameTeam, Competitor... inCompetitors) {


//        for (Competitor competitor: inCompetitors) {
//
//        }
        this.competitors = inCompetitors;
        this.nameTeam = inNameTeam;
    }

    public void info(){
        System.out.println("Состояние команды:");
        for (Competitor competitor: competitors) {
            competitor.info();
        }
    }

    public void infoWiner(){
        System.out.println("Прошедшие дистанцию:");
        for (Competitor competitor: competitors) {
            if (competitor.isOnDistance()){
                competitor.info();
            }
        }
    }
}
