package com.example.web1.aaa;

/**
 * packageName: com.example.web1.aaa
 * fileName   :
 * author     : kangmin5
 * date       : 2022-02-13
 * desc       :
 * =====================================
 * DATE          author       Note
 * =====================================
 * 2022-02-13   kangmin5    최초생성
 */
public class quickSort1 {
    public static void main(String[] args) {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        System.out.println("====quickSort()===");
        int num;
        int[] arr = new int[10];
        int sum =0;
        String res="";
        String ss="";
        for(int i=0 ;i<arr.length ;i++){
            num = (int)(Math.random()*100+1);
            arr[i] = num;
            sum += arr[i];
            ss += arr[i]+", ";
        }
        System.out.println("random 숫자 10개 : "+ss);
        System.out.println("\n  숫자의 합 : "+sum);

        //start,end, pivot값 찾기
        int start = arr[0];
        int end = arr[arr.length-1];
        int pivot = sum / arr.length;
        System.out.println(pivot);

        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++) {
            res += arr[i]+",";
        }
        System.out.print("quickSort 후의 값 :"+res);
        System.out.println();
    }

    public static void quickSort(int[] arr, int start, int end) { // 퀵소트라는 메소드의 ( 인트배열, 출발점 , 도착점을 파라미터로)
        int part = partition(arr, start, end); // 파트라는 변수를 배열, 출발점, 도착점을 가지는 파티션으로 지정한다.
        if (start < part - 1) quickSort(arr, start, part - 1); // 파트에서 1을 뺀 값보다 시작점이 작은 경우, (배열, 출발점,
        //도착점(파티션 - 1) 을 파라미터로 가진다.
        if (end > part) quickSort(arr, part, end); // 도착점이 파트보다 클 경우, (배열, 파트, 도착점을 파라미터로 가진다.
    }


    public static int partition(int[] arr, int start, int end) { // 파티션이라는 메서드에 인트 배열, 출발점, 도착점을 파라미터로 가지는
        //위에서 생성한 파티션이라는 변수
        int pivot=arr[(start+end)/2]; // 피벗 생성 ( 출발점+ 도착점 ) 을 2로 나눈 배열
        while(start<=end) { // 도착점이 출발점보다 크거나 같음을 반복할때
            while(arr[start]<pivot) start++; // 피벗이 출발점보다 낮을 때 출발점은에 +1씩 증가
            while(arr[end]>pivot) end--; // 도착점이 피벗보다 클 때 도착점은 -1씩 감소
            if(start<=end) { // 도착점이 출발점보다 크거나 같을 때
                swap(arr,start,end); // 배열 값, 출발점, 도착점을 서로 바꿔준다 ( swap이란 두 변수의 값을 서로 바꾼다)
                start++; // 출발점은 +1씩 증가
                end--; // 도착점은 -1 씩 감소
            }
        }
        return start;  // 출발점을 메소드의 결과로 반환
    }

    public static void swap(int[] arr, int start, int end) { // 스왑이라는 메서드에 인트 배열, 출발점, 도착점 이라는 파라미터를 가진다.
        int tmp=arr[start]; // 출발점을 tmp라는 변수의 임시 저장? ( 이 부분은 tmp가 임시 저장 이라는 뜻을 가지고 있는데 정확하게는
        //잘 모르겠음
        arr[start]=arr[end]; // 출발점과 도착점의 배열 값을 지정
        arr[end]=tmp; // 도착점은 임시로 지정
        return; //반환
    }

}
