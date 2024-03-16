package day30_inheritance.sportTask;

public class Baseball extends Sport {
    private boolean hasBall;

    public Baseball(String name, int numberOfPlayers, int numberOfReferre, String rules, boolean hasBall) {
        super(name, numberOfPlayers, numberOfReferre, rules);
        setHasBall(hasBall);
    }

    public boolean isHasBall() {
        return hasBall;
    }

    public void setHasBall(boolean hasBall) {
        this.hasBall = hasBall;
    }


}
