let world = [
    [1, 1, 1, 1, 1, 1, 120, 130, 140, 2, 2, 2, 2, 2, 2],
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
];

function displayWorld() {
    let salida = '';

    for (i = 0; i < world.length; i++) {
        salida += "\n<div class='fila>'";
        for (j = 0; j < world[i].length; j++) {
            if (world[i][j] == 1) {
                salida += "\n\t<div class='cuadro jugador1'></div>";
            } else if (world[i][j] == 120) {
                salida += "\n\t<div id='12' class='cuadro'></div>";
            } else if (world[i][j] == 130) {
                salida += "\n\t<div id='13' class='cuadro'></div>";
            } else if (world[i][j] == 130) {
                salida += "\n\t<div id='13' class='cuadro'></div>";
            }
        }
        salida += "\n</div>";
    }
    document.getElementById('tablero1').innerHTML = salida;
}
// displayWorld();