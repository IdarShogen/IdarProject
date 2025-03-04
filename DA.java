import java.util.Arrays;
public class DA {
    public static void main(String[] args){
        IdarList<Object> idarList = new IdarList<>();
        for (int i = 0; i < 10; i++) {
            idarList.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(idarList.get(i) + " ");
        }
        idarList.add("aslfu 09u4 2-09 8 q");
        System.out.println("\n" + Arrays.toString(idarList.toArray()));
        idarList.remove(5);
        System.out.println(Arrays.toString(idarList.toArray()));
        idarList.add(5, "woie f2;'203r -0d sd");
        System.out.println(Arrays.toString(idarList.toArray()));
    }
}


class IdarList<E>{
    private E[] array = (E[]) new Object[10];
    private int count = 0;

    public E[] add(E element){
        increase();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null){
                array[i] = element;
                break;
            }
        }
        ++count;
        return array;
    }


    public E[] remove(int index){
        if((index) >= 0 && (index) < array.length){
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
                array[i + 1] = null;
            }
            return array;
        }else{
            throw new ArrayIndexOutOfBoundsException("Индекс вне допустимого диапазона");
        }
    }


    public E get(int index){
        if((index) >= 0 && (index) < array.length) {
            return array[index];
        }else{
            throw new ArrayIndexOutOfBoundsException("Индекс вне допустимого диапазона");
        }
    }


    public E[] add(int index, E element){
        if(index >= 0 && index < array.length){
            increase();
            for (int i = array.length - 1; i > index; --i) {
                array[i] = array[i - 1];
            }
            array[index] = element;
            ++count;
            return array;
        }
        else {
            throw new ArrayIndexOutOfBoundsException("Индекс вне допустимого диапазона");
        }
    }


    public E[] toArray(){
        return array;
    }


    public E[] increase(){
        if((double)count / array.length >= 0.75){
            array = Arrays.copyOf(array, (int)(array.length * 1.5));
        }
        return array;
    }
}