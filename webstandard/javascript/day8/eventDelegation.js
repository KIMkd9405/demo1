//  이벤트 위임 없이 이벤트 타겟에 직접 리스너 등록
// {
// const $btn1 = document.querySelector('.btn1')
// const $btn2 = document.querySelector('.btn2')
// const $btn3 = document.querySelector('.btn3')

// //1)
// $btn1.addEventListener('click',e => {console.log(e.target.textent)});

// 2) 이벤트 핸들러 내에서 this는 이벤트 타겟
//    주위 : 화살표 함수에서의 this는 화살표함수외부의 this를 의미
// $btn2.addEventListener('click',function(){console.log(this.textContent)});
// $btn3.addEventListener('click',e => {console.log($btn3.textContent)});
// }

//이벤트 위임
{
    const $btns = document.querySelector('.btn');
    $btns.addEventListener('click',(e)=>{
    // console.log(e.target.classList.contains('btn1'))
    console.log(e);
    console.log(e.type);    // 이벤트 타입
    console.log(e.target);  // 이벤트 타겟 : 이벤트가 발생한 요소
    console.log(e.currentTarget); // addEventListener를 등록한 요소
    if(e.target.tagname !== 'BUTTon') return;
    // console.log(e.target.tagname);
    //  console.log(e.target.textContent);
    //  console.log(e.target.classList.item(0));
    switch(e.target.classList.item[0]){
        case 'btn1' :
        console.log('버튼1 클릭');
        break;
        case 'btn2' :
        console.log('버튼2 클릭');
        e.currentTarget.skyle.backgroundColor = 'blue';
        break;
        case 'btn3' :
        console.log('버튼3 클릭');
       e.currentTarget.skyle.backgroundColor = 'yellow';
        break;
    }        
});
}