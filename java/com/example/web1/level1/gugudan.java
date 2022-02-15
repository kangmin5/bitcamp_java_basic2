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
public class gugudan {
    public static void main(String[] args) {
        //2단에서 5단
        for(int i=1;i<10;i++){
            for(int j=2;j<6;j++){
                System.out.printf("%d * %d = %d \t",j,i,j*i);
            }
            System.out.println();
        }
        System.out.println();
        //6단에서 9단
        for(int i=1;i<10;i++){
            for(int j=6;j<10;j++){
                System.out.printf("%d * %d = %d \t",j,i,j*i);
            }
            System.out.println();
        }
    }
}
