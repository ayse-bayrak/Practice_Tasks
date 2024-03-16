package ozzy_e_commerce_lab;

public class Address {

        private String streetNumber; // constructor is initializing for us
        private String streetName;
        private String additioanalLine;
        private String zipCode;
        private String state;
        // if there's no Constructor what I need to do create object and set object that streetname=objectname.streetname


    public Address() {
    }

    public Address(String streetNumber, String streetName, String additioanlLine, String zipCode, String state) {
            this.streetNumber = streetNumber;
            this.streetName = streetName;
            this.additioanalLine = additioanlLine;
            this.zipCode = zipCode;
            this.state = state;
        }// if I call this Constructor I can set the things
        //I am setting everything through constructor
        // what if I whant to retrieve something, I should maybe able to access to directly
        // if there's no any certain rule certain condition, I need to set each value here in certain logic.
        // these are everything based on your needs, please look at it, whatever you need created, please just know what we are buliding in your code
// what is the definition of Constructor?
        // Constructor is used to create an object and set to value
        // initialize the instance variables
        // we want to initialize all these instance variables in the Constructor. That is the constructor purpose
        // whatever you needed add it, do not just put random or something

        // to certain something, how I'm gonna retrieve it, I can create the getters.

        public String getStreetNumber() {
            return streetNumber;
        }

        public String getStreetName() {
            return streetName;
        }

        public String getAdditioanalLine() {
            return additioanalLine;
        }

        public String getZipCode() {
            return zipCode;
        }

        public String getState() {
            return state;
        }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", additioanalLine='" + additioanalLine + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
