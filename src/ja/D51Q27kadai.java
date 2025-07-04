package ja;

enum Signal {
    赤, 黄, 青;
}

public class D51Q27kadai {
    public static void main(String[] args) {
        Signal sig = Signal.青;

        if (sig == Signal.赤) {
            System.out.println("赤");
        } else if (sig == Signal.黄) {
            System.out.println("黄");
        } else {
            System.out.println("青");
        }
    }
}
