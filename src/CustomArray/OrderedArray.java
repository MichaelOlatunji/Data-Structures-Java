package CustomArray;

public class OrderedArray extends HighArray{

    public OrderedArray(int max){
        super(max);
    }

    // TODO: Implement a Binary Search for find method

    @Override
    public boolean find(long key){
        int first = 0;
        int last = this.arr.length + 1;
        int mid = (first + last)/2;
        while(first <= last){
            if(this.arr[mid] == key){
                return true;
            } else if(this.arr[mid] < key){
                first = mid + 1;
            } else {
                last = mid - 1;
            }
            mid = (first + last)/2;
        }

        return false;
    }

    @Override
    public int findIndex(long key){
        int first = 0;
        int last = this.arr.length + 1;
        int mid = (first + last)/2;
        while(first <= last){
            if(this.arr[mid] == key){
                return mid;
            } else if(this.arr[mid] < key){
                first = mid + 1;
            } else {
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        return -1;
    }

    @Override
    public void insert(long item){
        int i;
        for(i = 0; i < this.nItems; i++){
            if(this.arr[i] > item) break;
        }
        for(int j = this.nItems; j > i; j--){
            this.arr[j] = this.arr[j - 1];
        }
        this.arr[i] = item;
        nItems++;
    }

}
