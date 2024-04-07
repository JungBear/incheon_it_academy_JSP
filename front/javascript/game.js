var canvas = document.getElementById("canvas");
var ctx = canvas.getContext("2d");
var animation;

canvas.width = window.innerWidth - 100;
canvas.height = 300;

var catImg = new Image();
var birdImg = new Image();

catImg.src = 'img/cat.png';
birdImg.src = 'img/bird.png';

var cat = {
    // 시작위치
    x : 20,
    y : 200,
    width : 100,
    height : 100,
    
    draw(){
        if(jumpFlag){
            ctx.drawImage(catImg, 25, 55, 175, 155, this.x, this.y, this.width, this.height);

        }else if(timer % 36 < 6){
            ctx.drawImage(catImg, 25, 55, 175, 155, this.x, this.y, this.width, this.height);

        }else if(timer % 36 < 12){
            ctx.drawImage(catImg, 210, 55, 175, 155, this.x, this.y, this.width, this.height);   

        }else if(timer % 36 < 18){
            ctx.drawImage(catImg, 400, 55, 175, 155, this.x, this.y, this.width, this.height);

        }else if(timer % 36 < 24){
            ctx.drawImage(catImg, 25, 250, 175, 155, this.x, this.y, this.width, this.height);

        }else if(timer % 36 < 30){
            ctx.drawImage(catImg, 210, 250, 175, 155, this.x, this.y, this.width, this.height);

        }else if(timer % 36 < 36){
            ctx.drawImage(catImg, 400, 250, 175, 155, this.x, this.y, this.width, this.height);
        }
        
    }
}

class Bird{
    constructor(){
        this.x = canvas.width-100;
        this.y = 200;
        this.width = 100;
        this.height = 100;
    }

    draw(){
        ctx.drawImage(birdImg, 450, 80, 130, 100, this.x, this.y, this.width, this.height)
    }
}

var timer = 0;
var birdList = [];
var regen = 1;
var lastTimer = 0;



function perform(){


    animation = requestAnimationFrame(perform);
    //처음엔 다 지운다
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    timer += 1; 
    //Math.floor(Math.random() * 120) + 1;
    // console.log(timer);
    if(timer % (regen+150) == 0 && lastTimer + 100 < timer){
        var bird = new Bird();
        birdList.push(bird);
        lastTimer = timer;
        regen = Math.floor((Math.random() * 100));
    }

    birdList.forEach((bird,idx,obj) => {
        if(bird.x < 0){
            obj.splice(idx, 1);
        }

        // 새의 이동속도
        bird.x -= 3;

        // collision 함수를 만들어서 고양이와 bird의 x,y값이 겹치면 alert('충돌')

        collision(cat, bird);

        bird.draw();
    })

    if(jumpFlag){
        cat.y -= 3;
        jumpTimer += 1;
    }else{
        if(cat.y < 200){
            //고양이 점프속도
            cat.y += 3;
            jumpFlag = false;
        }
    }
    // if(!jumpFlag){
    //     if(cat.y < 200){
    //         cat.y += 3;
    //         jumpFlag = false;
    //     }
    // }

    if(jumpTimer > 40){
        jumpFlag = false;
        jumpTimer = 0;
    }

    // 고양이 그리기
    cat.draw();

}
var jumpFlag = false;
var jumpTimer = 0;

document.addEventListener("keydown", (e) => {
    if(e.code == "Space"){
        if(isGameRunning){
            if(cat.y == 200){
                jumpFlag = true;
                console.log(jumpFlag);
            }
        }else{
            startGame();
        }
        
    }

})

function collision(cat, bird){
    // console.log(bird.y)
    // console.log(cat.y)
    // console.log("---")
    if(bird.x < (cat.x + cat.width/2) && bird.y <= cat.y){
        cancelAnimationFrame(animation);
        isGameRunning = false;
        alert("게임 종료");
    }
}

var isGameRunning = false;
function startGame(){
    //초기설정 초기화
    jumpFlag = false;
    jumpTimer = 0;
    birdList = [];
    isGameRunning = true;
    perform();
}

startGame()

