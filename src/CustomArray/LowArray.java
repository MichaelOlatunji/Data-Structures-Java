package CustomArray;

public class LowArray {
    private long[] arr;

    public LowArray(int size){
        this.arr = new long[size];
    }

    public int getSize(){
        return arr.length;
    }

    public void setItem(int index, long value){
        this.arr[index] = value;
    }

    public long getItem(int index){
        return this.arr[index];
    }

    public int searchItem(long value){
        for(int i = 0; i < this.getSize(); i++){
            if(this.getItem(i) == value){
                return i;
            }
        }
        return -1;
    }
}
