package day31_inheritanceOverriding.statesTask;

public class Virginia extends States{


    public Virginia(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, "VA", politicalParty, governor, senator, population, stateTax);
    }

}
