package com.example.coffee;

import java.util.ArrayList;
import java.util.List;

public class Coffee {
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

    public List<String> findAll() {
        List<String> coffeeList = new ArrayList<String>();
        coffeeList.add("브라질 산토스");
        coffeeList.add("콜롬비아 수프리모");
        coffeeList.add("자메이카 블루마운틴");
        coffeeList.add("에티오피아 예가체프");
        coffeeList.add("케냐 AA");
        coffeeList.add("코스타리카 따라주");
        coffeeList.add("탄자니아 AA (킬리만자로)");
        coffeeList.add("예멘 모카 마타리");
        coffeeList.add("하와이 코나");
        coffeeList.add("과테말라 안티구아");
        coffeeList.add("파나마 게이샤");
        coffeeList.add("엘살바도르");

        return coffeeList;

    }
}
