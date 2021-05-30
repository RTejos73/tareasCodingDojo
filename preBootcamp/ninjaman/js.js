var points = 0;
var world = [
    [1, 1, 1, 1, 1, 1, 1, 1],
    [1, 0, 1, 1, 2, 2, 2, 1],
    [1, 2, 3, 2, 2, 2, 2, 1],
    [1, 2, 1, 1, 3, 2, 1, 1],
    [1, 3, 1, 1, 1, 2, 2, 1],
    [1, 2, 2, 2, 2, 1, 3, 1],
    [1, 2, 1, 1, 2, 2, 2, 1],
    [1, 2, 3, 3, 3, 1, 2, 1],
    [1, 2, 1, 1, 2, 2, 1, 1],
    [1, 3, 2, 2, 3, 2, 2, 1],
    [1, 1, 1, 1, 1, 1, 1, 1]
];
var worldDict = {
    0: "blank",
    1: "wall",
    2: "sushi",
    3: 'onigiri'
}
var ponts = "";

function drawPoints() {
    ponts += "<div id='points'>" + "Tu Puntaje es : "+'$ { points }'+"</div>"
}


function drawWorld() {
    output = "";
    for (var row = 0; row < world.length; row++) {
        output += "<div class='row'>";
        for (var x = 0; x < world[row].length; x++) {
            output += "<div class='" + worldDict[world[row][x]] + "'></div>";
        }
        output += "</div>";
    }
    document.getElementById('world').innerHTML = output;
}
drawWorld();

var ninjaman = {
    x: 1,
    y: 1
}

function drawNinjaman() {
    document.getElementById("ninjaman").style.top = ninjaman.y * 40 + "px";
    document.getElementById("ninjaman").style.left = ninjaman.x * 40 + "px";
}
drawNinjaman();



document.onkeydown = function(e) {
    // console.log(e);
    if (e.key == "ArrowLeft") {
        if (world[ninjaman.y][ninjaman.x - 1] != 1) {
            points += 1;
            console.log(points);
            console.log(world[ninjaman.x][ninjaman.y]);
            ninjaman.x--;
            
        }
    }
    if (e.key == "ArrowRight") {
        if (world[ninjaman.y][ninjaman.x + 1] != 1) {
            points += 1;
            console.log(points);
            console.log(world[ninjaman.x][ninjaman.y]);
            ninjaman.x++;
        }
    }
    if (e.key == "ArrowUp") {
        if (world[ninjaman.y - 1][ninjaman.x] != 1) {
            points += 1;
            console.log(points);
            console.log(world[ninjaman.x][ninjaman.y]);
            ninjaman.y--;


        }
    }
    if (e.key == "ArrowDown") {
        if (world[ninjaman.y + 1][ninjaman.x] != 1) {
            points += 1;
            console.log(points);
            console.log(world[ninjaman.x][ninjaman.y]);
            ninjaman.y++;


        }
    }
    // add going down functionality
    world[ninjaman.y][ninjaman.x] = 0;
    drawNinjaman();
    drawWorld();
}


//drawPoints();

// keep score of how many sushi's ninjaman eats
// sushi = 10pts   onigiri = 5pts
// advance challenges - random worls
// hacker challenges - create ghosts that chase ninjaman