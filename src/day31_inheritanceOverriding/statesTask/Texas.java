package day31_inheritanceOverriding.statesTask;

public class Texas extends States{
    public Texas(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, "TX", politicalParty, governor, senator, population, stateTax);
    }
}
