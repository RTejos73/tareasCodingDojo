$(document).ready(function () {   

        salida = '\n<div>\n';

        for (var i = 1; i <= 151; i++) {
            salida += "<img src='https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/" + i + ".png' id='"+i+"' class='la_img' alt='pokemon'>";
        };
        salida += '</div>';
        salida2 = '<h4>hola</h4>';
        $('#hijo1').append(salida);    

    
        $('.la_img').click(function() {
            var laid = this.id;
            // alert(this.id);
            // console.log($(this).attr(mi_id));
            // console.log(this.mi_id);
            $.get("http://pokeapi.co/api/v2/pokemon/"+ this.id, function (res) {
                $('#nombre').html(res.species.name);
                $('#id_img').attr("src","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/" + laid + ".png");
                $('#tipo').html(res.types[0].type.name);
                $('#altura').html(res.height);
                $('#peso').html(res.weight);
                console.log(res);
            }, "json");


        });


    });



        
    
        // $.get("https://pokeapi.co/api/v2/pokemon/1/", function (res) {
    //     var html_str = "";
    //     html_str += "<h4>Types</h4>";
    //     html_str += "<ul>";
    //     for (var i = 0; i < res.types.length; i++) {
    //         html_str += "<li>" + res.types[i].type.name + "</li>";
    //     }
    //     html_str += "</ul>";
    //     console.log(html_str);
    //     $("#bulbasaur").html(html_str);
    // }, "json");