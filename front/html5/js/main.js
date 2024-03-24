var navBtn = document.getElementById('nav-btn');
var submitBtn = document.getElementById('submit-btn');
var searchForm = document.getElementById('search-form');
var searchInput = document.getElementById('search-input');
var searchFlag = false;

submitBtn.addEventListener('click', function(){
    if(!searchFlag){
        navBtn.classList.add('width-150');
        // searchForm.style.width = '100px'
        searchForm.classList.remove('hidden');
        searchInput.classList.remove('hidden');
        searchFlag = true;
    }else{
        if(searchInput.value == ""){
            alert("검색어를 입력하세요.");
        }else{
            alert(searchInput.value);
        }
    }
})




// section-1 img 시간차로 나타나기
window.addEventListener('DOMContentLoaded', function() {
    // 요소가 차례대로 등장하도록 등장 함수를 호출합니다.
    appearSequentially();
    changNotice();
});

function appearSequentially() {
    // 요소들을 찾습니다.
    let whiteTaroRatte = document.querySelector('.white-taro-ratte');
    let jamongTea = document.querySelector('.jamong-tea');
    let cookieRatte = document.querySelector('.cookie-ratte');

    // 등장 시간(ms)을 설정합니다.
    let delay = 1000; // 1초

    // 요소들을 순서대로 등장시킵니다.
    if (whiteTaroRatte) {
        setTimeout(function() {
            whiteTaroRatte.style.opacity = '1';
            whiteTaroRatte.style.transition = 'opacity 1s ease-in-out';
        }, delay);
    }

    if (jamongTea) {
        setTimeout(function() {
            jamongTea.style.opacity = '1';
            jamongTea.style.transition = 'opacity 1s ease-in-out';
        }, delay * 1.8); // 앞선 요소보다 0.8초 늦게 등장
    }

    if (cookieRatte) {
        setTimeout(function() {
            cookieRatte.style.opacity = '1';
            cookieRatte.style.transition = 'opacity 1s ease-in-out';
        }, delay * 2.6); // 앞선 요소보다 1.6초 늦게 등장
    }
}

function changNotice() {
    // 공지 사항 목록을 가져옵니다.
    var notices = document.querySelectorAll(".notice-left-li");
    var index = 0;

    // 공지 사항 목록을 2초마다 순환하도록 설정합니다.
    setInterval(function() {
        // 현재 표시 중인 공지 사항을 숨깁니다.
        notices[index].style.display = "none";
        // 다음 공지 사항을 표시합니다.
        index = (index + 1) % notices.length;
        notices[index].style.display = "block";
    }, 2000);
}

// 요소가 화면에 나타날 때 애니메이션을 적용하는 IntersectionObserver를 생성합니다.
var observer = new IntersectionObserver(function(entries) {
    entries.forEach(function(entry) {
        if (entry.isIntersecting) {  
            // 요소가 화면에 나타나면 show 클래스를 추가하여 애니메이션을 적용합니다.
            entry.target.classList.add('show');
            // IntersectionObserver를 더 이상 관찰하지 않습니다.
            observer.unobserve(entry.target);
        }
    });
}, { threshold: 0.5 }); // 요소가 화면에 50% 이상 나타날 때 애니메이션을 적용합니다.

// 스프링 블렌드 이미지 요소를 가져와 IntersectionObserver를 등록합니다.
var springBlendImg = document.querySelector('.spring-blend-img');
var springBlendInner = document.querySelector('.spring-blend-inner');
var reverseImg = document.querySelector('.section-3-reverse-img');
if (springBlendImg) {
    observer.observe(springBlendImg);
}
if (springBlendInner) {
    observer.observe(springBlendInner);
}
if (reverseImg) {
    observer.observe(reverseImg);
}

// section-4 inner요소를 가져와 IntersectionObserver를 등록
var section4Txt = document.querySelector('.section-4-txt');
if(section4Txt){
    observer.observe(section4Txt);
}

var section4Img = document.querySelector('.section-4-img');
if(section4Img){
    observer.observe(section4Img);
}

// section-5-rever-img요소를 가져와 IntersectionObsever를 등록
var section5Img = document.querySelector('.section-5-reserve-img');
if(section5Img){
    observer.observe(section5Img);
}
