public class Feeder {

    /**
     * The amount of food, in grams, currently in the bird feeder; initialized
     * in the constructor and always greater than or equal to zero
     */
    private int currentFood;

    /**
     * Simulates one day with numBirds birds or possibly a bear at the bird
     * feeder, as described in part (a) Precondition: numBirds > 0
     */
    public void simulateOneDay(int numBirds)
    {
        int bird = (int) (Math.random() * 100 + 1);
        if (bird > 5){
            int grams = (int)(Math.random() * 50 + 10 );
            int eaten = grams * numBirds;
            currentFood = currentFood- eaten;
        
        }
        if (bird <= 5){
            currentFood = 0;
            
        }
    }

    /**
     * Returns the number of days birds or a bear found food to eat at the
     * feeder in this simulation, as described in part (b) Preconditions:
     * numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays) 
    {
        return 0;
    }
    public int getCurrentFood()
    {
        return currentFood;
    }
    public Feeder(int c)
    {
        currentFood = c;
    }
    public Feeder() {}

}