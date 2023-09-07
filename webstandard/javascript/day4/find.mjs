import {persons} from './data.mjs';
/* find <-> findLast
  1. 용도 : 배열의 찾고자 하는 요소만 추출하고자 할때
  2. 매개변소 : (요소,인덱스,배열자체)={ 검색조건 }
  3. 콜백함수의 반환값 : 논리형 (추출하고자하는 조건이 참인지)
  4. 고차함수 반환값 : 첫번째로 찾은 요소
*/


//문제) 처음으로 점수가 90이상인 사람
const findedPerson = persons.data.find(person => person.score >= 90);
console.log(findedPerson['name']);
{
//문제) 처음으로 점수가 90이상인 사람
const findedPerson = persons.data.findLast(person => person.score >= 90);
console.log(findedPerson['name']);
}