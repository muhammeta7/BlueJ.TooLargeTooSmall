
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }

    public Integer guess(Integer g) {
        Integer result = 0;
        if (chosenNum > g){
          result = -1;
        }
        else if (chosenNum < g) {
          result = 1;
        }
        else {
          result = 0;
        }
        return result;
    }
}
