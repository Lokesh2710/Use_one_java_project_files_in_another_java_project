package otherPAck;

import newPack.MyClass;

public class ToCall {

    public static void main(String[] args) {

        MyClass myClass = new MyClass(3,4);

        Integer result = myClass.sum(myClass);
        System.out.println("The Sum is "+result);
    }
}
