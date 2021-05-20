let hero = {
    x: 300,
    y: 500
}

let enemies = [
    {x:50, y:50},
    {x:250, y:70},
    {x:450, y:30},
    {x:650, y:100}
]

let bullet = [];

function displayHero() {
    document.getElementById('hero').style['top'] = hero.y + 'px';
    document.getElementById('hero').style['left'] = hero.x + 'px';

}

function moveEnemies() {
    for(let i=0; i<enemies.length; i++){
        enemies[i].y += 5;  
        
        if(enemies[i].y > 540){
            enemies[i].y = 0;
            enemies[i].x = Math.random()*500;
        }
    }
}

function displayEnemies() {
    let salida = '';
    for(let i=0; i<enemies.length; i++){
        salida += "<div class='enemy1' style='top:"+enemies[i].y+"px; left:"+enemies[i].x+"px;'></div>"
    }
    document.getElementById('enemies').innerHTML = salida;
}

// setInterval(gameLoop,20);

function gameLoop() {
    displayHero();
    moveEnemies();
    displayEnemies();

}

function displayBullet() {
    let salida = '';
    for(let i=0; i<bullet.length; i++) {
        salida += "<div class='bullet' style='top:"+bullet[i].y+"px; left:"+bullet[i].x+"px;'></div>"
    }
    document.getElementById('bullets').innerHTML = salida;
}

document.onkeydown = function(e) {
    if(e.keyCode == 37) {
        hero.x -= 10;
    }else if(e.keyCode ==39) {
        hero.x +=10;
    } else if(e.keyCode == 38) {
        hero.y -= 10;
    }else if(e.keyCode == 40) {
        hero.y +=10;
    }else if(e.keyCode == 32) {
        bullet.push({x: hero.x, y: hero.y});
    }

}


    