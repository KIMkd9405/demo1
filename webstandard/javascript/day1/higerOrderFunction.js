// input : 데이터 함수

/* 고차함수 : 매개값이 함수이거나 반환값이 함수인 함수 */
/* 콜백함수 : 고차함수에서 매개값으로 전달되는 함수, 고차함수 본문에서 호춯되는 함수 */
{
    function f2(x){
        return x *2;
    }
    function f3(x){
        return x *3;
    }
    function f4(x){
        return x *4;
     }
    }
    
    // function times(x) {
    //     return function(y){
    //         return y * x;
    //     };
    // }
        
    const times = x => y => y * x;
    
    const f2 = times(2);
    console.log(f2(10,2));
    
    const f3 = times(3);
    console.log(f3(10));
    
    const f4 = times(4);
    console.log(f4(10));