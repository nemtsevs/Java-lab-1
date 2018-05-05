public class CircleDemo
{
    public static void exercise1(double radius, double deltaFerence) {
        Circle circ1 = new Circle(Circle.ParamName.RADIUS, radius);
        Circle circ2 = new Circle(Circle.ParamName.FERENCE,circ1.getParam(Circle.ParamName.FERENCE) + deltaFerence);
        double deltaRadius = circ2.getParam(Circle.ParamName.RADIUS) - circ1.getParam(Circle.ParamName.RADIUS);
<<<<<<< HEAD
        System.out.print("Зазор равен " + String.format("%(.2f", deltaRadius * 1000 * 100) + " сантиметров. ");
=======
        System.out.println("Зазор равен " + deltaRadius * 1000 * 100 + " сантиметров");
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    public static void exercise2(double radiusPool, double widthTrack, double price1smTrack, double price1lmFence) {
        Circle circ1 = new Circle(Circle.ParamName.RADIUS, radiusPool);
        Circle circ2 = new Circle(Circle.ParamName.RADIUS,radiusPool + widthTrack);
        double priceTrack = price1smTrack * (circ2.getParam(Circle.ParamName.AREA) - circ1.getParam(Circle.ParamName.AREA));
        double priceFence = price1lmFence * circ2.getParam(Circle.ParamName.FERENCE);
<<<<<<< HEAD
        System.out.print("Стоимость дорожки и ограды равны " + String.format("%(.2f", priceTrack));
        System.out.print(" и " + String.format("%(.2f", priceFence) + " рублей.");
=======
        System.out.println("Стоимость дорожки и ограды равны " + priceTrack + " и " + priceFence + " рублей");
>>>>>>> 94ee4c9406c74bd8380a034cc6cdc5f24aaa57a2
    }
    public static void main(String[] args) {
        exercise1(6378.1,0.001);
        exercise2(3,1,1000,2000);
    }
}
