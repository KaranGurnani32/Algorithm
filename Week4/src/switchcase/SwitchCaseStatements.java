package switchcase;

public class SwitchCaseStatements {

    public static void main(String[] args) {
        int dayOfWeek = 2;

        switch (dayOfWeek){
            case 1: case 2:
                System.out.println("On leave");
                break;
//            case 2:
//                System.out.println("In office");
//                break;
            case 3:
                System.out.println("Play Football");
                break;
            default:
                System.out.println("Don't know what it is");
        }

    }

}
