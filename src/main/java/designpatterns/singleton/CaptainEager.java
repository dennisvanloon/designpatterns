package designpatterns.singleton;

final class CaptainEager
{
    //Early initialization
    private static final CaptainEager captain = new CaptainEager();

    //We make the constructor private to prevent the use of "new"
    private CaptainEager() {
        System.out.println("A captain is elected for your team.");
    }

    /* Global point of access.The method getCaptain() is a public static method*/
    public static CaptainEager getCaptain() {
        System.out.println("You have a captain for your team.");
        return captain;
    }
}