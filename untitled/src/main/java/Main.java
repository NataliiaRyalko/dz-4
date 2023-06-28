public class Main {

    static public void main(String[] argv){
        PrintInt someVal = new PrintInt();
        someVal.printValue();
        System.out.println("~~~" + someVal.intValue() + "~~~");
    }
}
