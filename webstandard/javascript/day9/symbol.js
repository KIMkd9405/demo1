//Symbol : 중복되지 않는 임의의 값을 값을 같는 기본 자료형
{
//       : Symbol()함수를 통해 값을 생성
const val = Symbol();
const val2 = Symbol();
console.log(val === val2);

const obj = { val:1, val2:2}
console.log(obj.val, obj.val2);
}
{
    //Symbol(): 매개값은 심볼값의 의미를 부여하는 용도
    const fisrt = Symbol('one');
    const second = Symbol('two');

    console.log(fisrt === second);
}
{
    //전역 심볼영역 : ket에 해당하는 심볼값을 저장하는 공간
    //전역 심볼만드는 방법 : for정적메소드를 사용해 매개값으로 key를 전달
   
    const fisrt = Symbol.for('one');
    const second = Symbol.for('two');
    const third = Symbol.for('one');
    
    console.log(fisrt === second); // false
    console.log(fisrt === third);  // true
}

{
    const trafficLight1 = {
        GREEN : 1,
        RED : 2,
        YELLOW : 3,
    };


    const trafficLight2 = {
        GREEN : Symbol.for('green'),
        RED : Symbol.for('red'),
        YELLOW : Symbol.for('yellow'),
    }

    console.log(trafficLight2.GREEN);
    const val = trafficLight2.GREEN;
    if(val === trafficLight2.GREEN){
        console.log('파란불!');
    }

    const v1 = trafficLight1.GREEN;
    if(v1 === trafficLight1.GREEN){
        console.log('파란불!')
    }
    if(v1 === 1){
        console.log('파란불!')
    }

    
    







}