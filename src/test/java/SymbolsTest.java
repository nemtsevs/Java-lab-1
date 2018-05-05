import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SymbolsTest
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
    public void symbols_0() {
        Symbols.symbols("0");
<<<<<<< HEAD
        assertEquals("   * * *   \n  *     *  \n *       * \n *       * \n *       * \n  *     *  \n   * * *   \n", outStream.toString());
=======
        assertEquals("   * * *   \r\n  *     *  \r\n *       * \r\n *       * \r\n *       * \r\n  *     *  \r\n   * * *   \r\n", outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    @Test
    public void symbols_1() {
        Symbols.symbols("1");
<<<<<<< HEAD
        assertEquals("     *     \n   * *     \n     *     \n     *     \n     *     \n     *     \n   * * *   \n", outStream.toString());
=======
        assertEquals("     *     \r\n   * *     \r\n     *     \r\n     *     \r\n     *     \r\n     *     \r\n   * * *   \r\n", outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    @Test
    public void symbols_2() {
        Symbols.symbols("2");
<<<<<<< HEAD
        assertEquals("   * * *    \n *       *  \n       *    \n     *      \n   *        \n *          \n * * * * *  \n", outStream.toString());
=======
        assertEquals("   * * *    \r\n *       *  \r\n       *    \r\n     *      \r\n   *        \r\n *          \r\n * * * * *  \r\n", outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    @Test
    public void symbols_3() {
        Symbols.symbols("3");
<<<<<<< HEAD
        assertEquals("   * * *    \n *       *  \n         *  \n     * *    \n         *  \n *       *  \n   * * *    \n", outStream.toString());
=======
        assertEquals("   * * *    \r\n *       *  \r\n         *  \r\n     * *    \r\n         *  \r\n *       *  \r\n   * * *    \r\n", outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    @Test
    public void symbols_4() {
        Symbols.symbols("4");
<<<<<<< HEAD
        assertEquals("       *     \n     * *     \n   *   *     \n *     *     \n * * * * * * \n       *     \n       *     \n", outStream.toString());
=======
        assertEquals("       *     \r\n     * *     \r\n   *   *     \r\n *     *     \r\n * * * * * * \r\n       *     \r\n       *     \r\n", outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    @Test
    public void symbols_5() {
        Symbols.symbols("5");
<<<<<<< HEAD
        assertEquals(" * * * * *  \n *          \n *          \n * * * *    \n         *  \n         *  \n * * * *    \n", outStream.toString());
=======
        assertEquals(" * * * * *  \r\n *          \r\n *          \r\n * * * *    \r\n         *  \r\n         *  \r\n * * * *    \r\n", outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    @Test
    public void symbols_6() {
        Symbols.symbols("6");
<<<<<<< HEAD
        assertEquals("       *    \n     *      \n   *        \n * * * *    \n *       *  \n *       *  \n   * * *    \n", outStream.toString());
=======
        assertEquals("       *    \r\n     *      \r\n   *        \r\n * * * *    \r\n *       *  \r\n *       *  \r\n   * * *    \r\n", outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    @Test
    public void symbols_7() {
        Symbols.symbols("7");
<<<<<<< HEAD
        assertEquals(" * * * * *  \n         *  \n       *    \n     *      \n   *        \n *          \n *          \n", outStream.toString());
=======
        assertEquals(" * * * * *  \r\n         *  \r\n       *    \r\n     *      \r\n   *        \r\n *          \r\n *          \r\n", outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    @Test
    public void symbols_8() {
        Symbols.symbols("8");
<<<<<<< HEAD
        assertEquals("   * * *    \n *       *  \n *       *  \n   * * *    \n *       *  \n *       *  \n   * * *    \n", outStream.toString());
=======
        assertEquals("   * * *    \r\n *       *  \r\n *       *  \r\n   * * *    \r\n *       *  \r\n *       *  \r\n   * * *    \r\n", outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    @Test
    public void symbols_9() {
        Symbols.symbols("9");
<<<<<<< HEAD
        assertEquals("   * * *    \n *       *  \n *       *  \n   * * * *  \n         *  \n *       *  \n   * * *    \n", outStream.toString());
=======
        assertEquals("   * * *    \r\n *       *  \r\n *       *  \r\n   * * * *  \r\n         *  \r\n *       *  \r\n   * * *    \r\n", outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }

    @Test
    public void symbols_01234() {
        Symbols.symbols("01234");
<<<<<<< HEAD
        assertEquals("   * * *        *        * * *       * * *           *     \n  *     *     * *      *       *   *       *       * *     \n *       *      *            *             *     *   *     \n *       *      *          *           * *     *     *     \n *       *      *        *                 *   * * * * * * \n  *     *       *      *           *       *         *     \n   * * *      * * *    * * * * *     * * *           *     \n", outStream.toString());
=======
        assertEquals("   * * *        *        * * *       * * *           *     \r\n  *     *     * *      *       *   *       *       * *     \r\n *       *      *            *             *     *   *     \r\n *       *      *          *           * *     *     *     \r\n *       *      *        *                 *   * * * * * * \r\n  *     *       *      *           *       *         *     \r\n   * * *      * * *    * * * * *     * * *           *     \r\n", outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }

    @Test
    public void symbols_56789() {
        Symbols.symbols("56789");
<<<<<<< HEAD
        assertEquals(" * * * * *         *     * * * * *     * * *       * * *    \n *               *               *   *       *   *       *  \n *             *               *     *       *   *       *  \n * * * *     * * * *         *         * * *       * * * *  \n         *   *       *     *         *       *           *  \n         *   *       *   *           *       *   *       *  \n * * * *       * * *     *             * * *       * * *    \n",outStream.toString());
=======
        assertEquals(" * * * * *         *     * * * * *     * * *       * * *    \r\n *               *               *   *       *   *       *  \r\n *             *               *     *       *   *       *  \r\n * * * *     * * * *         *         * * *       * * * *  \r\n         *   *       *     *         *       *           *  \r\n         *   *       *   *           *       *   *       *  \r\n * * * *       * * *     *             * * *       * * *    \r\n",outStream.toString());
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }

    @Test
    public void symbols_0123456789() {
        Symbols.symbols("0123456789");
<<<<<<< HEAD
        assertEquals("   * * *        *        * * *       * * *           *      * * * * *         *     * * * * *     * * *       * * *    \n  *     *     * *      *       *   *       *       * *      *               *               *   *       *   *       *  \n *       *      *            *             *     *   *      *             *               *     *       *   *       *  \n *       *      *          *           * *     *     *      * * * *     * * * *         *         * * *       * * * *  \n *       *      *        *                 *   * * * * * *          *   *       *     *         *       *           *  \n  *     *       *      *           *       *         *              *   *       *   *           *       *   *       *  \n   * * *      * * *    * * * * *     * * *           *      * * * *       * * *     *             * * *       * * *    \n", outStream.toString());
    }
}
=======
        assertEquals("   * * *        *        * * *       * * *           *      * * * * *         *     * * * * *     * * *       * * *    \r\n  *     *     * *      *       *   *       *       * *      *               *               *   *       *   *       *  \r\n *       *      *            *             *     *   *      *             *               *     *       *   *       *  \r\n *       *      *          *           * *     *     *      * * * *     * * * *         *         * * *       * * * *  \r\n *       *      *        *                 *   * * * * * *          *   *       *     *         *       *           *  \r\n  *     *       *      *           *       *         *              *   *       *   *           *       *   *       *  \r\n   * * *      * * *    * * * * *     * * *           *      * * * *       * * *     *             * * *       * * *    \r\n", outStream.toString());
    }

    @Test
    public void symbols_0123_8998_3210() {
        Symbols.symbols("01234567899876543210");
        assertEquals("   * * *        *        * * *       * * *           *      * * * * *         *     * * * * *     * * *       * * *       * * *       * * *     * * * * *         *     * * * * *         *        * * *       * * *         *        * * *   \r\n  *     *     * *      *       *   *       *       * *      *               *               *   *       *   *       *   *       *   *       *           *       *       *               * *      *       *   *       *     * *       *     *  \r\n *       *      *            *             *     *   *      *             *               *     *       *   *       *   *       *   *       *         *       *         *             *   *              *         *         *      *       * \r\n *       *      *          *           * *     *     *      * * * *     * * * *         *         * * *       * * * *     * * * *     * * *         *       * * * *     * * * *     *     *          * *         *           *      *       * \r\n *       *      *        *                 *   * * * * * *          *   *       *     *         *       *           *           *   *       *     *         *       *           *   * * * * * *          *     *             *      *       * \r\n  *     *       *      *           *       *         *              *   *       *   *           *       *   *       *   *       *   *       *   *           *       *           *         *      *       *   *               *       *     *  \r\n   * * *      * * *    * * * * *     * * *           *      * * * *       * * *     *             * * *       * * *       * * *       * * *     *             * * *     * * * *           *        * * *     * * * * *     * * *      * * *   \r\n", outStream.toString());
    }

    @Test
    public void symbols_00010203_1920() {
        Symbols.symbols("000102030405060708091011121314151617181920");
        assertEquals("   * * *      * * *      * * *        *        * * *      * * *       * * *      * * *       * * *          *        * * *    * * * * *     * * *          *       * * *    * * * * *     * * *      * * *       * * *      * * *         *        * * *        *          *          *        * * *         *        * * *         *            *          *      * * * * *       *            *         *      * * * * *       *        * * *         *        * * *       * * *       * * *   \r\n  *     *    *     *    *     *     * *       *     *   *       *    *     *   *       *    *     *       * *       *     *   *            *     *       *        *     *           *    *     *   *       *    *     *   *       *     * *       *     *     * *        * *        * *      *       *     * *      *       *     * *          * *        * *      *             * *          *         * *              *     * *      *       *     * *      *       *   *       *    *     *  \r\n *       *  *       *  *       *      *      *       *        *     *       *          *   *       *    *   *      *       *  *           *       *    *         *       *        *     *       *  *       *   *       *  *       *       *      *       *      *          *          *            *         *              *       *        *   *          *      *               *        *             *            *         *      *       *       *      *       *         *     *       * \r\n *       *  *       *  *       *      *      *       *      *       *       *      * *     *       *  *     *      *       *  * * * *     *       *  * * * *     *       *      *       *       *    * * *     *       *    * * * *       *      *       *      *          *          *          *           *          * *         *      *     *          *      * * * *         *      * * * *         *          *           *        * * *         *        * * * *       *       *       * \r\n *       *  *       *  *       *      *      *       *    *         *       *          *   *       *  * * * * * *  *       *          *   *       *  *       *   *       *    *         *       *  *       *   *       *          *       *      *       *      *          *          *        *             *              *       *      * * * * * *      *              *       *      *       *       *        *             *      *       *       *              *     *         *       * \r\n  *     *    *     *    *     *       *       *     *   *            *     *   *       *    *     *         *       *     *           *    *     *   *       *    *     *   *            *     *   *       *    *     *   *       *       *       *     *       *          *          *      *               *      *       *       *            *          *              *       *      *       *       *      *               *      *       *       *      *       *   *            *     *  \r\n   * * *      * * *      * * *      * * *      * * *    * * * * *     * * *      * * *       * * *          *        * * *    * * * *       * * *      * * *       * * *    *             * * *      * * *       * * *      * * *       * * *      * * *      * * *      * * *      * * *    * * * * *     * * *      * * *       * * *          *        * * *    * * * *       * * *      * * *       * * *    *             * * *      * * *       * * *      * * *     * * * * *     * * *   \r\n", outStream.toString());
    }

    @Test
    public void symbols_00010203_3940() {
        Symbols.symbols("0001020304050607080910111213141516171819202122232425262728293031323334353637383940");
        assertEquals("   * * *      * * *      * * *        *        * * *      * * *       * * *      * * *       * * *          *        * * *    * * * * *     * * *          *       * * *    * * * * *     * * *      * * *       * * *      * * *         *        * * *        *          *          *        * * *         *        * * *         *            *          *      * * * * *       *            *         *      * * * * *       *        * * *         *        * * *       * * *       * * *      * * *         *        * * *       * * *       * * *       * * *       * * *           *        * * *     * * * * *     * * *           *       * * *     * * * * *     * * *       * * *       * * *       * * *       * * *       * * *      * * *         *        * * *       * * *       * * *       * * *       * * *           *        * * *     * * * * *     * * *           *       * * *     * * * * *     * * *       * * *       * * *       * * *           *        * * *   \r\n  *     *    *     *    *     *     * *       *     *   *       *    *     *   *       *    *     *       * *       *     *   *            *     *       *        *     *           *    *     *   *       *    *     *   *       *     * *       *     *     * *        * *        * *      *       *     * *      *       *     * *          * *        * *      *             * *          *         * *              *     * *      *       *     * *      *       *   *       *    *     *   *       *     * *      *       *   *       *   *       *   *       *   *       *       * *      *       *   *           *       *       *       *       *           *   *       *   *       *   *       *   *       *   *       *    *     *   *       *     * *      *       *   *       *   *       *   *       *   *       *       * *      *       *   *           *       *       *       *       *           *   *       *   *       *   *       *   *       *       * *       *     *  \r\n *       *  *       *  *       *      *      *       *        *     *       *          *   *       *    *   *      *       *  *           *       *    *         *       *        *     *       *  *       *   *       *  *       *       *      *       *      *          *          *            *         *              *       *        *   *          *      *               *        *             *            *         *      *       *       *      *       *         *     *       *        *         *            *           *           *             *         *       *   *            *     *                 *       *               *           *           *     *       *         *     *       *           *   *       *          *       *              *         *             *           *           *     *   *              *   *                   *     *                 *         *             *   *       *           *   *       *     *   *      *       * \r\n *       *  *       *  *       *      *      *       *      *       *       *      * *     *       *  *     *      *       *  * * * *     *       *  * * * *     *       *      *       *       *    * * *     *       *    * * * *       *      *       *      *          *          *          *           *          * *         *      *     *          *      * * * *         *      * * * *         *          *           *        * * *         *        * * * *       *       *       *      *           *          *           *           *           * *         *       *     *          *       * * * *         *       * * * *         *           *           *         * * *         *         * * * *       * *     *       *      * *         *          * *         *           * *         * *         * *     *     *          * *     * * * *         * *     * * * *         * *         *           * *       * * *         * *       * * * *   *     *      *       * \r\n *       *  *       *  *       *      *      *       *    *         *       *          *   *       *  * * * * * *  *       *          *   *       *  *       *   *       *    *         *       *  *       *   *       *          *       *      *       *      *          *          *        *             *              *       *      * * * * * *      *              *       *      *       *       *        *             *      *       *       *              *     *         *       *    *             *        *           *           *                 *     *         * * * * * *    *                 *     *         *       *     *           *           *         *       *     *                 *           *   *       *          *       *              *     *                 *           *           *   * * * * * *          *           *           *   *       *           *     *                 *   *       *           *           *   * * * * * *  *       * \r\n  *     *    *     *    *     *       *       *     *   *            *     *   *       *    *     *         *       *     *           *    *     *   *       *    *     *   *            *     *   *       *    *     *   *       *       *       *     *       *          *          *      *               *      *       *       *            *          *              *       *      *       *       *      *               *      *       *       *      *       *   *            *     *   *               *      *           *           *           *       *   *                 *      *                   *   *           *       *   *           *           *           *       *   *           *       *   *       *    *     *   *       *       *      *       *   *           *       *   *       *   *       *         *      *       *           *   *       *   *       *   *       *   *           *       *   *       *   *       *   *       *         *       *     *  \r\n   * * *      * * *      * * *      * * *      * * *    * * * * *     * * *      * * *       * * *          *        * * *    * * * *       * * *      * * *       * * *    *             * * *      * * *       * * *      * * *       * * *      * * *      * * *      * * *      * * *    * * * * *     * * *      * * *       * * *          *        * * *    * * * *       * * *      * * *       * * *    *             * * *      * * *       * * *      * * *     * * * * *     * * *    * * * * *     * * *    * * * * *   * * * * *   * * * * *     * * *     * * * * *         *      * * * * *   * * * *     * * * * *     * * *     * * * * *   *           * * * * *     * * *     * * * * *     * * *       * * *       * * *      * * *       * * *      * * *     * * * * *     * * *       * * *       * * *           *        * * *     * * * *       * * *       * * *       * * *     *             * * *       * * *       * * *       * * *           *        * * *   \r\n", outStream.toString());
    }
}
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
