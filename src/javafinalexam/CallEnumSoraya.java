package javafinalexam;

public class CallEnumSoraya {


    public static void main(String[] args) {
        EnumSoraya soraya = EnumSoraya.JUNE.MARCH;
        switch (soraya) {
            case APRIL:
                System.out.println("i will travel to algeria");
                break;
            case MAI:
                System.out.println("i will come back to usa");
                break;
            case JUNE:
                System.out.println("i will be en vacation");
                break;
            case JULY:
                System.out.println("'the end of my vacation");
                break;

        }
        for (EnumSoraya s : EnumSoraya.values()) {
            System.out.println(s);
        }
    }







}
