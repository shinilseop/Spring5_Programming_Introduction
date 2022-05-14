package chap07.main;

import chap07.ExeTimeCalculator;
import chap07.ImpeCalculator;
import chap07.RecCalculator;

public class Main {
    public static void main(String[] args) {
        ImpeCalculator cal1 = new ImpeCalculator();
        RecCalculator cal2 = new RecCalculator();

        cal1.factorial(10);
        cal2.factorial(10);

        ImpeCalculator impeCalculator = new ImpeCalculator();
        ExeTimeCalculator cal3 = new ExeTimeCalculator(impeCalculator);
        cal3.factorial(10);
    }
}
