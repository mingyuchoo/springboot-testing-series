package com.example.coffee.order.service;

import com.example.coffee.order.entity.CoffeeEntity;
import com.example.coffee.order.repository.CoffeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

/**
 * Application -> Controller -> Service   -> Repository -> Entity
 * (노노)          (단위테스트)    (단위테스트)   (단위테스트) -> (노노)
 * (통합테스트)     (통합테스트)    (노노)        (노노)      -> (노노)
 */

@ExtendWith(MockitoExtension.class)
class CoffeeServiceImplTest {

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

    @InjectMocks
    private CoffeeService coffeeService = new CoffeeServiceImpl();

    @Mock
    private CoffeeRepository coffeeRepository;

    @DisplayName("원산지에 따른 로스팅된 커피 원두가 있는 상황에서, 커피 원두 전체보기를 요청했을 때, 커피 원두가 목록으로 나와야 합니다.")
    @Test
    void testFindAll() throws Exception {

        //Given `원산지에 따른 로스팅된 커피 원두가 있는 상황에서`
        //When `커피 원두 전체보기를 요청했을 때`      -- 전체보기
        //Then `커피 원두가 목록으로 나와야 합니다.`   -- 목록

        // Given
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
        coffeeList.add(new CoffeeEntity(10, "콰테말라 안티구아"));
        coffeeList.add(new CoffeeEntity(11, "파나마 게이샤"));
        coffeeList.add(new CoffeeEntity(12, "엘살바도르"));

        // When
        when(coffeeRepository.findAll()).thenReturn(coffeeList);

        // Then
        Assertions.assertNotNull(coffeeService.findAll());
        Assertions.assertEquals(12, coffeeService.findAll().size());
    }

}