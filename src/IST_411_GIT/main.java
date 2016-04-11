/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IST_411_GIT;


/**
 *
 * @author Steven
 */
public class main {
    public static void main(String[] args) {
        //get_restaurants();
        get_restaurants_with_criteria();
    }
    
    public static void get_restaurants(){
        String restaurant_result = FUNCTIONS.INTERFACE_REQUEST("1000");
        String[] restaurants = restaurant_result.split("\\|\\|");
        for(int restaurant_counter = 0; restaurant_counter < restaurants.length; restaurant_counter++){
            String[] restaurant_information = restaurants[restaurant_counter].split("\\|");
            System.out.println("ID: " + restaurant_information[0]);
            System.out.println("Name: " + restaurant_information[1]);
            System.out.println("Phone Number: " + restaurant_information[2]);
            System.out.println("");
        }
    }
    
    public static void get_restaurants_with_criteria(){
        String restaurant_result = FUNCTIONS.INTERFACE_REQUEST("1100", "search_criteria", "Restaurant_Name='Subway' AND Phone='1112223333'");
        String[] restaurants = restaurant_result.split("\\|\\|");
        for(int restaurant_counter = 0; restaurant_counter < restaurants.length; restaurant_counter++){
            String[] restaurant_information = restaurants[restaurant_counter].split("\\|");
            System.out.println("ID: " + restaurant_information[0]);
            System.out.println("Name: " + restaurant_information[1]);
            System.out.println("Phone Number: " + restaurant_information[2]);
            System.out.println("");
        }
    }
}
