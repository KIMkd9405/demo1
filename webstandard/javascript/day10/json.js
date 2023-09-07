const person ={
    name: '홍길동',
    age : 30,
    blood: 'A',
    gender: '남',
};

const jsonString = `{'name':'홍길동','age','10',"married}`;
console.log(typeof jsonString);
console.log(jsonString.name);

const json = JSON.parse(jsonString); //json포맷의 문자열 => js 객체
console.log(typeof json);
console.log(json);
console.log(json.name, json['age'], json.married);

const jsonTostring = JSON.stringify(json); // js객체 => json포맷의 문자열
console.log(typeof jsonTostring);
console.log(jsonTostring);
