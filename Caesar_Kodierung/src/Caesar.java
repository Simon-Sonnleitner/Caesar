public class Caesar
{
    Caesar()
    {
    }



    public void Verschluesseln(String Text, int Verschiebung)
    {
        for (int i = 0; i < Text.length(); i++)
        {
            int code = (int) Text.charAt(i);
            code = code + Verschiebung;
            char zeichen = (char) code;
            System.out.print(zeichen);
        }
        System.out.println();
    }

    public void Entschluesseln(String Text, int Verschiebung)
    {
        for (int i = 0; i < Text.length(); i++)
        {
            int code = (int) Text.charAt(i);
            code = code - Verschiebung;
            char zeichen = (char) code;
            System.out.print(zeichen);
        }
        System.out.println();
    }
    public void VerschiebeBuchstabe(char Char, int Abstand)
    {
        int code = (int) Char;
        code = code - Abstand;
        char zeichen = (char) code;
        System.out.print(zeichen);
    }
    public void VerschiebeSatz(int Abstand, String Satz) {
        for (int i = 0; i < Satz.length(); i++) {
            int code = (int) Satz.charAt(i);
            code = code - Abstand;
            char zeichen = (char) code;
            System.out.print(zeichen);
        }
        System.out.println();
    }
}
