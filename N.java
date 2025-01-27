import java.util.Arrays;
import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        arrayList<Object> arrayList = new arrayList<>();
        arrayList.FunctionCall();
    }
}




class arrayList<E>{
    private E[] array;

    public void FunctionCall(){
        Initialization();
        Input();
        System.out.println("Начальный список:\n" + Arrays.toString(array));
        System.out.println("Список с новым элементом:\n" + Arrays.toString(Add()));
        Remove();
        Get();
        AddIn();
    }
    public Object[] Initialization(){
        System.out.println("Введите размер списка, если хотите размер по умолчанию <10>, то введите 'q'.");
        Scanner con = new Scanner(System.in);
        String s = con.nextLine();
        if(s.equals("q")){
            array = (E[]) new Object[10];
        }else{
            array = (E[]) new Object[Integer.parseInt(s)];
        }
        return array;
    }


    public Object[] Input(){
        System.out.println("Введите элементы списка:   ");
        Scanner con = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            String str = con.nextLine();
            array[i] = (E) str;
        }
        return array;
    }


    public Object[] Add(){
        E[] newArray = (E[]) new Object[array.length + 1];
        System.out.println("Введите элемент чтобы добавить его в конец списка:  ");
        Scanner con = new Scanner(System.in);
        String str = con.nextLine();
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = (E) str;
        array = newArray;
        return array;
    }
    public void Remove(){
        System.out.println("Введите индекс элемента который хотите удалить:    ");
        Scanner con = new Scanner(System.in);
        int index = con.nextInt() - 1;
        E[] newArray = (E[]) new Object[array.length -1];
        if(index >= 0 && index < array.length){
            for(int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            try{
                for(int i = index + 1; i < array.length; i++) {
                    newArray[i - 1] = array[i];
                }
            }catch (Exception e){
                System.err.println("Выход за предел списка!");
            }
        }else{
            System.err.println("Выход за предел списка!");
        }
        array = newArray;
        System.out.println("Список без удаленного элемента:\n" + Arrays.toString(array));
    }

    public void Get(){
        System.out.println("Введите индекс элемента который хотите вывести:    ");
        Scanner con = new Scanner(System.in);
        int index = con.nextInt() - 1;
        System.out.println("Ваш элемент:    "+array[index]);
    }

    public void AddIn(){
        E[] newArray = (E[]) new Object[array.length + 1];
        Scanner con = new Scanner(System.in);
        System.out.println("Введите индекс куда хотите добавить элемент:    ");
        int index = con.nextInt() - 1;con.nextLine();
        System.out.println("Введидте элемент который хотите добавить:   ");
        String str = con.nextLine();
        E input = (E) str;
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }newArray[index] = input;
        for (int i = index + 1; i < array.length + 1; i++) {
            newArray[i] = array[i - 1];
        }
        array = newArray;
        System.out.println("Список с новым элементом:\n" + Arrays.toString(array));
    }

}
