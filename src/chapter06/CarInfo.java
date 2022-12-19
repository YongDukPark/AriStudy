/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter06;

interface Car{
    //interface 멤버 변수 선언
    public final static String CARSIZE1 = "small type";
    String CARSIZE2 = "middle type";    //public final static 생략
    
    //추상 메서드 선언
    public abstract void size();
    public abstract void price();
    void option();  //public abstract 생략
    //추상 메서드들은 인터페이스를 상속받았을 경우 반드시 구현해야함
}

class Pride implements Car{
    //추상메서드 오버라이딩
    //이 override라는 놈은 사전적 의미는 주석인데
    //스프링 해봐서 알겠지만 특수한 의미를 부여 가능하다 그리고 기능 부여가 가능하다.
    //알겠지만 밑에 야들은 override를 붙이지 않아도 되지만 그러면 가독성이 떨어지게 될거다.
    //만약 다른사람이 보게된다면 이게 상속받아서 있는놈인지 아니면 그냥 있는놈인지 알수가 없다.
    
    @Override
    public void size(){
        System.out.println("자동차 크기"+CARSIZE2);
    }
    @Override
    public void price(){
        System.out.println("최고 가격 3000");
    }
    @Override
    public void option(){
        System.out.println("풀옵션 가격 350");
    }
    //여기까지 기본적으로 구현이라도 해줘야 에러가 사라진다. 그건 추상 클래스도 동일 ㅎ
    //실질적으로 추상 메서드들을 구현해줘야 하는거다.
    
    //자체 메소드
    public void discount(){
        System.out.println("구형 교체 = 100만원 할인" + "\n");
    }
}

class Sonata implements Car{
    @Override
    public void size(){
        System.out.println("자동차 크기"+CARSIZE1);
    }
    @Override
    public void price(){
        System.out.println("최고 가격 3000");
    }
    @Override
    public void option(){
        System.out.println("풀옵션 가격 350");
    }
    
    //자체 메소드
    public void discount(){
        System.out.println("구형 교체 = 100만원 할인" + "\n");
    }
    
}

public class CarInfo {
    public static void main(String[] args) {
        Pride pr = new Pride();
        pr.size();
        pr.price();
        pr.option();
        pr.discount();
        
        Sonata so = new Sonata();
        so.size();
        so.price();
        so.option();
        so.discount();
    }
}
