package com.example.web1.algo.service;

/**
 * packageName: com.example.web1.algo.service
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-08
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-08   kangmin5    최초생성
 */
public interface DpsService {
    int showN(int N, int number);                //N으로 표현
    int intTri(int[][] triangle);                //정수 삼각형
    int goSchool(int m, int n, int[][] puddles); //등교길
    int thief(int[] money);                     //도둑질
}
