import java.util.Scanner;

public class VendingMachine {
    private int numberOfCans;
    private int numberOfTokens;

    public VendingMachine() {
    }

    public VendingMachine(int initialNumberOfCans) {
        numberOfCans = initialNumberOfCans;
        numberOfTokens = 0;
    }

    public void addCans(int numberOfNewCans) {
        numberOfCans+=numberOfNewCans;
    }

    public void takeCan() {
        if(numberOfCans>0){
            numberOfCans--;
            numberOfTokens++;
        }
    }

    public void takeTokens() {
        numberOfTokens=0;
    }

    public int getNumberOfCans() {
        return this.numberOfCans;
    }

    public int getNumberOfTokens() {
        return this.numberOfTokens;
    }
}