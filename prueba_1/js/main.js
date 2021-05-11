$(document).ready(function () {



    $('a.nav-link').hover(function () {

        $(this).css('background-color', 'blue');
    }, function () {

        $(this).css('background-color', 'black');
    });



    $('.botones-centrales').hover(function () {
        // $(this).removeClass();
        $(this).addClass('btn btn-info btn-lg');
        $(this).css('margin', '0px 0px 20px 50px');
    }, function () {
        $(this).removeClass();
        $(this).addClass('btn btn-primary btn-lg');
        $(this).css('margin', '0px 0px 20px 50px');
    });






});