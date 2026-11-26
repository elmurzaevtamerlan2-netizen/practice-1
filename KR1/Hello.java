import java.io.PrintStream;

public final class Hello {
    public static void printHelloWorld(PrintStream output) {
        HelloImpl.print(output);
    }
}
