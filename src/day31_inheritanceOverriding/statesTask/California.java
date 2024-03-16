package day31_inheritanceOverriding.statesTask;

public class California extends States{
    public California(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, "CA", politicalParty, governor, senator, population, stateTax);
    }
}
