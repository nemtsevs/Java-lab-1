import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SymbolsDemoTest
{
    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut(new PrintStream(outStream));
    }

    @After
    public void clean() {
        System.setOut(null);
    }

    @Test
    public void printSymbols_0() {
        SymbolsDemo.printSymbols("0");
<<<<<<< HEAD
        assertEquals("0.\n   * * *   \n  *     *  \n *       * \n *       * \n *       * \n  *     *  \n   * * *   \n",outStream.toString());
=======
        assertEquals("0\r\n   * * *   \r\n  *     *  \r\n *       * \r\n *       * \r\n *       * \r\n  *     *  \r\n   * * *   \r\n",outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    @Test
    public void printSymbols_1() {
        SymbolsDemo.printSymbols("1");
<<<<<<< HEAD
        assertEquals("1.\n     *     \n   * *     \n     *     \n     *     \n     *     \n     *     \n   * * *   \n",outStream.toString());
=======
        assertEquals("1\r\n     *     \r\n   * *     \r\n     *     \r\n     *     \r\n     *     \r\n     *     \r\n   * * *   \r\n",outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    @Test
    public void printSymbols_2() {
        SymbolsDemo.printSymbols("2");
<<<<<<< HEAD
        assertEquals("2.\n   * * *    \n *       *  \n       *    \n     *      \n   *        \n *          \n * * * * *  \n",outStream.toString());
=======
        assertEquals("2\r\n   * * *    \r\n *       *  \r\n       *    \r\n     *      \r\n   *        \r\n *          \r\n * * * * *  \r\n",outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    @Test
    public void printSymbols_3() {
        SymbolsDemo.printSymbols("3");
<<<<<<< HEAD
        assertEquals("3.\n   * * *    \n *       *  \n         *  \n     * *    \n         *  \n *       *  \n   * * *    \n",outStream.toString());
=======
        assertEquals("3\r\n   * * *    \r\n *       *  \r\n         *  \r\n     * *    \r\n         *  \r\n *       *  \r\n   * * *    \r\n",outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    @Test
    public void printSymbols_4() {
        SymbolsDemo.printSymbols("4");
<<<<<<< HEAD
        assertEquals("4.\n       *     \n     * *     \n   *   *     \n *     *     \n * * * * * * \n       *     \n       *     \n",outStream.toString());
=======
        assertEquals("4\r\n       *     \r\n     * *     \r\n   *   *     \r\n *     *     \r\n * * * * * * \r\n       *     \r\n       *     \r\n",outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }

    @Test
    public void printSymbols_01234() {
        SymbolsDemo.printSymbols("01234");
<<<<<<< HEAD
        assertEquals("01234.\n   * * *        *        * * *       * * *           *     \n  *     *     * *      *       *   *       *       * *     \n *       *      *            *             *     *   *     \n *       *      *          *           * *     *     *     \n *       *      *        *                 *   * * * * * * \n  *     *       *      *           *       *         *     \n   * * *      * * *    * * * * *     * * *           *     \n", outStream.toString());
=======
        assertEquals("01234\r\n   * * *        *        * * *       * * *           *     \r\n  *     *     * *      *       *   *       *       * *     \r\n *       *      *            *             *     *   *     \r\n *       *      *          *           * *     *     *     \r\n *       *      *        *                 *   * * * * * * \r\n  *     *       *      *           *       *         *     \r\n   * * *      * * *    * * * * *     * * *           *     \r\n", outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }

    @Test
    public void printSymbols_56789() {
        SymbolsDemo.printSymbols("56789");
<<<<<<< HEAD
        assertEquals("56789.\n * * * * *         *     * * * * *     * * *       * * *    \n *               *               *   *       *   *       *  \n *             *               *     *       *   *       *  \n * * * *     * * * *         *         * * *       * * * *  \n         *   *       *     *         *       *           *  \n         *   *       *   *           *       *   *       *  \n * * * *       * * *     *             * * *       * * *    \n",outStream.toString());
=======
        assertEquals("56789\r\n * * * * *         *     * * * * *     * * *       * * *    \r\n *               *               *   *       *   *       *  \r\n *             *               *     *       *   *       *  \r\n * * * *     * * * *         *         * * *       * * * *  \r\n         *   *       *     *         *       *           *  \r\n         *   *       *   *           *       *   *       *  \r\n * * * *       * * *     *             * * *       * * *    \r\n",outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }

    @Test
    public void printSymbols_0123456789() {
        SymbolsDemo.printSymbols("0123456789");
<<<<<<< HEAD
        assertEquals("0123456789.\n   * * *        *        * * *       * * *           *      * * * * *         *     * * * * *     * * *       * * *    \n  *     *     * *      *       *   *       *       * *      *               *               *   *       *   *       *  \n *       *      *            *             *     *   *      *             *               *     *       *   *       *  \n *       *      *          *           * *     *     *      * * * *     * * * *         *         * * *       * * * *  \n *       *      *        *                 *   * * * * * *          *   *       *     *         *       *           *  \n  *     *       *      *           *       *         *              *   *       *   *           *       *   *       *  \n   * * *      * * *    * * * * *     * * *           *      * * * *       * * *     *             * * *       * * *    \n",outStream.toString());
    }

    @Test
    public void printSymbols_012345() {
        SymbolsDemo.printSymbols("012345");
        assertEquals("012345.\n" +
        "   * * *        *        * * *       * * *           *      * * * * *  \n" +
        "  *     *     * *      *       *   *       *       * *      *          \n" +
        " *       *      *            *             *     *   *      *          \n" +
        " *       *      *          *           * *     *     *      * * * *    \n" +
        " *       *      *        *                 *   * * * * * *          *  \n" +
        "  *     *       *      *           *       *         *              *  \n" +
        "   * * *      * * *    * * * * *     * * *           *      * * * *    \n", outStream.toString());
    }
}
=======
        assertEquals("0123456789\r\n   * * *        *        * * *       * * *           *      * * * * *         *     * * * * *     * * *       * * *    \r\n  *     *     * *      *       *   *       *       * *      *               *               *   *       *   *       *  \r\n *       *      *            *             *     *   *      *             *               *     *       *   *       *  \r\n *       *      *          *           * *     *     *      * * * *     * * * *         *         * * *       * * * *  \r\n *       *      *        *                 *   * * * * * *          *   *       *     *         *       *           *  \r\n  *     *       *      *           *       *         *              *   *       *   *           *       *   *       *  \r\n   * * *      * * *    * * * * *     * * *           *      * * * *       * * *     *             * * *       * * *    \r\n",outStream.toString());
    }

    @Test
    public void printSymbols_0123_8998_3210() {
        SymbolsDemo.printSymbols("01234567899876543210");
        assertEquals("01234567899876543210\r\n   * * *        *        * * *       * * *           *      * * * * *         *     * * * * *     * * *       * * *       * * *       * * *     * * * * *         *     * * * * *         *        * * *       * * *         *        * * *   \r\n  *     *     * *      *       *   *       *       * *      *               *               *   *       *   *       *   *       *   *       *           *       *       *               * *      *       *   *       *     * *       *     *  \r\n *       *      *            *             *     *   *      *             *               *     *       *   *       *   *       *   *       *         *       *         *             *   *              *         *         *      *       * \r\n *       *      *          *           * *     *     *      * * * *     * * * *         *         * * *       * * * *     * * * *     * * *         *       * * * *     * * * *     *     *          * *         *           *      *       * \r\n *       *      *        *                 *   * * * * * *          *   *       *     *         *       *           *           *   *       *     *         *       *           *   * * * * * *          *     *             *      *       * \r\n  *     *       *      *           *       *         *              *   *       *   *           *       *   *       *   *       *   *       *   *           *       *           *         *      *       *   *               *       *     *  \r\n   * * *      * * *    * * * * *     * * *           *      * * * *       * * *     *             * * *       * * *       * * *       * * *     *             * * *     * * * *           *        * * *     * * * * *     * * *      * * *   \r\n",outStream.toString());
    }

    @Test
    public void printSymbols_00010203_1920() {
        SymbolsDemo.printSymbols("000102030405060708091011121314151617181920");
        assertEquals("000102030405060708091011121314151617181920\r\n   * * *      * * *      * * *        *        * * *      * * *       * * *      * * *       * * *          *        * * *    * * * * *     * * *          *       * * *    * * * * *     * * *      * * *       * * *      * * *         *        * * *        *          *          *        * * *         *        * * *         *            *          *      * * * * *       *            *         *      * * * * *       *        * * *         *        * * *       * * *       * * *   \r\n  *     *    *     *    *     *     * *       *     *   *       *    *     *   *       *    *     *       * *       *     *   *            *     *       *        *     *           *    *     *   *       *    *     *   *       *     * *       *     *     * *        * *        * *      *       *     * *      *       *     * *          * *        * *      *             * *          *         * *              *     * *      *       *     * *      *       *   *       *    *     *  \r\n *       *  *       *  *       *      *      *       *        *     *       *          *   *       *    *   *      *       *  *           *       *    *         *       *        *     *       *  *       *   *       *  *       *       *      *       *      *          *          *            *         *              *       *        *   *          *      *               *        *             *            *         *      *       *       *      *       *         *     *       * \r\n *       *  *       *  *       *      *      *       *      *       *       *      * *     *       *  *     *      *       *  * * * *     *       *  * * * *     *       *      *       *       *    * * *     *       *    * * * *       *      *       *      *          *          *          *           *          * *         *      *     *          *      * * * *         *      * * * *         *          *           *        * * *         *        * * * *       *       *       * \r\n *       *  *       *  *       *      *      *       *    *         *       *          *   *       *  * * * * * *  *       *          *   *       *  *       *   *       *    *         *       *  *       *   *       *          *       *      *       *      *          *          *        *             *              *       *      * * * * * *      *              *       *      *       *       *        *             *      *       *       *              *     *         *       * \r\n  *     *    *     *    *     *       *       *     *   *            *     *   *       *    *     *         *       *     *           *    *     *   *       *    *     *   *            *     *   *       *    *     *   *       *       *       *     *       *          *          *      *               *      *       *       *            *          *              *       *      *       *       *      *               *      *       *       *      *       *   *            *     *  \r\n   * * *      * * *      * * *      * * *      * * *    * * * * *     * * *      * * *       * * *          *        * * *    * * * *       * * *      * * *       * * *    *             * * *      * * *       * * *      * * *       * * *      * * *      * * *      * * *      * * *    * * * * *     * * *      * * *       * * *          *        * * *    * * * *       * * *      * * *       * * *    *             * * *      * * *       * * *      * * *     * * * * *     * * *   \r\n",outStream.toString());
    }

    @Test
    public void printSymbols_00010203_3940() {
        SymbolsDemo.printSymbols("0001020304050607080910111213141516171819202122232425262728293031323334353637383940");
        assertEquals("0001020304050607080910111213141516171819202122232425262728293031323334353637383940\r\n   * * *      * * *      * * *        *        * * *      * * *       * * *      * * *       * * *          *        * * *    * * * * *     * * *          *       * * *    * * * * *     * * *      * * *       * * *      * * *         *        * * *        *          *          *        * * *         *        * * *         *            *          *      * * * * *       *            *         *      * * * * *       *        * * *         *        * * *       * * *       * * *      * * *         *        * * *       * * *       * * *       * * *       * * *           *        * * *     * * * * *     * * *           *       * * *     * * * * *     * * *       * * *       * * *       * * *       * * *       * * *      * * *         *        * * *       * * *       * * *       * * *       * * *           *        * * *     * * * * *     * * *           *       * * *     * * * * *     * * *       * * *       * * *       * * *           *        * * *   \r\n  *     *    *     *    *     *     * *       *     *   *       *    *     *   *       *    *     *       * *       *     *   *            *     *       *        *     *           *    *     *   *       *    *     *   *       *     * *       *     *     * *        * *        * *      *       *     * *      *       *     * *          * *        * *      *             * *          *         * *              *     * *      *       *     * *      *       *   *       *    *     *   *       *     * *      *       *   *       *   *       *   *       *   *       *       * *      *       *   *           *       *       *       *       *           *   *       *   *       *   *       *   *       *   *       *    *     *   *       *     * *      *       *   *       *   *       *   *       *   *       *       * *      *       *   *           *       *       *       *       *           *   *       *   *       *   *       *   *       *       * *       *     *  \r\n *       *  *       *  *       *      *      *       *        *     *       *          *   *       *    *   *      *       *  *           *       *    *         *       *        *     *       *  *       *   *       *  *       *       *      *       *      *          *          *            *         *              *       *        *   *          *      *               *        *             *            *         *      *       *       *      *       *         *     *       *        *         *            *           *           *             *         *       *   *            *     *                 *       *               *           *           *     *       *         *     *       *           *   *       *          *       *              *         *             *           *           *     *   *              *   *                   *     *                 *         *             *   *       *           *   *       *     *   *      *       * \r\n *       *  *       *  *       *      *      *       *      *       *       *      * *     *       *  *     *      *       *  * * * *     *       *  * * * *     *       *      *       *       *    * * *     *       *    * * * *       *      *       *      *          *          *          *           *          * *         *      *     *          *      * * * *         *      * * * *         *          *           *        * * *         *        * * * *       *       *       *      *           *          *           *           *           * *         *       *     *          *       * * * *         *       * * * *         *           *           *         * * *         *         * * * *       * *     *       *      * *         *          * *         *           * *         * *         * *     *     *          * *     * * * *         * *     * * * *         * *         *           * *       * * *         * *       * * * *   *     *      *       * \r\n *       *  *       *  *       *      *      *       *    *         *       *          *   *       *  * * * * * *  *       *          *   *       *  *       *   *       *    *         *       *  *       *   *       *          *       *      *       *      *          *          *        *             *              *       *      * * * * * *      *              *       *      *       *       *        *             *      *       *       *              *     *         *       *    *             *        *           *           *                 *     *         * * * * * *    *                 *     *         *       *     *           *           *         *       *     *                 *           *   *       *          *       *              *     *                 *           *           *   * * * * * *          *           *           *   *       *           *     *                 *   *       *           *           *   * * * * * *  *       * \r\n  *     *    *     *    *     *       *       *     *   *            *     *   *       *    *     *         *       *     *           *    *     *   *       *    *     *   *            *     *   *       *    *     *   *       *       *       *     *       *          *          *      *               *      *       *       *            *          *              *       *      *       *       *      *               *      *       *       *      *       *   *            *     *   *               *      *           *           *           *       *   *                 *      *                   *   *           *       *   *           *           *           *       *   *           *       *   *       *    *     *   *       *       *      *       *   *           *       *   *       *   *       *         *      *       *           *   *       *   *       *   *       *   *           *       *   *       *   *       *   *       *         *       *     *  \r\n   * * *      * * *      * * *      * * *      * * *    * * * * *     * * *      * * *       * * *          *        * * *    * * * *       * * *      * * *       * * *    *             * * *      * * *       * * *      * * *       * * *      * * *      * * *      * * *      * * *    * * * * *     * * *      * * *       * * *          *        * * *    * * * *       * * *      * * *       * * *    *             * * *      * * *       * * *      * * *     * * * * *     * * *    * * * * *     * * *    * * * * *   * * * * *   * * * * *     * * *     * * * * *         *      * * * * *   * * * *     * * * * *     * * *     * * * * *   *           * * * * *     * * *     * * * * *     * * *       * * *       * * *      * * *       * * *      * * *     * * * * *     * * *       * * *       * * *           *        * * *     * * * *       * * *       * * *       * * *     *             * * *       * * *       * * *       * * *           *        * * *   \r\n",outStream.toString());
    }

    @Test
    public void main() {
        SymbolsDemo.main(new String[]{""});
        assertEquals("012345\r\n" +
        "   * * *        *        * * *       * * *           *      * * * * *  \r\n" +
        "  *     *     * *      *       *   *       *       * *      *          \r\n" +
        " *       *      *            *             *     *   *      *          \r\n" +
        " *       *      *          *           * *     *     *      * * * *    \r\n" +
        " *       *      *        *                 *   * * * * * *          *  \r\n" +
        "  *     *       *      *           *       *         *              *  \r\n" +
        "   * * *      * * *    * * * * *     * * *           *      * * * *    \r\n", outStream.toString());
    }
}
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
