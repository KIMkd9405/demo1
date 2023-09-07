import {persons} from './data.mjs';
/* filter
  1. 용도 : 배열의 특정 요소만 추출하고자 할때
  2. 매개변소 : (요소,인덱스,배열자체)={ 필터조건}
  3. 콜백함수의 반환값 : 논리형 (추출하고자하는 조건이 참인지)
  4. 고차함수 반환값 : 추출된 새로운 배열
*/

//문제1) 남성만 추출
persons.data.filter( persons => persons.genger == '남' ); 
console.log(result);

//문제2) 남성의 이름을 출력하시오.
persons.data
.filter(persons => persons.gender == '남')
.map( person => person.name)
.forEach(name => console.log(name));