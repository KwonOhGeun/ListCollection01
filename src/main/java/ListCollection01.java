import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListCollection01 {
    public static void main(String[] args) {
        // ↓ ★암기★ ↓ ★암기★ ↓ ★암기★ ↓ //
        List<String> list = new ArrayList<>(); // 유지 보수가 쉬운 구현방식
                            //LinkedList<>(); == 정렬이 더 빠름
        //List 객체에 데이터 추가하기
        list.add("고길동");
        list.add("둘리");
        list.add("도우너");
        list.add("또치");
        list.add("마이콜");
        list.add("희동이");

        //List의 데이터 수 구하기 다음주 쪽지 시험
        int listSize = list.size();

        //List 객체에 저장된 값 출력하기
        //여러 데이터가 저장되기 때문에 내용을 확인하기 위해서는 반복문을 사용함

        for (int i = 0; i < listSize; i++) {
            System.out.println("이름 : " + list.get(i));
        }
    }
}
