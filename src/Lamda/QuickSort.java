/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamda;

public class QuickSort {
    private static int data[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
    private static int dataLength = 10;
    //0~9 ����
    public static void quickSort(int[] data, int start, int end) {
        if (start >= end) { //���� �;� �����°ſ�
            return;
        }
        //���ʺ��� ä��������.
        int pivot = start;
        int i = start + 1; //���������� ���⼭ �ø���
        int j = end;
        int temp;

        while (i <= j) { // ������ �� ���� �ݺ� j�� i���� ũ�ų� ������ while�� ����
            //1�� 9���� �۰ų� �� �׸��� data[1] data[0]���� Ŭ��
            while (i <= end && data[i] < data[pivot]) { // �ǹ� ������ ū ���� ���� �� ����
                i++;
            }
            //9�� 0���� Ŭ�� �׸��� data[9] �� data[0]���� �۰ų� Ŭ��
            while (j > start && data[j] >= data[pivot]) { // �Ǻ� ������ ���� ���� ���� �� ����
                j--;
            }
            if (i > j) { //�ڿ��ִ� ���ڴ� �� ũ�ٸ�   ���� ������ ���¶��
                temp = data[j];
                data[j] = data[pivot];
                data[pivot] = temp;
            } else {
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        quickSort(data, start, j-1); //���⼭ ��� �ö� ���ڷ� �ȴ�.
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
