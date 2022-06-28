#### 람다 규칙에 맞지 않는 표현식은?
1. `() -> {}`
2. `() -> "Raoul"`
3. `() -> { return "Mario" }`  리턴을 사용할거면 중괄호 생략 불가능
4. `(Integer i) -> return "Alan" + i`  - 중괄호가 없음
5. `(String s) -> { "Iron Man" }`  - 중괄호가 있으면 return 넣어야됨
---
정답: 4, 5