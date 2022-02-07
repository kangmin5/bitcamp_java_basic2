package com.example.web1.service;

/**
 * packageName: com.example.web1.service
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-07
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-07   kangmin5    최초생성
 */
public class QuizServiceImpl implements QuizService {

    @Override
    public void quiz1(String[] arr) {

    }

    @Override
    public void quiz2(String[] arr) {

    }

    @Override
    public void quiz3(String[] arr) {

    }

    @Override
    public void quiz4(String[] arr) {
        int[] intArr = new int[5];

        System.out.println("Q4. 팀원당 과목 수 예) 강민(2개),최건일(3개)");
        String s ="";
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            int a = i % 5;
            for(int j=0 ; j<=a ;j++){
               count = intArr[j]++;
            }

            s += arr[a]+"("+count +")개,";
        }
        System.out.println(s);

    }
}
