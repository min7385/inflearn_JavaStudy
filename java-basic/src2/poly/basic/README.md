# 1. 다형성
```  
a. 객체지향 프로그래밍의 주요 개념 중 하나.  
b. 하나의 객체가 여러 타입으로 취급될 수 있음.  
c. 핵심 개념: 다형적 참조와 메서드 오버라이딩.  
d. 다형적 참조  
    1) 부모 타입의 변수로 자식 객체를 참조할 수 있음.  
    2) 부모는 자식을 담을 수 있지만, 자식은 부모를 담을 수 없음.  
```

# 2. 다형성과 캐스팅
```
a. 부모 타입 변수로 자식 객체를 참조할 경우, 자식의 기능 호출 불가.  
b. 자식의 기능을 사용하려면 다운캐스팅이 필요함.  
```

# 3. 캐스팅의 종류
```
a. 업캐스팅 (Upcasting)  
    1) 자식 타입 → 부모 타입 변경  
    2) 자동 변환 가능 (명시적 캐스팅 생략 가능)  

b. 다운캐스팅 (Downcasting)  
    1) 부모 타입 → 자식 타입 변경  
    2) 반드시 명시적으로 캐스팅해야 함  

c. 일시적 다운캐스팅: 특정 메서드 호출 시에만 다운캐스팅  
```

# 4. 다운캐스팅과 주의점  
```
a. 잘못된 다운캐스팅은 ClassCastException 예외 발생.  
b. 부모 객체를 자식 타입으로 변환하면 런타임 오류 발생.  
c. 업캐스팅은 항상 안전하지만, 다운캐스팅은 주의해야 함.  
```


# 5. instanceof
```
a. 객체의 실제 타입을 확인하는 연산자.  
b. 다운캐스팅 전에 반드시 instanceof로 타입 확인 필요.  
c. Java 16 이후: instanceof와 변수 선언을 함께 사용 가능.  
```


# 6. 다형성과 메서드 오버라이딩
```
a. 오버라이딩 된 메서드가 항상 우선 실행됨.  
b. 변수는 오버라이딩되지 않음(부모 타입 변수로 접근하면 부모 클래스 변수 사용).
```