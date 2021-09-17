package Section_4.challenges;

public class Text_Seconds_And_Minutes_Challenge {

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid Value";
        }
        String result = "";
        int hours = (int) Math.floor(minutes / 60);
        int remainingMinutes = (minutes % 60);

        if(hours <10 && remainingMinutes < 10 && seconds < 10){
            result = String.format("0%dh 0%dm 0%ds", hours, remainingMinutes, seconds);
        }
        else if(hours <10 && remainingMinutes < 10 && seconds >= 10){
            result = String.format("0%dh 0%dm %ds", hours, remainingMinutes, seconds);
        }
        else if(hours >=10 && remainingMinutes < 10 && seconds >= 10){
            result = String.format("%dh 0%dm %ds", hours, remainingMinutes, seconds);
        }
        else if(hours <10 && remainingMinutes >= 10 && seconds >= 10){
            result = String.format("0%dh %dm %ds", hours, remainingMinutes, seconds);
        }
        else if(hours <10 && remainingMinutes >= 10 && seconds < 10){
            result = String.format("0%dh %dm 0%ds", hours, remainingMinutes, seconds);
        }
        else if(hours >= 10 && remainingMinutes < 10 && seconds < 10){
            result = String.format("%dh 0%dm 0%ds", hours, remainingMinutes, seconds);
        }
        else if(hours >=10 && remainingMinutes < 10 && seconds >= 10){
            result = String.format("%dh 0%dm %ds", hours, remainingMinutes, seconds);
        }
        else if(hours >= 10 && remainingMinutes >= 10 && seconds < 10){
            result = String.format("%dh %dm 0%ds", hours, remainingMinutes, seconds);
        }
        else{
            result = String.format("%dh %dm %ds", hours, remainingMinutes, seconds);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Text_Seconds_And_Minutes_Challenge.getDurationString(1240,13));
    }
}
