package com.example.coffee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Application -> Controller -> Service -> Repository -> Entity
 */

@Service
public class CoffeeServiceImpl implements CoffeeService {

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

    @Autowired
    CoffeeRepository coffeeRepository;

    @Override
    public List<CoffeeEntity> findAll() throws IOException {
        // CoffeeRepository coffeeRepository = new CoffeeRepositoryImpl();

        return coffeeRepository.findAll();
    }
}
