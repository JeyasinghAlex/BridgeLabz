import java.util.Scanner;

public class Controller {

    private static StopWatch watch = new StopWatch();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("----------StopWatch Controller :-----------\n");
        start();
        System.out.println("Time is :" + watch.elapsedTime());
    }

    private static void start() {
        System.out.println("1) Start :\n OtherWise Exit :");

        if (exceptionHandler() == 1) {
            watch.start();
        } else {
            System.exit(0);
        }
    }

    private static void stop() {
        System.out.println("1) Stop :\n OtherWise Exit :");
        if (exceptionHandler() == 1) {
            stop();
        } else {
            System.exit(0);
        }
    }

    private static int exceptionHandler() {
        try{
            return scan.nextInt();
        }catch (Exception ex){
            System.out.println("Type of Exception - " + ex);
        }
        return 0;
    }
}
