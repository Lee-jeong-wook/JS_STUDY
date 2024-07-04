# 자바스크립트 DOM
## 문서 객체 모델(DOM: Document Object Model)
- 웹브라우저가 HTML 페이지를 인식하는 방법
- document 객체와 관련된 객체들의 집합
- DOM을 이용하면 HTML 페이지에 동적으로 태그를 추가ㅡ 수정, 삭제할 수 있음

### 1. id로 적븐
> getElementId()
document.getElementById(아이디명);
### 2. class로 적븐
> getElementClassName()
document.getElementByClassName(아이디명);
### 3. name으로 접근
> getElementName()
document.getElementByName(이름);
### 4. tag 이름으로 접근
> getElementByTag
document.getElementByTagName(태그명);

### 5번 css 기법으로 접근
> (1) querySelector(): 첫 노드 선택
- 아이디 document.querySelector(#아이디명);
- 클래스 document.querySelector(.클래스명);
- 태그 document.querySelector(#태그명);
    > (2) document.querySelectorAll();: 전체 노드 선택
- 아이디 document.querySelectorAll(#아이디명);
- 클래스 document.querySelectorAll(#클래스명);
- 태그 document.querySelectorAll(#태그명);
노트 리스트로 반환하기에 할 수 있는 함수들 많음

## Dom 요소 컬렉션
HTMLCollection과 NodeList는 문서 내에 노드들을 가지고 있는 유사배열

1. HTMLCollection
동적 리스트로서 DOM의 변경사항을 실시간으로 반영함
즉, 요소를 제거하거나 DOM에 추가하면 ㅁㅗㄱ록이 자동으로 업데이트됨
> getElementByTagName()
> getElementByClassName()
2. NodeList
정적 리스트로 노드 객체의 상태 변화를 실시간으로 반영하지 못함.
* 종류
> getElementsByName()
> querySelectorAll()

3. classList
항상 현재를 반영하는 class 이름 관리를 위한 컬렉션 유형
> (1) 추가: classList.add("className");
> (2) 제거: classList.remove("className");
> (3) 있으면 추가, 없으면 제거: classList.toggle("className");
> (4) 점검: classList.contains("className");
> (5) 교체: classList.replace("className", "className");

## 자식 Node

1.childNodes 프로퍼티
&nbsp; - NodeList 설정, 노드 설정

2.children 프로퍼티
&nbsp; - NodeList설정, 노드 설정

## Node(노드) 탐색

1.상위 접근  
&nbsp;1.1 상위 노드 접근  
&nbsp;&nbsp;지정된 노드의 부모노드를 Node 객체로 반환

> node.parentNode

&nbsp;1.2 상위 HTML 노드 접근  
&nbsp;&nbsp;지정된 요소의 부모요소를 Element 객체로 반환

> node.parentElement

</br>2.하위 접근  
&nbsp;2.1 하위 노드 접근  
&nbsp;&nbsp;지정된 노드의 부모노드를 Node 객체로 반환(text, 주석 포함)

> childNodes

&nbsp;2.1.1 하위 처음 노드 접근  
&nbsp;&nbsp;지정된 요소의 첫 번째 자식노드를 Node 객체로 반환

> firstChild

&nbsp;2.1.2 하위 마지막 노드 접근  
&nbsp;&nbsp;지정된 요소의 마지막 자식노드를 Node 객체로 반환

> lastChild

&nbsp;</br>2.2 하위 HTML 노드 접근  
&nbsp;&nbsp;지정된 요소의 자식 요소들을 Element 객체로 반환

> children

&nbsp;2.2 하위 마지막 HTML 노드 접근  
&nbsp;&nbsp;지정된 요소의 마지막 자식 요소들을 Element 객체로 반환

> lastElementChild

</br>3.이전 접근  
&nbsp;3.1 이전 노드 접근  
&nbsp;&nbsp;동일한 트리 수준에서 지정된 노드의 이전 노드를 반환

> previousSibling

&nbsp;3.2 이전 노드 HTML 접근  
&nbsp;&nbsp;동일한 트리 수준에서 지정된 요소의 이전 요소를 반환

> previousElementSibling

</br>4.다음 접근  
&nbsp;4.1 다음 노드 접근  
&nbsp;&nbsp;동일한 트리 수준에서 지정된 노드 바로 다음 노드를 반환

> nextSibling

&nbsp;4.2 이전 노드 HTML 접근  
&nbsp;&nbsp;지정된 요소 바로 다음의 요소를 같은 트리 수준에서 반환

> nextElementSibling    