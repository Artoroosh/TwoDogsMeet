/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twodogsmeet;
/**
 *
 * @author conas1290
 */
public class Dog {
  //variables for characteristics

  private String dogName, dogBreed;
  private int aggression, hunger;

  //constructors
  public Dog() {
    dogName = "Rufus Doe";
    dogBreed = "Unknown Breed";
    aggression = 0;
    hunger = 0;
  }

  public Dog(String dgName, String dgBreed, int agg, int hung) {
    dogName = dgName;
    dogBreed = dgBreed;
    aggression = agg;
    hunger = hung;
  }

  //Alternate constructor
  public Dog(String dgName, String dgBreed) {
    //This constructor only uses the name and breed
    //Set the aggression and hunger to random #s

    dogName = dgName;
    dogBreed = dgBreed;
    aggression = (int) (Math.random() * 10) + 1;
    hunger = (int) (Math.random() * 10) + 1;
  }
 
   public String getName() {
    return dogName;
  }
  public void setName(String dgName){
    dogName = dgName;
  }
  public String getBreed() {
    return dogBreed;
  }
  public void setBreed(String dgBreed){
    dogBreed = dgBreed;
  }
  public int getAggression() {
    return aggression;
  }
  public void setAggression(int dogAgg){
    aggression = dogAgg;
  }
  public int getHunger() {
    return hunger;
  }
  public void setHunger(int dogHung){
    hunger = dogHung;
  }
//method to display all info of the Dog
  public String toString() {
    String output = "Aggression: " + aggression + "\n";
    output += "Hunger: " + hunger;
    //output string is complete, return it
    return output;
  }
}