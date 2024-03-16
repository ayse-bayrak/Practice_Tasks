package day18_java_memory_allocation;

public class Contact {
    public String name, phoneNumber, email ;

    public void setInfo(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void call(){
        System.out.println("Calling " + name + " now");
    }

    public void sendMessage() {
        System.out.println("Sending a message to "+ phoneNumber+" now");
    }

    public void sendEmail() {
        System.out.println("Sending email to "+ email+ " now");
    }
//for test Contact objects, I create main method in the same class


    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Contact name1 = new Contact();
        name1.setInfo("Ayse","053332197238", "aysegunes.bayrak82@gmail.com");

        name1.call();
        name1.sendEmail();
        name1.sendMessage();

        Contact name2 = new Contact();
        name2.setInfo("Ziya", "05306647212", "ziyabayrak@gmail.com");

        name2.call();
        name2.sendEmail();
        name2.sendMessage();

        System.out.println(name1.toString());
        System.out.println(name2.toString());

    }
}


/*
2. Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending a message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"
 */