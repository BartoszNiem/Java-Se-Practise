package Section_9_exercises;

import java.util.ArrayList;
import java.util.List;

public class PLayer_ex47 implements ISaveable_ex47 {
    private String name, weapon;
    private int hitPoints, strength;

    public PLayer_ex47(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(String.valueOf(hitPoints));
        list.add(String.valueOf(strength));
        list.add(weapon);
        return list;
    }

    @Override
    public void read(List<String> list) {
        if(list != null && list.size() > 0){
            list.add(name);
            list.add(String.valueOf(hitPoints));
            list.add(String.valueOf(strength));
            list.add(weapon);
        }
    }

    @Override
    public String toString() {
        return String.format("PLayer(name = %s, hitPoints = %d, strength = %d, weapon = %s)", name, hitPoints, strength, weapon);
    }
}
