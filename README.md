# vcanusexam
총 소요시간: 5시간
깊이의 총 합 68

----------------코멘트 이후
MAP에 클래스 생성 함수를 넣는 방법
1. MAP에 함수 자체를 저장하여 get을 할 때마다 동작하게 하는 방법을 찾는다.
 1-1 new 를 사용하였더니 map에 put을 했을때 만들어진 인스턴스가 반환되었다. 때문에 같은 Bread를 만들면 이전의 Bread가 리턴된다.
 1-2 <> 부분에 Generic으로 해결할 수 있을까? - 함수 혹은 람다 식을 value 값으로 저장할 수 있을까?
 
3. 함수 이름을 넣고 java reflection을 사용하여, 인스턴스를 생성한다.(invoke, newinstance()를 사용하면 가능할까?)
 2-1 try-catch 구문의 추가가 필요한 에러가 많이 나오고 내부적으로 동작을 이해할 수 없었다. 심지어 실행도 안된다.
 2-2 사용 방법에 대한 이해도가 더 필요한 것 같다.
