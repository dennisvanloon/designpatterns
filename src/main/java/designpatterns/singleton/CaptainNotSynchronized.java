package designpatterns.singleton;

final class CaptainNotSynchronized {

    private static CaptainNotSynchronized captain;

    //We make the constructor private to prevent the use of "new"
    private CaptainNotSynchronized() {
    }

    public static CaptainNotSynchronized getCaptain() {
        if (captain == null) {
            captain = new CaptainNotSynchronized();
            System.out.println("New captain is elected for your team.");
        }
        return captain;
    }
}