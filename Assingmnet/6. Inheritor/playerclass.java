import java.util.Scanner;

public class playerclass {

    Scanner sc = new Scanner(System.in);

    static int playerAge;
    static String playerName;

    void get(int age, String name) {
        playerAge = age;
        playerName = name;
    }

}

class cricketplayer extends playerclass {
    void cricket() {

        System.out.println(playerName + " is a Cricketer");
        System.out.println("Age is: " + playerAge);
    }
}

class batsman extends cricketplayer {

    void GetBatsMan() {

        System.out.println(playerName + " is a batsman");
    }
}

class bowler extends cricketplayer {
    void bowler() {

        System.out.println(playerName + " is a Bowler...");
    }

    public static void main(String arg[]) {

        bowler b = new bowler();
        b.get(30, "virat");
        b.bowler();
        b.cricket();

    }
}
