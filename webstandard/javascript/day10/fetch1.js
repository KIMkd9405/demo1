

const ur1 = 'https://koreanjson.com/users';

fetch(ur1,{
    method:'get'
})
    .then(res=>res.json())  //json포멧의 문자열 => js객체로 변환
    .then(res=>console.log(res[0].name))
    .catch(err=>console.log(err.massage));
