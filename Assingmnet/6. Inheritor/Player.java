import java.util.Scanner;

public class Player {

    Scanner sc = new Scanner(System.in);

    int player;
    static String cricketTeamName;

    void GetDataPlayer(String teamName) {

        cricketTeamName = teamName;

        System.out.println("please enter you team name:" + cricketTeamName);

        System.out.println("please enter how many player in this team:");
        player = sc.nextInt();
    }

    void DisplayPlayer() {
        System.out.println("Members in the team = " + player);
    }

}

class CricketPlayer extends Player {

    int run;
    String name;

    void GetDataCricketPlayer() {

        System.out.println("please enter you team name:" + cricketTeamName);

        System.out.println("please enter how many run you complete:");
        run = sc.nextInt();

        System.out.println("please enter you name:");
        name = sc.nextLine();

    }

    void DisplayCricketPlayer() {

        System.out.println("Run of this player = " + run);
        System.out.println("Name of player = " + name);
    }
}

class BatesMan extends CricketPlayer {

    int teamNumber;
    String teamName;

    void GetDataBatesMan() {

        System.out.println("please enter you team name:");
        teamName = sc.nextLine();

        System.out.println("please enter your team number:");
        teamNumber = sc.nextInt();
    }

    void DisplayBatesMan() {
        System.out.println("Name of team = " + teamName);
        System.out.println("Team number of this player = " + teamNumber);
    }

}

class Bowler extends CricketPlayer {

    String bowlerName;

    void GetDataBowler() {

        System.out.println("please enter you bowlerName:");
        bowlerName = sc.nextLine();

    }

    void DisplayBowler() {
        System.out.println("Name of bowler = " + bowlerName);
    }

    public static void main(String[] args) {

        Bowler b = new Bowler();

        b.GetDataPlayer("IPL SEASON 5");
        b.GetDataCricketPlayer();
        b.GetDataBowler();

        b.DisplayPlayer();
        b.DisplayCricketPlayer();
        b.DisplayBowler();

        // b.GetaDataBatesMan();
        // b.DisplayBatesMan();
        // ******** NOTE ********//
        // batsman class function is not called because we are create object of class
        // bowler bowler class child of cricket player class and
        // batsman class also child of cricket player class that's why we are not called
        // batsman class in to the bowler class

    }

}