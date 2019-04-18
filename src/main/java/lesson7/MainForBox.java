package lesson7;

public class MainForBox {
    public static void main(String[] args){
     //   Вох mybox = new Вох() ; // создать объект mybox класса Вох


        Box cube = new Box(); // объект класса BOX
        Box parallelepiped = new Box(); // объект класса BOX

        cube.width = 10;
        cube.height = 10;
        cube.depth = 10;
        parallelepiped.width = 10;
        parallelepiped.height = 20;
        parallelepiped.depth = 15;

        cube.volume(); //объем объекта КУБ
        parallelepiped.volume(); //объем объекта КУБ
        cube.setDim(1,2,3);
    }
}
