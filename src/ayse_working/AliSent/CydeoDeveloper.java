package ayse_working.AliSent;

public class CydeoDeveloper {
    public String firstName, lastName, state, city, group;

    public void setInfo(String firstName, String lastName, String state, String city, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.city = city;
        this.group = group;
    }

    public String toString() {
        return "CydeoDeveloper: " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", group='" + group + '\'';
    }

    public void recordFlipgrid(boolean isRecord) {
        if (isRecord) {
            System.out.println(firstName + " " + lastName + " from " + group + " is recording his/her flipgrid answer.");
        } else {
            System.err.println(firstName + " " + lastName + " from " + group + " is NOT recording his/her flipgrid answer.");
        }
    }

    public void attendingLiveSession(boolean isAttend) {
        if (isAttend) {
            System.out.println(firstName + " " + lastName + " from " + group + " is attending live session.");
        } else {
            System.err.println(firstName + " " + lastName + " from " + group + " is NOT attending live session.");
        }
    }

    public void takingQuiz(boolean takeQuiz) {
        if (takeQuiz) {
            System.out.println(firstName + " " + lastName + " from " + group + " is taking Quiz.");
        } else {
            System.err.println(firstName + " " + lastName + " from " + group + " is NOT taking Quiz.");
        }
    }

    public void attendingMentorMeeting(boolean mentorMeeting) {
        if (mentorMeeting) {
            System.out.println(firstName + " " + lastName + " from " + group + " is attending Mentor Meeting.");
        } else {
            System.err.println(firstName + " " + lastName + " from " + group + " is NOT attending Mentor Meeting.");
        }
    }

    public void doingGroupStudy(boolean groupStudy) {
        if (groupStudy) {
            System.out.println(firstName + " " + lastName + " from " + group + " is doing Group Study.");
        } else {
            System.err.println(firstName + " " + lastName + " from " + group + " is NOT doing Group Study.");
        }
    }

    public static void main(String[] args) {

        CydeoDeveloper student1 = new CydeoDeveloper();
        student1.setInfo("Ayse", "Gunes Bayrak", "Turkiye", "Ankara", "JD02");

        student1.recordFlipgrid(true);
        student1.attendingLiveSession(true);
        student1.takingQuiz(true);
        student1.attendingMentorMeeting(true);
        student1.doingGroupStudy(false);

    }
}
