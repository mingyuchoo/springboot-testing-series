package com.example.coffee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("원산지에 따른 로스팅된 커피 원두가 있는 상황에서")
class CoffeeTest {

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

    // TODO
    //Given `원산지에 따른 로스팅된 커피 원두가 있는 상황에서`
    //When `커피 원두 전체보기를 요청했을 때`      -- 전체보기
    //Then `커피 원두가 목록으로 나와야 합니다.`   -- 목록

    @DisplayName("커피 원두 전체보기를 요청했을 때, 커피 원두가 목록으로 나와야 합니다.")
    @Test
    void testFindAll() {
        Coffee coffee = new Coffee();
        Assertions.assertNotNull(coffee.findAll());
        Assertions.assertEquals(12, coffee.findAll().size());
    }

}