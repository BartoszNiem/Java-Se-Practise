package Section_12_exercises;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
    Exercise 52 Section 12 - Sets
 */
public abstract  class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }
    public boolean addSatellite(HeavenlyBody heavenlyBody){
        if(satellites.add(heavenlyBody))
            return true;
        else
            return false;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavenlyBody that = (HeavenlyBody) o;
        return key.equals(that.key);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(key);
    }
    public static Key makeKey(String name, BodyType bodyType){
        return new Key(name, bodyType);
    }

    @Override
    public String toString() {
        return key.toString() + ", " + orbitalPeriod;
    }

    public static final class Key {
        private String name;
        private BodyType bodyType;

        private Key(String name, BodyType bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyType getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return name.equals(key.name) && bodyType == key.bodyType;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, bodyType);
        }

        @Override
        public String toString() {
            return String.format("%s: %s", name, bodyType);
        }
    }
    public enum BodyType {
        PLANET,
        DWARF_PLANET,
        MOON;
    }

    public static void main(String[] args) {
        HeavenlyBody planet = new Planet("Jupiter", 105_183.753);
        HeavenlyBody dwarfPlanet = new DwarfPlanet("Pluto", 2_173_921.57);
        HeavenlyBody moon = new Moon("Europa", 85);
        System.out.println("Adding Europe as Jupiter's satellite: " + planet.addSatellite(moon));
        System.out.println("Adding Pluto as Jupiter's satellite: " + planet.addSatellite(dwarfPlanet));
        System.out.println(planet.getSatellites());
        System.out.println(dwarfPlanet);
    }
}

