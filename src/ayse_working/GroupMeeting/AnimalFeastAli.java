package ayse_working.GroupMeeting;

public class AnimalFeastAli {
    public static void main(String[] args) {
        // Example usage:
        System.out.println(canBringDish("great blue heron", "garlic naan"));  // Should return true
        System.out.println(canBringDish("chickadee", "chocolate cake"));       // Should return true
        System.out.println(canBringDish("lion", "lasagna"));                   // Should return false
    }

    public static boolean canBringDish(String beast, String dish) {
        // Check if the dish starts and ends with the same letters as the animal's name
        return dish.charAt(0) == beast.charAt(0) && dish.charAt(dish.length() - 1) == beast.charAt(beast.length() - 1);
    }

}
