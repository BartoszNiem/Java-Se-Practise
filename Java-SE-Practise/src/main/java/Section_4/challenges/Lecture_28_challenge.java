package Section_4.challenges;

public class Lecture_28_challenge {

    public void displayHighScorePosition(String name, int position){
        System.out.println(String.format("%s managed to get into position %d on the high score table", name, position));
    }
    public int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        }
        else if(score < 1000 && score >= 500){
            return 2;
        }
        else if(score < 500 && score >= 100){
            return 3;
        }
        return 4;
    }
    public static void main(String[] args) {
        Lecture_28_challenge test = new Lecture_28_challenge();
        test.displayHighScorePosition("Frank Kolba", 13);
        System.out.println(String.format("Score = %d, Position = %d", 1500, test.calculateHighScorePosition(1500)));
        System.out.println(String.format("Score = %d, Position = %d", 900, test.calculateHighScorePosition(900)));
        System.out.println(String.format("Score = %d, Position = %d", 400, test.calculateHighScorePosition(400)));
        System.out.println(String.format("Score = %d, Position = %d", 50, test.calculateHighScorePosition(50)));
    }
}
