package day26_static.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;
    public int numberOfStars;
    public ArrayList<Server> Servers;
    public ArrayList<Chef> Chefs;

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        Servers = new ArrayList<>();
        Chefs = new ArrayList<>();
    }

    public void hireServer(Server server) {//accepts a server object and adds it to the Servers ArrayList
        Servers.add(server);
    }

    public void hireServer(Server [] servers) { //accepts an array of Server objects and adds all of them to the Servers ArrayList
        this.Servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef) {//accepts a chef object and adds it to the Chefs ArrayList
        Chefs.add(chef);
    }

    public void hireChef(Chef [] chefs) { //accepts an array of Chef objects and adds all of them to the Chef ArrayList
        this.Chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID) {//removes the chef with the matching ID from the ArrayList of chef
        Chefs.removeIf(p-> p.employeeID==employeeID);
    }

    public void terminateServer(int employeeID) {//removes the server with the matching ID from the ArrayList of the server
        Servers.removeIf(p-> p.employeeID==employeeID);
    }

    public String toString() {//Return (String) all the information on a Restaurant object.
        // No need to print the whole list of Servers or Chefs.

        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of servers=" + Servers.size() +
                ", number of chefs=" + Chefs.size() +
                '}';
    }
}
/*
4.3 Create a class called Restaurant

	            Attributes:
	                Owner (String), Location (String), numberOfStars (int)
	                Servers (ArrayList of Server objects)
	                Chefs (ArrayList of Chef objects)

                Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)

	                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
	                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

	                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList

	                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

	                terminateChef(int employeeID): removes the chef with the matching ID from the ArrayList of chef

	                terminateServer(int employeeID) removes the server with the matching ID from the ArrayList of the server

	                toString(): Return (String) all the information on a Restaurant object. No need to print the whole list of Servers or Chefs.
	                Print the number of Servers and Chefs alongside the other information.
 */