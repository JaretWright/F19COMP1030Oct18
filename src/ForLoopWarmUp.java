public class ForLoopWarmUp {
    public static void main(String[] args)
    {
        for (int i=1; i<=26; i++)
        {
            System.out.printf("%d",i);

            if (i<26)
                System.out.printf(",");
        }

        System.out.printf("%n%n");
        displayIn2Lines();
    }

    public static void displayIn2Lines()
    {
        for (int i=1; i<=26;i++)
            System.out.printf("%d%s", i, (i<26)?",":"");
    }
}
