import java.util.Random;
 
public class TriangularRandomPattern {
 
    public static void main(String[] args) {
        // Declare variables and constants
        int terms = 10, minValue = 1, maxValue = 10, randomNumber;
        
        // Instantiate --> Create Random class
        Random rand = new Random();
        
        // Generate random number within a range from 1 to 10
        randomNumber = rand.nextInt(maxValue - minValue) + minValue;
        
        // Display outcome message
        System.out.println("\tPatterns Starting at " + (randomNumber +1) + "  :");
                
        for(int i = 1; i <= terms; i++){
            randomNumber = randomNumber + i;
            System.out.print(randomNumber + ", ");
        }
    }
    
}
