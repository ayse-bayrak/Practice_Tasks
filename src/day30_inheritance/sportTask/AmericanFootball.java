package day30_inheritance.sportTask;

public class AmericanFootball extends Sport {

    private boolean hasCourt;

    public AmericanFootball(String name, int numberOfPlayers, int numberOfReferre, String rules, boolean hasCourt) {
        super(name, numberOfPlayers, numberOfReferre, rules);
        setHasCourt(hasCourt);
    }

    public boolean isHasCourt() {
        return hasCourt;
    }

    public void setHasCourt(boolean hasCourt) {
        this.hasCourt = hasCourt;
    }
}
