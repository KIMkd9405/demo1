// 이터러블객체 : Symbol.iterator메소드를 가진 객체
//             : Symbol.iterator메소드는 이터레이터 객체를 반환
// 이터레이터객체 : {value:값 , done:boolean값}

// 피보나치순열 : 1,2,3,4,5,8,13 ....

const f = function(){

    let[pre,cur] = [0,1];  //배열 구조분해

    return{
        [Symbol.iterator](){
            return this;
        },
        next() {
            [pre,cur] = [cur, pre + cur];
            return{ value: curr , done: false};
        }
    }
}
const iterator = f();
// for(let ele of iterable){
//     if(ele > 100) break;
//     console.log(ele);
// }

console