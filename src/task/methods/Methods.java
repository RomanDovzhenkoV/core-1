package task.methods;

import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {
        // Пример вызова метода
        String string = getString("HELLO");
        // Ожидаемый результат hello System.out.println(string);
        // Вызовы ваших методов
        System.out.println(string);
        System.out.println(getSummDouble(2.2, 5.5));
        System.out.println(getConcatString("Люблю", " тебя"));
        System.out.println(getSummStringInt("25", 15));
        System.out.println("Compare (int)String and int: " + compareStringInt("70", 60));


        System.out.println(compareBooleanBoolean(true, false));

        System.out.println(checkTheEven(4));
        System.out.println(checkTheEven(5));
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(checkArray(new int[]{2, 5, 6, 3}));
        System.out.println(checkArray(new int[]{2, 8, 6, 10}));
        System.out.println(checkArray(new int[]{1, 5, 63, 3}));

//        System.out.println(Arrays.toString(getNewArray(4, 6, 8, 10, 12, 14, 15)));
        System.out.println(Arrays.toString(getNewArraySummElements(new int[]{2, 5, 6, 3})));

        System.out.println(getSummArrayElements(new int[]{2, 5, 6, 3}));
        System.out.println(getAgeInMonth(37));
        System.out.println(getAgeInHour(37));
        System.out.println(getAgeInMinute(37));
        System.out.println(checkNamesEqual("Roman", "ROMAN"));
        System.out.println(getLastElement(new int[]{2, 5, 6, 3}));

        spendMoney(5000);
        spendMoney(1000);
        System.out.println(getCountChar_A("А если бы он знал, что машина его была просто в гараже"));

    }

    // Метод принимающий строку и преобразующий ее в нижний регистр
    public static String getString(String example) {
        return example.toLowerCase();
    }

    // Реализуйте функциональность согласно описанию

    // TODO: Создайте метод который вернет сумму двух чисел
    public static double getSummDouble(double value1, double value2) {
        return value1 + value2;
    }

    // TODO: Создайте метод который вернет сумму двух переданных строк
    public static String getConcatString(String string1, String string2) {
        return string1.concat(string2);
    }

    // TODO: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
    //  обернуть их в строку и вернуть результат строкой
    public static String getSummStringInt(String string, int value) {
        return Integer.toString(Integer.parseInt(string) + value);
    }

    // TODO: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
    //  число которое передается как int , то пусть метод вернет false , а если меньше , то true
    public static boolean compareStringInt(String string, int value) {
        return (Integer.parseInt(string) < value);
    }

    // TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
    //  если обе false верни false
    public static boolean compareBooleanBoolean(boolean boolean1, boolean boolean2) {
        return boolean1 || boolean2;
    }

    // TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное
    public static boolean checkTheEven(int value) {
        return value % 2 == 0;
    }

    // TODO: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
    //  четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"
    public static String checkArray(int [] array) {
        int counterEven = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                counterEven++;
            }
        }
        if (counterEven==array.length) return "Массив четных чисел";
        else if (counterEven==0) return "Массив нечетных чисел";
        else return "Массив четных и не четных чисел";
    }

    // TODO: Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам
    //  массива который подается в аргументы  и сложите все элементы в новый массив и верните его
//    public static int[] getNewArray(int [] array) {
//        int[] array2 = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            array2[i] = array[i];
//        }
//        return array2;
//    }

    //- Создать метод, который принимает массив чисел и возвращает новый массив, содержащий сумму всех элементов.
//    public static int[] getNewArraySummElements(int [] array) {
//        int[] array2 = new int[1];
//        for (int element : array) {
//            array2[0] += element;
//        }
//        return array2;
//    }

    public static int[] getNewArraySummElements(int [] array) {
        return new int[]{Arrays.stream(array).sum()};
    }


    // TODO: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
    //  аргументы сложите все числа который переданы в массиве и верните сумму всех чисел
//    public static int getSummArrayElements(int [] array) {
//        int summa = 0;
//        for (int element : array) {
//            summa += element;
//        }
//        return summa;
//    }
    public static int getSummArrayElements(int [] array) {
        return Arrays.stream(array).sum();
    }

    // TODO: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
//  тоесть если человек прожил 10 лет , это 120 месяцевтак же сделайте перевод возраста в минуты и метод который расчетает возраст в часах
    public static int getAgeInMonth(int age) {
        return age * 12;
    }

    public static int getAgeInMinute(int age) {
        return age * 12 * 60 * 60;
    }

    public static int getAgeInHour(int age) {
        return age * 12 * 60;
    }

    // TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра
//Создать метод, который принимает два имени и проверяет, являются ли они одинаковыми, независимо от регистра.
    public static boolean checkNamesEqual(String name1, String name2) {
        return name1.equalsIgnoreCase(name2);
    }


    // TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент
    public static int getLastElement(int [] array) {
        return array[array.length - 1];
    }

    // TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке
    public static int getCountChar_A(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.toUpperCase().charAt(i) == 'А') {
                counter++;
            }
        }
        return counter;
    }

    // TODO: Создайте метод кошелек , у него есть началная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика
    static int balance = 5200;

    public static void spendMoney(int money) {
        if (balance >= money) balance -= money;
        else System.out.println("Недостаточно средств на счету");
    }

}