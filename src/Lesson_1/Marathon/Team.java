package Lesson_1.Marathon;

public class Team {
    String NameTeam;
    Competitor[] competitors;


    public void Team(Competitor... inCompetitors) {


//        for (Competitor competitor: inCompetitors) {
//
//        }
        this.competitors = inCompetitors;
    }

    public void info(){
        System.out.println("Состояние команды:");
        for (Competitor competitor: competitors) {
            competitor.info();
        }
    }
}
