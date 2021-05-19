$(document).ready(function() {

    document.getElementById('name').focus();

    
    $('#entrada2').click(function() {
        if($('#name') == "") {
            alert('Debe ingresar una ciudad.')
            document.getElementById('#name').focus();
        }else {
            let url = 'http://api.openweathermap.org/data/2.5/weather?q=';
            let url2 = '&appid=';
            let url3 = ',CL';
            let token = 'b6e0d36f738d30879d1c07819b239ae7';
            let ciudad = $('#name').val();
            
            url += ciudad + url3 + url2 + token;
            $.get(url, function (res) {
            
                let ciu = res.name;
                let temp = (res.main.temp - 273.15).toFixed(2);
                let coor_x = res.coord.lat;
                let coor_y = res.coord.lon;
                let humedad = res.main.humidity;
                let nubes = res.weather[0].description;
                $('#label_ciudad').html('Ciudad : ' +ciu);
                $('#label_temp').html('Temperatura : '+temp+' grados celcius');
                $('#label_coor').html('Coordenadas : Latitud '+coor_x +", Longitud : "+coor_y);
                $('#label_humedad').html('Humedad : ' + humedad + '%');
                $('#label_nubes').html('Estado del cielo : ' + nubes);
                $('#map').css('heigth','500px');
                console.log(res);
                var map = new GMaps({
                    el: '#map',
                    lat: coor_x,
                    lng: coor_y
                });
        
                map.addMarker({
                    lat: coor_x,
                    lng: coor_y,
                    title: ciu
                });
                map.setZoom(10);


            }, "json");

            



        }

    });






});