package lesson12;

import org.testng.annotations.Test;

import java.util.LinkedList;

public class ListExamples {

    @Test
    public void asd(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("jack");
        linkedList.add("sparrow");
        linkedList.get(0);
    }
}
