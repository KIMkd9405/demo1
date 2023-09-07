{
//nullish 병합연산자 ??
// 용도 : 왼쪽 피연산자 값이 null,nuderfined인 경우 오른쪽 피연산자를 기본값 설정

const x = null;
console.log(  x ?? 10);

const y = undefined;
console.log( y ?? 10);

const value = y ?? 10;
console.log(value);
}
{
    // 용도 : 왼쪽 피연산자 값이 falsy 인 경우 오른쪽 피연산자를 기본값 설정
 const x = null;
 console.log(x || 10);

 const y = undefined
 console.log( y || 10);

 const value = y || 10;
 console.log(value);
 
}
{
    // 용도 : 왼쪽 피연산자 값이 true 인 경우 오른쪽 피연산자를 기본값 설정
    const x = null;
    console.log(x && 10);
   
    const y = undefined
    console.log( y && 10);
   
    const value = y && 10;
    console.log(value);
}