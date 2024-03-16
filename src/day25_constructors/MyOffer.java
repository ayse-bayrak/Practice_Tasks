package day25_constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {

    public static void main(String[] args) {


        // Muhtar's Test
        /*
        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon Inc", "SDET", 110000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony Inc", "QA", 120000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);
         */
        //2.1

        Offer o1 = new Offer("Ankara", "TUBITAK", "Industrial Engineer", 90000, true, false, true, false );
        Offer o2 = new Offer("Istanbul", "HepsiBurada", "Test Engineer", 85000, true, true, false, true);
        Offer o3 = new Offer("Kayseri", "Alfapen", "Industrial Engineer", 75000, false, true, true, false );
        Offer o4 = new Offer("Istanbul", "Trendyol", "Test Engineer", 90000, true, false, true, true);
        Offer o5 = new Offer("Ankara", "Turkcell", "Java Developer", 100000, true, true, false, true);
        Offer o6 = new Offer("Sakarya", "Toyata", "Industrial Engineer", 75000, false, true, true, false );
        Offer o7 = new Offer("Kocaeli", "Nuh Cimento", "Test Engineer", 90000, true, false, true, true);

        //2.2
        Offer [] myOffers = { o1, o2, o3, o4, o5, o6, o7};

        //2.3

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);//// removes the offer if the offer is NOT fulltime
        System.out.println(fullTimeOffers);

        //2.4

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.equals("Ankara"));//// removes the offer if the offer is not from local area

        System.out.println(localOffers);

        //2.5
        System.out.println("==================offersWithBenefits================================");
        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));

        offersWithBenefits.removeIf( p-> !( p.hasBenefit && p.hasPTO )  );

        System.out.println(offersWithBenefits);

        //2.6
        System.out.println("==================devOffers================================");
        ArrayList<Offer> devOffers = new ArrayList<>(Arrays.asList(myOffers));

        devOffers.removeIf( p-> !(p.jobTitle.contains("Developer") )  );

        System.out.println(devOffers);

        //2.6
        System.out.println("==================Offer================================");
        ArrayList<Offer> Offer = new ArrayList<>(Arrays.asList(myOffers));

        Offer.removeIf( p-> (p.salary<100000 )  );

        System.out.println(Offer);
    }

    }

/*
Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offers named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that do not have the benefit and do not have PTO
            2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that do not contain developer in the jobTitle

            2.7 Create an ArrayList of Offer named offers with 100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K sala
 */