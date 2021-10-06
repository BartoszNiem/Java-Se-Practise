package Section_9_exercises;

import java.util.ArrayList;
import java.util.List;

public class Monster_ex47 implements ISaveable_ex47 {
    private String name;
    private int hitPoints, strength;

    public Monster_ex47(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(String.valueOf(hitPoints));
        list.add(String.valueOf(strength));
        return list;
    }

    @Override
    public void read(List<String> list) {
        if(list != null && list.size() > 0){
            list.add(name);
            list.add(String.valueOf(hitPoints));
            list.add(String.valueOf(strength));
        }
    }
    @Override
    public String toString() {
        return String.format("Monster(name = %s, hitPoints = %d, strength = %d)", name, hitPoints, strength);
    }
}
