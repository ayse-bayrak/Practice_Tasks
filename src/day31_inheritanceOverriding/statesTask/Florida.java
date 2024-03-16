package day31_inheritanceOverriding.statesTask;

public class Florida extends States{
    public Florida(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, "FL" , politicalParty, governor, senator, population, stateTax);
    }
}
