package Switch;

/**
 SWITCH TEST & TERNARY OPERATOR
 */
public class SwitchTest {
    public static void main(String[] args) {
        int a = (int) ((Math.random()* 10));
        int b = 6;
        String beMoreThenFive = (a>5)? "It's our luck" : "Today is not our day";
        switch (a){
            case 0:
                System.out.println("Random gave num < 0.1");
                break;
            case 1:
                System.out.println("Random gave num < 0.2");
                break;
            case 2:
                System.out.println("Random gave num < 0.3");
                break;
            case 3:
                System.out.println("Random gave num < 0.4");
                break;
            case 4:
                System.out.println("Random gave num < 0.5");
                break;
            case 5:
                System.out.println("Random gave num < 0.6");
                break;
            case 6:
                System.out.println("Random gave num < 0.7");
                break;
            case 7:
                System.out.println("Random gave num < 0.8");
                break;
            case 8:
                System.out.println("Random gave num < 0.9");
                break;
            case 9:
                System.out.println("as expected Random gave num < 1");
                System.out.println(beMoreThenFive);
        }
    }
}
