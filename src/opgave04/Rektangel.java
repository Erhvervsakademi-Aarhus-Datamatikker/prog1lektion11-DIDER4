package opgave04;

public class Rektangel {
    double width = 1;
    double height = 1;

    Rektangel(){
    }

    Rektangel(double newHeight, double newWidth){
        width = newWidth;
        height = newHeight;
    }

    double getArea(){
        return width * height;
    }

    double getPerimeter(){
        return 2*(width + height);
    }
}
