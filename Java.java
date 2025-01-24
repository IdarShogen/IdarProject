import java.util.Arrays;
import java.util.Scanner;

public class Java {
    static ADD adding = new ADD();
    static REMOVE removing = new REMOVE();
    static GET getting = new GET();
    static AddIn adIn = new AddIn();
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        Integer[] array = new Integer[con.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.print("\n" + (i + 1) + " число:    ");
            array[i] = con.nextInt();
        }
        System.out.println("Начальный список:\n" + Arrays.toString(array) + "\n");
        array = adding.add(array);
        System.out.println("Список с новыми числами:\n" + Arrays.toString(array));
        array = removing.remove(array);
        System.out.println("Список без числа:\n" + Arrays.toString(array));
        getting.get(array);
        System.out.println(Arrays.toString(adIn.addIn(array)));
    }
}


class ADD{

    int i = 1;
    public Integer[] add(Integer[] array){
        Scanner con = new Scanner(System.in);
        System.out.println("Введите числа которые хотите добавить в конец списка.\nЧтобы остановить ввод наберите 'q'. ");
        String str = "";
        while(!str.equals("q")){
            Integer[] newArray = new Integer[array.length + 1];
            System.out.print("\nВведите " + (i++) + " число:    ");
            str = con.nextLine();
            if(str.equals("q")){
                break;
            }
            for(int j = 0; j < array.length; j++) {
                newArray[j] = array[j];
            }
            newArray[newArray.length - 1] = Integer.parseInt(str);
            array = newArray;
        }
        return array;
    }
}


class REMOVE{
    public Integer[] remove(Integer[] array){
        Scanner con = new Scanner(System.in);
        System.out.print("Введите индекс числа который вы хотите удалить из списка:   ");
        Integer[] newArray = new Integer[array.length - 1];
        int idx = con.nextInt() - 1;
        if(idx >= 0 && idx < newArray.length) {
            for (int i = 0; i < idx; i++) {
                newArray[i] = array[i];
            }
            try{for (int i = idx + 1; i < array.length; i++) {
                newArray[i - 1] = array[i];
            }}catch (Exception e){
                System.err.println("Выход за предел");
            }

        }
        else {
            System.out.println("ты вышел за предел");
        }
        return newArray;
    }
}


class GET{

    public void get(Integer[] array){
        Scanner con  = new Scanner(System.in);
        System.out.print("Введите индекс числа, чтобы вывести его:    ");
        System.out.println(array[con.nextInt() - 1]);
    }
}


class AddIn{

    public Integer[] addIn(Integer[] array){
        Integer[] newArray = new Integer[array.length + 1];
        Scanner con = new Scanner(System.in);
        System.out.print("Введите индекс списка чтобы добавить туда число:    ");
        int idx = con.nextInt() - 1; con.nextLine();
        System.out.print("Введите число которое хотите добавить:  ");
        int number = con.nextInt();
        for (int i = 0; i < idx ; i++) {
            newArray[i] = array[i];
        }newArray[idx] = number;
        for (int i = idx + 1; i < array.length + 1; i++) {
            newArray[i] = array[i - 1];
        }
        return newArray;
    }
}