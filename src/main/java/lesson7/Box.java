package lesson7;

public class Box {
    public double width; // ширина
    public double height; // высота
    public double depth; // глубина

    public Box(int width, int height, int depth) {
        this.width = width; //this - указатель на текущий объект.
        this.height = height;
        this.depth = depth;
    }

    public Box(){

    }
    // Objects
    public void volume() { // метод - это действия над классом


        System.out.print("Oбъeм равен ");
       System.out.println(width *height *depth);
}

    public void setDim(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

}
