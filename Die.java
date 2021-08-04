import java.util.Random;

/**
The Die class simulates a six-sided die.
*/

public class Die
{
    private int sides; // number of sides
    private int value; // the die's value

    /**
    The constructor performs an initial
    roll of the die
    @param numSides the number of sides for this die
    */

    public Die(int numSides)
    {
        sides = numSides;
        roll();
    }

    public void roll()
    {
        // Create a Random object
        Random rand = new Random();

        // Get a random value for the die
        value = rand.nextInt(sides) + 1;
    }

    /**
    getSides method
    @return The number of sides for this die.
    */

    public int getSides()
    {
        return sides;
    }

    /**
    getValue method
    @return The value of the die
    */

    public int getValue()
    {
        return value;
    }
}
