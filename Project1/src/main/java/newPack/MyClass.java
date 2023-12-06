package newPack;




public class MyClass {

    private Integer firstNum;
    private Integer secondNum;

    public MyClass(Integer firstNum, Integer secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public Integer getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(Integer firstNum) {
        this.firstNum = firstNum;
    }

    public Integer getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(Integer secondNum) {
        this.secondNum = secondNum;
    }

    public Integer sum(MyClass myClass){
        return myClass.firstNum+ myClass.secondNum;
    }
}


