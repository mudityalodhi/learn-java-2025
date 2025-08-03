interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Guitar...");
    }
}

class Piano implements Playable {

    @Override
    public void play() {
        System.out.println("Playing the Piano...");
    }

}

public class Main {

    public static void main(String[] args) {
        Playable piano = new Piano();
        Playable guitar = new Guitar();

        piano.play();
        guitar.play();
    }
}
