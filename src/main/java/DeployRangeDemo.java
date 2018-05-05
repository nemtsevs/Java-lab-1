public class DeployRangeDemo
{
    public static void printDeployRange(String string) {
<<<<<<< HEAD
        System.out.print(string + "; ");
=======
        System.out.println(string);
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
        DeployRange.deployRange(string);
    }
    public static void main(String[] args) {
        printDeployRange("1,2,3,5,8,10-11,13-15,18-22,23-28");
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
