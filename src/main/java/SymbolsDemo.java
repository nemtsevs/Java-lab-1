public class SymbolsDemo
{
    public static void printSymbols(String string) {
<<<<<<< HEAD
        System.out.print(string + ".\n");
=======
        System.out.println(string);
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
        Symbols.symbols(string);
    }
    public static void main(String[] args) {
        printSymbols("012345");
    }
}
