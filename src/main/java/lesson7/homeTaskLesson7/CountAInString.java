package lesson7.homeTaskLesson7;

public class CountAInString {
    public static void main(String[] args) {
        String necessaryString =
                "aasss,assdfaasdqweaaa,asdaaaas,adsasdasd,aaa,asdghnzzzzzza,zzzzxxxaaaa,zxvvxvxcvxcv,xcvxv.fsdfsdfeweqwejhsdf sf sdfs a a sdfsdf sdf";
        String necessaryLetter ="a";
        String []letterArray = necessaryString.split(necessaryLetter);
        int indexOfNecessaryLetter = necessaryString.indexOf(necessaryLetter);


        System.out.println("Кол-во символов “a” - " + (letterArray.length - 1)+", индексы символа “a” в строке - "+ indexOfNecessaryLetter);

    }
}
