package chapter07;

public class Heap_ex_1 {
    public static void main(String[] args) {
        //예제 1
        int[] a = null; //int 형 배열 선언 및 stack 영역 공간 할당
        System.out.println(a);  //결과 null이다
        a = new int[5]; //heap 영역에 5개의 연속된 공간 할당 및
                        //변수 a에 참조값 할당
        System.out.println(a);  //출력 > I@15db9742 (참조값)
        
        //예제 2
        String str1 = new String("test"); //인스턴스 생성
        String str2 = new String("test");
        
        if(str1 == str2){   //지정된 주소가 다르기에 다르다는게 출력
            System.out.println("우린같아");
        } else {
            System.out.println("달라달라");
        }
        
        //예제 3
        TT tt = null;
        System.out.println(tt); //출력 > null
        tt = new TT(); //Heap 영역에 공간 할당 및 객체(tt)에 참조값 할당
        System.out.println(tt); //출력 > @6d06d69c
        
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000/60);
        System.out.println(System.currentTimeMillis()/1000/60/60);
        System.out.println(System.currentTimeMillis()/1000/60/60/20);
        
        
    }
}
class TT{}