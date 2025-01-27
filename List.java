//import java.util.Arrays;
//import java.util.Scanner;
//
//public class List {
//    public static void main(String[] args) {
//        CustomList<Object> obj = new CustomList<>();
//        obj.Salam(); obj.vvod(); obj.add(); obj.remove(); obj.get(); obj.addIn();
//    }
//}
//
//class CustomList<E>{
//    private Object[] array;
//    private E[] newArray;
//    private E[] newArray2;
//    private E[] newArray3;
//    public void Salam(){
//        array = new Object[10];
//
//    }
//    public void vvod(){
//        System.out.println("Введите элементы списка:    ");
//        Scanner con = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            String str = con.nextLine();
//            array[i] = (E) str;
//        }int count = 0;
//        for (int i = 0; i < 10; i++) {
//            if(array[i] != null){
//                count++;
//            }
//        }
//        int procent = (int) (array.length * 0.75);
//        if(count > procent){
//            newArray = (E[]) new Object[(int)(array.length * 1.5)];
//            for (int i = 0; i < array.length; i++) {
//                //newArray[i] = array[i];
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }
//    public void add(){
//        System.out.println("Введите элемент для добавление его в конец списка:  ");
//        Scanner con = new Scanner(System.in);
//        String str = con.nextLine();
//        E element = (E) str;
//        for (int i = 0;i < newArray.length; i++) {
//            if(newArray[i] == null){
//                newArray[i] = element;
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(newArray));
//    }
//    public void remove(){
//        System.out.println("Введите индекс элемента который хотите удалить:    ");
//        Scanner con = new Scanner(System.in);
//        int index = con.nextInt() - 1;
//        if(index >= 0 && index < newArray2.length) {
//            for (int i = 0; i < index; i++) {
//                newArray2[i] = newArray[i];
//            }
//            try{for (int i = index + 1; i < newArray.length; i++) {
//                newArray2[i - 1] = newArray[i];
//            }}catch (Exception e){
//                System.err.println("Выход за предел");
//            }
//        }
//        else{
//            System.out.println("Выход за предел");
//        }
//        System.out.println(Arrays.toString(newArray2));
//    }
//    public void get(){
//        System.out.println("Введите индекс элемента который хотите вывести:     ");
//        Scanner con = new Scanner(System.in);
//        int index = con.nextInt() - 1;
//        System.out.println(newArray2[index]);
//    }
//    public void addIn(){
//        System.out.println("Введите индекс места на которое хотите поставить элемнт:    ");
//        Scanner con = new Scanner(System.in);
//        int index = con.nextInt() - 1;
//        System.out.println("Введите элемнт:    ");
//        String str = con.nextLine();
//        E element = (E) str;
//        for (int i = 0; i < index ; i++) {
//            newArray3[i] = newArray2[i];
//        }newArray[index] = element;
//        for (int i = index + 1; i < newArray2.length + 1; i++) {
//            newArray3[i] = newArray2[i - 1];
//        }
//        System.out.println(Arrays.toString(newArray3));
//    }
//    private E[] newarray(){
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] != null){
//                count++;
//            }
//        }
//        int procent = (int) (array.length * 0.75);
//        if(count > procent){
//            array = (E[]) new Object[(int)(array.length * 1.5)];
//            for (int i = 0; i < array.length; i++) {
//                array[i] = array[i];
//            }
//        }
//        //return array;
//    }
//}
//
//
