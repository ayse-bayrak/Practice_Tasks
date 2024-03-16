package day31_inheritanceOverriding.statesTask;

public class States {
    private String name, abbreviation, politicalParty, governor, senator;
    private int population;
    private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null||name.isBlank()||name.isBlank()) {
            System.err.println(name + " invalid data, name can not be null/empty/blank");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation==null || abbreviation.isEmpty() || abbreviation.isBlank()) {
            System.err.println(abbreviation + " invalid data, abbreviation can not be null/empty/blank");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty==null || politicalParty.isBlank() ||politicalParty.isEmpty()) {
            System.err.println(politicalParty + " invalid data, politicalParty can not be null/empty/blank");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if  (governor== null ||governor.isEmpty()||governor.isBlank()) {
            System.err.println(governor + " invalid data, governor can not be null/empty/blank");
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if ( senator== null ||senator.isBlank()||senator.isEmpty()) {
            System.err.println(senator + " invalid data, senator can not be null/empty/blank");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0 ) {
            System.err.println(population + " invalid data, population can not be zero or negative");
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax < 0 ) {
            System.err.println(stateTax + " invalid data, stateTax can not be negative");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
/*
statesTask:
    1. Create a class named States:
            variables:
                name, abbreviation, politicalParty, Governor, senator, population, stateTax

            Encapsulate all the fields

            Add a constructor that can set all the fields

                        Conditions:
                            1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            2. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            3. taxRate can not be negative
                            4. Population can not be zero or negative

            Methods:
                toString()

    2. Create the following subclasses of States and add any additional fields and methods if necessary:
                1. Virginia
                2. California
                3. Texas
                4. Florida


    3. Create a class named StateObjects
                    Create the objects of each sub-class

                    test all the functions of each object

                    Analyze the relationships between the classes
 */