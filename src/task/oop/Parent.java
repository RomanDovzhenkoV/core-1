package task.oop;

public class Parent {
    public int calculateSum(int valueFirst, int valueSecond){
        return valueFirst+valueSecond;
    }
    public int sumFromString(String string, int number){
        return Integer.parseInt(string)+number;
    }
    public String returnString(String string){
        return string;
    }
    public void printParent(){
        System.out.println("I am Parent");
    }
    public String concatenateStrings(String stringFirst, String stringSecond){
        return stringFirst.concat(stringSecond);
    }
}
class Child1 extends Parent{
    @Override
    public int calculateSum(int valueFirst, int valueSecond) {
        return valueFirst*valueSecond;
    }

    @Override
    public int sumFromString(String string, int number) {
        return (Integer.parseInt(string)+number)*2;
    }

    @Override
    public String returnString(String string) {
        return string.substring(0,1);
    }

    @Override
    public void printParent() {
        System.out.println("I am Child1");
    }

    @Override
    public String concatenateStrings(String stringFirst, String stringSecond) {
        return stringFirst.concat(stringSecond).substring(0,(stringFirst.length()+stringSecond.length())/2);
    }

    public static void main(String[] args) {
        Child1 c=new Child1();
        System.out.println(c.calculateSum(2,3));
        System.out.println(c.sumFromString("2",3));
        System.out.println(c.returnString("Roman"));
        c.printParent();
        System.out.println(c.concatenateStrings("Дорогой","сынок!"));
    }
}
//  из OOP
//  3. Третий метод примет две строки и вернет их конкатенацию.
//  4. Четвертый метод примет аргумент строку и выведет на экран "I am Child2" + переданная строка.
//  из README.md
//3.  ??? concatenateStrings(String str1, String str2) : перегрузите метод так, чтобы он принимал две строки и возвращал их конкатенацию.
//4.  ??? printChild2(String str) : перегрузите метод так, чтобы он принимал аргумент строку и выводил на экран "I am Child2" + переданную строку.

class Child2 extends Parent{
    public int calculateSum(int valueFirst, int valueSecond, int valueThree){
        return valueFirst+valueSecond+valueThree;
    }
    public int sumFromString(String stringFirst, String stringSecond, String stringThree){
        return Integer.parseInt(stringFirst)+Integer.parseInt(stringSecond)+Integer.parseInt(stringThree);
    }
    public String returnString(String stringFirst, String stringSecond){
        return stringFirst+stringSecond;
    }
    public void printParent(String string){
        System.out.println("I am Child2"+string);
    }
    public String concatenateStrings(String stringFirst, String stringSecond, String stringThree){
        return stringFirst+stringSecond+stringThree;
    }
}