package Section_12_exercises;

/*
    Exercise 52 Section 12 - Sets
 */
public class Planet extends HeavenlyBody{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody heavenlyBody) {
        if(heavenlyBody.getKey().getBodyType() == BodyType.MOON)
            return super.addSatellite(heavenlyBody);
        else
            return false;
    }
}
