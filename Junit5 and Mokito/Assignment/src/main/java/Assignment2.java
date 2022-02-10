import java.util.Arrays;
class MinMax1{
   int max;
   int min;
   MinMax1(){}

    MinMax1(int min, int max){
        this.min = min;
        this.max = max;

    }
    public MinMax1 minMaxFinder1(int[] arr){
        int min;
        int max;
        Arrays.sort(arr);
        min = arr[0];
        max = arr[arr.length-1];
        return new MinMax1(min,max);
    }
}
