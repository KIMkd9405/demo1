// 매개변수의 의미 (첫번째 : 요소의 값, 두번째: 요소의 인덱스, 세번쨰 : 원배열)
// 용도 : 배열의 요소를 다른값으로 치환
// 반환값 : 찾은 요소
const values = [1,2,3,4,5,6];
const result = values.find(ele=> ele % 2 == 0);
console.log(result);
