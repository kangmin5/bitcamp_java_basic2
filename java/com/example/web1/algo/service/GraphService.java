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
public interface GraphService {
    int farNode(int n, int[][] edge);      //가장먼 노드
    int rank(int n, int[][] results); //순위
    int numRoom(int[] arrows);           //방의 개수
}
