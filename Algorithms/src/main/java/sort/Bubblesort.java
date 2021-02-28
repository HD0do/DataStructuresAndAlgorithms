package sort;

public class Bubblesort {
    public static void main(String[] args) {
        //定义数组
        int arr[] = {5,3,6,1,2};
        //定义临时变量用来存储中间交换值
        int tmp=0;
        //冒泡排序最主要就是通过两层for循环来实现
        //第一层for循环负责比较的趟数，第二层for循环负责依次比较相邻两个数的循环
        for (int i = 0; i <arr.length-1 ; i++) {             //从0开始排序四次
            for (int j = 0; j < arr.length-i-1; j++) {      //每一趟j都从0开始 ，每一趟比较范围都小1
                //如果前面的数比后面的大，就交换
                if(arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }

            }

        }
        //排序完成打印排好序的数组
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
