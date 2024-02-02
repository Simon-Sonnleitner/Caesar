public class Main {
    public static void main(String[] args)
    {
        Caesar caesar = new Caesar();
        caesar.Verschluesseln("Hello World", 4);
        caesar.Entschluesseln("Lipps$[svph", 4);
    }
}