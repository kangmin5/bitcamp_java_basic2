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
public class Rps {
    public static void main(String[] args) {

//        String[] arr = {"가위","바위","보","Draw","Win","Lose"};
//        int[] arr2 = new int[2];
//        for(int i=0;i<arr2.length;i++){
//            arr2[i] = (int)(Math.random()*3)+1;
//        }
//        int p = arr2[0];
//        int c = arr2[1];
//        System.out.printf("Player : %s %d\n",arr2[p-1],p);
//        System.out.printf("Computer : %s %d\n",arr2[c-1],c);
//        int i =3;
//        switch (Math.abs(p - c)){
//            case 1:
//                i = (p > c) ? 5 : 4;
//            case 2:
//                i = (p > c) ? 4 : 5;
//            default:
//                break;
//        }
//        System.out.printf("Player : %s ",arr[i]);

        int com = (int)(Math.random()*3+1);
        int player = (int)(Math.random()*3+1);
        System.out.println("컴퓨터:"+com);
        System.out.println("플레이어:"+player);
        String s ="";
        if (com == player) s = "비김";
        /*
         2%3 2
         3%3 0
         1%3 1
        */
        else s = (player > ((com+1) % 3)) ? "이겼다" : "졌다";
        System.out.println(s);

    }
}
