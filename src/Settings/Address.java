package Settings;

import java.util.ArrayList;

public class Address {

    private static ArrayList<String> cityList = new ArrayList<>();
    /*
         Create three  instance variables
         private  String
         Address1
         City
         ZipCode
      */
    private String Address1, City, ZipCode;

    public void SetCity() {

        cityList.add("New York");
        cityList.add("New Jersey");
        cityList.add("Ohio");
        cityList.add("Pennsylvania");
        cityList.add("Washington");
        cityList.add("Atlanta");
    }




    /*
    Create a method name is Address1
    Return type is String
    Parameter is String(myAddress)

    private Address1(which comes from class variable) equal to myAddress

     */

    public String Address1(String myAddress) {
        Address1 = myAddress;

        return Address1;
    }


    /*
        Create a method name is City
        return type is String
        parameter is String(myCity)

        if cityList does NOT contains myCity
        return We are not able to ship to your location

        if the first condition is false
        private City (which comes from class variable) equal to myCity

     */

    public String City(String myCity) {
        if (!cityList.contains(myCity)) {
            return "We are not able to ship to your location";
        } else {
            City = myCity;
        }
        return City;
    }


    /*
        Create a method name is ZipCode
        Return type is String
        Parameter is String(myZipcode)

        if myZipcode length is NOT 5
        return Zip code length should be 5

        If the first condition is false
        private ZipCode (which comes from class variable) equal to myZipcode

     */

    public String ZipCode(String myZipcode) {
        if (myZipcode.length() != 5) {
            return "Zip code length should be 5";
        } else {
            ZipCode = myZipcode;
        }
        return ZipCode;
    }


}
