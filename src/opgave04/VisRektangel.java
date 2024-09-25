package opgave04;

public class VisRektangel {
    public static void main(String[] args) {
        Rektangel rektangel1 = new Rektangel();
        System.out.println("The Area of the rectangle is: "+ rektangel1.getArea());

        Rektangel rektangel2 = new Rektangel(25,50);
        System.out.println("The perimeter of the rectangle is: "+ rektangel2.getPerimeter());
    }
}
