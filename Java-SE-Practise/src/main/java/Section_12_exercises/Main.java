package Section_12_exercises;

/*
    Exercise 50 Section 12 - Adventure game
*/

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public Main() {
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
    }

    public void command() {
        Scanner in = new Scanner(System.in);
        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("NORTH", "N");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("QUIT", "Q");

        vocabulary.put("N", "N");
        vocabulary.put("E", "E");
        vocabulary.put("W", "W");
        vocabulary.put("S", "S");
        vocabulary.put("Q", "Q");
        int currentLocation = 1;
        while(true){
            System.out.println(locations.get(currentLocation).getDescription());
            if(currentLocation == 0){
                break;
            }
            System.out.println("\n Available exits are :" + locations.get(currentLocation).getExits());
            String userInput = in.nextLine().toUpperCase();
            String userCommand = "";
            for (String key:
                    vocabulary.keySet()) {
                if(userInput.contains(key)){
                    userCommand = vocabulary.get(key);
                }
            }
            if(locations.get(currentLocation).getExits().containsKey(userCommand)){
                currentLocation = locations.get(currentLocation).getExits().get(userCommand);
            }
            else{
                System.out.println("You cannot go in that direction!!!");
            }

        }
    }

    public static void main(String[] args) {
        Main start = new Main();
        start.command();
    }
}
