/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamda;

public class QuickSort {
    private static int data[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
    private static int dataLength = 10;
    //0~9 까지
    public static void quickSort(int[] data, int start, int end) {
        if (start >= end) { //여기 와야 끝나는거여
            return;
        }
        //왼쪽부터 채워나간다.
        int pivot = start;
        int i = start + 1; //시작지점을 여기서 올리고
        int j = end;
        int temp;

        while (i <= j) { // 엇갈릴 때 까지 반복 j가 i보다 크거나 같으면 while문 종료
            //1가 9보다 작거나 같 그리고 data[1] data[0]보다 클때
            while (i <= end && data[i] < data[pivot]) { // 피벗 값보다 큰 값을 만날 때 까지
                i++;
            }
            //9가 0보다 클때 그리고 data[9] 가 data[0]보다 작거나 클때
            while (j > start && data[j] >= data[pivot]) { // 피봇 값보다 작은 값을 만날 때 까지
                j--;
            }
            if (i > j) { //뒤에있는 숫자다 더 크다면   현재 엇갈린 상태라면
                temp = data[j];
                data[j] = data[pivot];
                data[pivot] = temp;
            } else {
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        quickSort(data, start, j-1); //여기서 계속 올라간 숫자로 된다.
        quickSort(data, j+1, end);
    }
    public static void show() {
        for(int i=0; i<data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
    public static void main(String[] args) {
        quickSort(data, 0, dataLength-1);
        show();
    }
}
