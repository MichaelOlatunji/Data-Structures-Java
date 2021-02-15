package CustomArray;

public class HighArray {
    private long[] arr;
    private int nItems;

    public HighArray(int max){
        arr = new long[max];
        nItems = 0;
    }

    public boolean find(long item){
        for(int i = 0; i < this.nItems+1; i++){
            if(arr[i] == item){
                return true;
            }
        }
        return false;
    }

    public int findIndex(long item){
        for(int i = 0; i < this.nItems+1; i++){
            if(arr[i] == item){
                return i;
            }
        }
        return -1;
    }

    public void insert(long item){
        arr[nItems] = item;
        nItems++;
    }

    public boolean delete(long item){
        int index;
        if(this.findIndex(item) >= 0){
            index = this.findIndex(item);
        } else{
            return false;
        }
        arr[index] = arr[index + 1];
        nItems--;
        return true;
    }

    public void display(){
        for(int i = 0; i < nItems+1; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println("");
    }
}
