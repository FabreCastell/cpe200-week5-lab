package cpe200;


public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    double sum=0,first=0,second=0;

    public BinaryCalculator() {
        firstOperand = new Operand(0);
        secondOperand= new Operand(0);

    }

    public void setFirstOperand(Operand operand) {
        first = new Double(operand.getOperand());

    }


    public void setSecondOperand(Operand operand) {
        second = new Double(operand.getOperand());

    }

    public String add() throws RuntimeException {
        if (first < 0 || second < 0){
            throw new RuntimeException("Negative number");
        }
        sum = (first+second);
        String sums =  Double.toString(sum);
        return sums = sums.indexOf(".") < 0 ? sums : sums.replaceAll("0*$", "").replaceAll("\\.$", "");

    }

    public String subtract() throws RuntimeException {
        if (first < 0 || second < 0){
            throw new RuntimeException("Negative number");
        }
        sum=(first-second);
        String sums =  Double.toString(sum);
        sums = String.format("%.5f", sum);
        return sums = sums.indexOf(".") < 0 ? sums : sums.replaceAll("0*$", "").replaceAll("\\.$", "");

    }

    public String multiply() throws RuntimeException {
        if (first < 0 || second < 0){
            throw new RuntimeException("Negative number");
        }
        sum=(first*second);
        String sums =  Double.toString(sum);
        return sums = sums.indexOf(".") < 0 ? sums : sums.replaceAll("0*$", "").replaceAll("\\.$", "");

    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (second==0)
        {
            throw new ArithmeticException("divide by zero");
        }
        if (first < 0 || second < 0){
            throw new RuntimeException("Negative number");
        }

        sum=(first/second);
        String sums =  Double.toString(sum);
        sums = String.format("%.5f", sum);
        return sums = sums.indexOf(".") < 0 ? sums : sums.replaceAll("0*$", "").replaceAll("\\.$", "");

    }

    public String power() throws RuntimeException {
        if (first < 0 || second < 0){
            throw new RuntimeException("Negative number");
        }
        sum = 1 ;
        for (int i = 1; i <= second; i++) {
            sum = sum*first;
        }
        String sums =  Double.toString(sum);
        return sums = sums.indexOf(".") < 0 ? sums : sums.replaceAll("0*$", "").replaceAll("\\.$", "");

    }

    public Operand getFirstOperand() {

        return firstOperand;
    }

    public Operand getSecondOperand() {

        return secondOperand;
    }
}
