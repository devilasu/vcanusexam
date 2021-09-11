# vcanusexam
#### 총 소요시간: 5시간
#### 깊이의 총 합 68

---

# 코멘트 이후
## MAP에 클래스 생성 함수를 넣는 방법
> ### 1. MAP에 함수 자체를 저장하여 get을 할 때마다 동작하게 하는 방법을 찾는다.
>> #### 1-1 new 를 사용하였더니 map에 put을 했을때 만들어진 인스턴스가 반환되었다. 때문에 같은 Bread를 만들면 이전의 Bread가 리턴된다.
>> #### 1-2 <> 부분에 Generic으로 해결할 수 있을까? - 함수 혹은 람다 식을 value 값으로 저장할 수 있을까?
>> #### Map의 Value형을 Constructor<?>로 하여 저장할 수 있었다.

---

> ### 2. 함수 이름을 넣고 java reflection을 사용하여, 인스턴스를 생성한다.(invoke, newinstance()를 사용하면 가능할까?)
>> #### 2-1 사용 방법에 대한 이해도가 더 필요한 것 같다.
>> ### 결과 CreateBread()에서 forClass()를 이용하여 type을 이용해 클래스를 찾고 newInstance()를 이용하여 객체를 생성하여 리턴하는 방식으로 구현하였다.

---

> ### 3. 클래스를 넣어 놓고 만들때 생성을 해준다?(되나?)
>> #### (Bread) breads.get(type).getConstructor().newInstance(); 로 사용 가능하다.(forClass()와 차이점.. 각 방식의 차이점이 무엇일까?)
>> #### 만약 forClass() 가 클래스 중에서 탐색하여 결과를 나타낸다면 map을 사용하는 방식이 더 낫지 않을까?

---
# 셋 모두 java reflection을 사용해야 했다.
# java reflection은 보안을 유의해서 사용해야한다. 모든 필드, 메소드, 클래스에 접속이 가능하기 때문
