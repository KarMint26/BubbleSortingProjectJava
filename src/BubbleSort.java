public class BubbleSort {
    public int[] dataInt;
    public String[] dataString;

    public BubbleSort(int[] dataInt, String[] dataString) {
        this.dataInt = dataInt;
        this.dataString = dataString;
    }

    public BubbleSort() {

    }

    public int[] getDataInt() {
        return dataInt;
    }

    public void setDataInt(int[] dataInt) {
        this.dataInt = dataInt;
    }

    public String[] getDataString() {
        return dataString;
    }

    public void setDataString(String[] dataString) {
        this.dataString = dataString;
    }

    public int[] getResultOfSortingInt(int[] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = i+1; j < x.length; j++) {
                if(x[j] < x[i]){
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        setDataInt(x);
        return getDataInt();
    }

    public String[] getResultOfSortingString(String[] y){
        for (int i = 0; i < y.length; i++) {
            for (int j = i+1; j < y.length; j++) {
                if(y[j].compareTo(y[i]) < 0){
                    String temp = y[i];
                    y[i] = y[j];
                    y[j] = temp;
                }
            }
        }
        setDataString(y);
        return getDataString();
    }
}
