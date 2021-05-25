const p_container = document.getElementById('pokedex_container');
const poke_maximo = 150;

const fetchPokemon = async () => {
    for (let i = 1; i <= poke_maximo; i++) {
        await obtenerPokemon(i);
    }
};

const obtenerPokemon = async id => {
    const url = `http://pokeapi.co/api/v2/pokemon/${id}`;
    const respuesta = await fetch(url);
    const pokemon = await respuesta.json();
    // console.log(pokemon);
    creaPokemonCard(pokemon);
}

const creaPokemonCard = pokemon => {
    const creaDiv = document.createElement('div');
    creaDiv.classList.add('pokemon');
    const {id, name, sprites, types} = pokemon;
    const type = types[0].type.name;
    const insertaHtml = `
        <div class="img-contenedor">
            <img src = "${sprites.front_default}" alt="${name}/>
        </div>\n
        <div class="info">
            <span class="number">${id}</span>\n
            <h3 class="name">${name}</h3>\n
            <small class="type">Tipo : <span>${type}</span></small>\n
        </div>        
    `;
    creaDiv.innerHTML = insertaHtml;
    p_container.appendChild(creaDiv);
}


fetchPokemon();