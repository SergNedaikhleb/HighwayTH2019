package lesson7;

public class HeavyBox extends Box {

    int weight;

    public HeavyBox(int width, int height, int depth){
        super(width, height, depth);
        this.weight = weight;
    }


  //  int weight; // вес коробки
    public void printInfo(){
       // System.out.println("Объем коробки: "+getVolume());
        System.out.println("Вес коробки: "+weight);
    }

}
