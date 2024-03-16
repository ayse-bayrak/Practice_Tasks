package day30_inheritance.sportTask;

public class Football extends Sport {

    private boolean hasCourt;

    public Football(String name, int numberOfPlayers, int numberOfReferre, String rules, boolean hasCourt) {
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
