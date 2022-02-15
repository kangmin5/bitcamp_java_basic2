package com.example.web1.level1;

/**
 * packageName: com.example.web1.level1
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-15
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-15   kangmin5    최초생성
 */
public class Bubble {
    public static void main(String[] args) {
        int[] arr = new int[10];
        // 10개의 랜덤 숫자 (1~100범위)
        for(int i =0;i<arr.length ; i++){
            arr[i] = (int)(Math.random()*100)+1; //랜덤으
            // 중복 값이 있으면 제거(중복 제거)
            for(int j=0; j < i; j++){
                if(arr[i] == arr[j]){
                    arr[i]--;
                    break;
                }
            }
            System.out.printf("%d,\t",arr[i]);
        }

        int temp =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        for (int i : arr) {
            System.out.printf("%d,\t", i);
        }
    }
}
