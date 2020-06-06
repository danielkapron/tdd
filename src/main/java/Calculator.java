public class Calculator {

    private int value = 0;

    public int add(int a, int b){
        value ++;
        return a + b;
    }

    public int subtraction(int a, int b){
        value ++;
        return a - b;
    }

    public int getValue(){
        return value;
    }

}
