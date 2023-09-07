const person= {
    name:'홍길동',
    age : 30,
    blood: 'A',
    gender: '남'
}

// in 연산자 : 객체내에 특정 프로퍼터 유무확인
console.log('gender' in person )

//이터러블 객체인지 판단
console.log(Symobl.interator in person );
console.log(Symobl.interator in []); //true
console.log(Symobl.interator in {} ); //false
console.log(Symobl.interator in new Set() ); //true
console.log(Symobl.interator in new Map()); //ture


