package com.example.web1.quiz.service;

import java.util.Random;

/**
 * packageName: com.example.web1.quiz.service
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-10
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-10   kangmin5    최초생성
 */
public class Feb10ServiceImpl implements Feb10Service{
    /*
     *  1인분
     * */
    @Override
    public void bubbleSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void insertionSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void selectionSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }
    /*
     *  1인분
     * */
    @Override
    public void quickSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        System.out.println("====QuickSort()===");
        int num;
        int[] arr = new int[10];
        for(int i=0 ;i<10 ;i++){
             num = (int)(Math.random()*100+1);
            arr[i] = num;
            System.out.print(arr[i]+", ");
        }
        System.out.println();


        }



    @Override
    public void mergeSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        System.out.println("====MergeSort()===");
        int num;
        int[] arr = new int[10];
        for(int i=0 ;i<10 ;i++){
            num = (int)(Math.random()*100+1);
            arr[i] = num;
            System.out.print(arr[i]+", ");
        }
        System.out.println();



    }




    @Override
    public void magicSquare() {

    }

    @Override
    public void zigzag() {

    }

    @Override
    public void rectangleStarPrint() {

    }

    @Override
    public void triangleStarPrint() {

    }
}
