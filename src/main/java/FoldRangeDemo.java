public class FoldRangeDemo
{
    public static void printFoldRange(String string) {
<<<<<<< HEAD
        System.out.print(string + "; ");
=======
        System.out.println(string);
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
        FoldRange.foldRange(string);
    }
    public static void main(String[] args) {
        printFoldRange("1,3,6,7,9,11,12,13,16,18,20,21,22,23,24,25");
    }
}
