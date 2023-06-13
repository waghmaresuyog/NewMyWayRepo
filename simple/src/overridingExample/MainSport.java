package overridingExample;

public class MainSport {

    public static void main(String[] args) {

        Sport sport = new Sport();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Cricket cricket = new Cricket();
        sport.play();
        football.play();
        basketball.play();
        cricket.play();
    }
}