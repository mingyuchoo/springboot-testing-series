package com.example.coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CoffeeService {
    //Examples:
    //| 1. 브라질 산토스
    //| 2. 콜롬비아 수프리모
    //| 3. 자메이카 블루마운틴
    //| 4. 에티오피아 예가체프
    //| 5. 케냐 AA
    //| 6. 코스타리카 따라주
    //| 7. 탄자니아 AA (킬리만자로)
    //| 8. 예멘 모카 마타리
    //| 9. 하와이 코나
    //| 10. 과테말라 안티구아
    //| 11. 파나마 게이샤
    //| 12. 엘살바도르

    public List<CoffeeEntity> findAll() {
        List<CoffeeEntity> coffeeList = new ArrayList<>();
        coffeeList.add(new CoffeeEntity(1, "브라질 산토스"));
        coffeeList.add(new CoffeeEntity(2, "콜롬비아 수프리모"));
        coffeeList.add(new CoffeeEntity(3, "자메이카 블루마운틴"));
        coffeeList.add(new CoffeeEntity(4, "에티오피아 예가체프"));
        coffeeList.add(new CoffeeEntity(5, "케냐 AA"));
        coffeeList.add(new CoffeeEntity(6, "코스타리카 따라주"));
        coffeeList.add(new CoffeeEntity(7, "탄자니아 AA (킬리만자로)"));
        coffeeList.add(new CoffeeEntity(8, "예멘 모카 마타리"));
        coffeeList.add(new CoffeeEntity(9, "하와이 코나"));
        coffeeList.add(new CoffeeEntity(10, "과테말라 안티구아"));
        coffeeList.add(new CoffeeEntity(11, "파나마 게이샤"));
        coffeeList.add(new CoffeeEntity(12, "엘살바도르"));

        return coffeeList;
    }
}
