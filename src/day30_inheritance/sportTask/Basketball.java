package day30_inheritance.sportTask;

public class Basketball extends Sport{

    private int ballNumber;
    private boolean needCourt;

    public Basketball(String name, int numberOfPlayers, int numberOfReferre, String rules, int ballNumber, boolean needCourt) {
        super(name, numberOfPlayers, numberOfReferre, rules);
        setBallNumber(ballNumber);
        setNeedCourt(needCourt);
    }

    public int getBallNumber() {
        return ballNumber;
    }

    public void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public boolean isNeedCourt() {
        return needCourt;
    }

    public void setNeedCourt(boolean needCourt) {
        this.needCourt = needCourt;
    }

}
