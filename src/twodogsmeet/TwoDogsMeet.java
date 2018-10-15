/*
 * TwoDogsMeet From The Learnin Mangement Systems
 * Made By: Corbin Nash
 * Based on DogTester.Java Made By ???
 */
package twodogsmeet;
import javax.swing.*;
/**
 *
 * @author conas1290
 */
public class TwoDogsMeet {
    public static void main(String[] args) {
 // We make 4 strings and make the user give them there values
    String userDog1Name, userDog2Name, userDog1Breed, userDog2Breed, Dog1Aggression, Dog2Aggression;     
     //first dog
    userDog1Name = JOptionPane.showInputDialog("Enter a name of a dog");
    userDog1Breed = JOptionPane.showInputDialog("Enter a breed of a dog");
    //second dog
    userDog2Name = JOptionPane.showInputDialog("Enter a name of a second dog");
    userDog2Breed = JOptionPane.showInputDialog("Enter a breed of a second dog");   
    //assign to dog 
    Dog dog1 = new Dog(userDog1Name, userDog1Breed);
    Dog dog2 = new Dog(userDog2Name, userDog2Breed);
    //we ask the user if they like the aggressiveness of dog 1
    int userAnswer = Integer.parseInt(JOptionPane.showInputDialog("The aggression of dog "+ userDog1Name + " is "+ dog1.getAggression() + "\n" + "1 for Yes, 0 for No"));
    /*
    *  If statement based on users respones     
    *  if (userAnswer == 1) Allows user to change the aggression of dog 1
    *  else if(userAnswer == 0) Do nothing but is still a valid input
    *  else tell the user they messed up
    */        
    if (userAnswer == 1){
    int aggression = Integer.parseInt(JOptionPane.showInputDialog("Enter the new aggression of  " + userDog1Name));
    dog1.setAggression(aggression);
    }
    else if(userAnswer == 0){}
    else {
    JOptionPane.showMessageDialog(null, "Invalid Output");}
    
    //Same code as above but for the aggression of dog 2
    int userAnswer2 = Integer.parseInt(JOptionPane.showInputDialog("The aggression of dog "+ userDog2Name + " is "+ dog2.getAggression() + "\n" + "1 for Yes, 0 for No"));
    if (userAnswer2 == 1){
    int aggression = Integer.parseInt(JOptionPane.showInputDialog("Enter the new aggression of  " + userDog2Name));
    dog1.setAggression(aggression);
    }
    else if(userAnswer2 == 0){}
    else{
    JOptionPane.showMessageDialog(null, "Invalid Output");}
    
    //Same code as above but for the hunger of dog 1
    int userAnswer3 = Integer.parseInt(JOptionPane.showInputDialog("The hunger of dog "+ userDog1Name + " is "+ dog1.getHunger() + "\n" + "1 for Yes, 0 for No"));
    if (userAnswer3 == 1){
    int hunger = Integer.parseInt(JOptionPane.showInputDialog("Enter the new hunger of  " + userDog1Name));
    dog1.setHunger(hunger);
    }
    else if(userAnswer3 == 0){}
    else{
    JOptionPane.showMessageDialog(null, "Invalid Output");}

    //Same code as above but for the hunger of dog 2
    int userAnswer4 = Integer.parseInt(JOptionPane.showInputDialog("The hunger of dog "+ userDog2Name + " is "+ dog2.getHunger() + "\n" + "1 for Yes, 0 for No"));
    if (userAnswer4 == 1){
    int hunger = Integer.parseInt(JOptionPane.showInputDialog("Enter the new hunger of  " + userDog2Name));
    dog2.setHunger(hunger);
    }
    else if(userAnswer4 == 0){}
    else{
    JOptionPane.showMessageDialog(null, "Invalid Output");}

    int dog1Hunger = dog1.getHunger();
    int dog2Hunger = dog2.getHunger();
    int dog1Aggression = dog1.getAggression();
    int dog2Aggression = dog2.getAggression();   
    
   
 }   
}
