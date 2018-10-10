/*
 * TwoDogsMeet From The Learnin Mangement Systems
 * Made By: Corbin Nash
 * Based on DogTester.Java Made By ???
 */
package twodogsmeet;
import javax.swing.JOptionPane;
/**
 *
 * @author conas1290
 */
public class TwoDogsMeet {
    public static void main(String[] args) {
 // We make 4 strings and make the user give them there values
    String userDog1Name, userDog2Name, userDog1Breed, userDog2Breed, Dog1Aggression, Dog2Aggression;     
    userDog1Name = JOptionPane.showInputDialog("Enter a name of a dog");
    userDog2Name = JOptionPane.showInputDialog("Enter a name of a second dog");
    userDog1Breed = JOptionPane.showInputDialog("Enter a breed of a dog");
    userDog2Breed = JOptionPane.showInputDialog("Enter a breed of a second dog");   
  //assign to dog 
    Dog dog1 = new Dog(userDog1Name, userDog1Breed);
    Dog dog2 = new Dog(userDog2Name, userDog2Breed);

   
    Dog1Aggression = JOptionPane.showInputDialog("Enter a name of a dog");
    
   int Dog1AggressionInt = Integer.parseInt(Dog1Aggression); 
   
//Print the details of each dog
//    System.out.println(dog1.toString());
//    System.out.println("--------------------------");
//
//    System.out.println(dog2.toString());
//    System.out.println("--------------------------");

  
    
    }   
}
