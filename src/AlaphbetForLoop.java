public class AlaphbetForLoop {
    public static void main(String[] args)
    {
        for (int i=65; i<=90; i++)
            System.out.printf("%s%s", (char)i, (i<90)?",":"");
    }
}
