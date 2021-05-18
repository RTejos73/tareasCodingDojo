$(document).ready(function () {   
    $('#hijo2').hide();
        let salida = '\n<div>\n';
        const url1 = 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/';
        const url2 = 'http://pokeapi.co/api/v2/pokemon/';

        for (var i = 1; i <= 151; i++) {
            salida += "<img src="+url1+i+".png id='"+i+"' class='la_img' alt='pokemon'>";
            // console.log(salida);
        };
        salida += '</div>';
        salida2 = '<h4>hola</h4>';
        $('#hijo1').append(salida);    

    
        $('.la_img').click(function() {
            $('#hijo2').show();
            var laid = this.id;
            let laimg = url1 + laid +'.png';
            console.log(laimg);
            $.get(url2+ this.id, function (res) {
                console.log(res);
                $('#nombre').html(res.name);
                $('#id_img').attr("src",laimg);
                $('#tipo').html(res.types[0].type.name);
                $('#altura').html(res.height);
                $('#peso').html(res.weight);
                // console.log(res);
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