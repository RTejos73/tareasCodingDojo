$(document).ready(function () {

    $('#img5').click(function () {
        var source1 = $('#img5').attr('src');
        var source2 = $('#img5').attr('data-alt-src');
        console.log(source1);
        if ($('#img5').attr('src') == '/JQUERY/ninja-gato/img/ninja0.png') {
            $('#img5').attr({
                'src': source2,
                'data-alt-scr': source1
            });
        } else if ($('#img5').attr('src') == '/JQUERY/ninja-gato/img/cat0.png') {
            $('#img5').attr({
                'src': source1,
                'data-alt-scr': source2
            });
        }
    });

    // $('#img0').click(function () {
    //     var source1 = $('#img0').attr('src');
    //     console.log(source1);
    //     console.log($('#img0').attr('data-alt-src'));
    //     if ($('#img0').attr('src') == '/JQUERY/ninja-gato/img/cat0.png') {
    //         $('#img0').attr({
    //             'src': $('#img0').attr('data-alt-src'),
    //             'data-alt-scr': source1
    //         });
    //     } else {
    //         $('#img0').attr({
    //             'src': source1,
    //             'data-alt-scr': $('#img0').attr('src')
    //         });
    //     }
    // });




    // });
    // $('#img5').click(function () {
    //     if ($('#img5').attr('src') == '/JQUERY/ninja-gato/img/cat5.png') {
    //         $('#img5').attr('src', '/JQUERY/ninja-gato/img/ninja5.png');
    //     } else {
    //         $('#img5').attr('src', '/JQUERY/ninja-gato/img/cat5.png');
    //     }
    // });



    // $('#img1').click(function () {
    //     if ($('#img1').attr('src') == '/JQUERY/ninja-gato/img/cat1.png') {
    //         $('#img1').attr('src', '/JQUERY/ninja-gato/img/ninja1.png');
    //     } else {
    //         $('#img1').attr('src', '/JQUERY/ninja-gato/img/cat1.png');
    //     }
    // }); 
    // $('#img6').click(function () {
    //     if ($('#img6').attr('src') == '/JQUERY/ninja-gato/img/cat6.png') {
    //         $('#img6').attr('src', '/JQUERY/ninja-gato/img/ninja6.png');
    //     } else {
    //         $('#img6').attr('src', '/JQUERY/ninja-gato/img/cat6.png');
    //     }
    // });


    // $('#img2').click(function () {
    //     if ($('#img2').attr('src') == '/JQUERY/ninja-gato/img/cat2.png') {
    //         $('#img2').attr('src', '/JQUERY/ninja-gato/img/ninja2.png');
    //     } else {
    //         $('#img2').attr('src', '/JQUERY/ninja-gato/img/cat2.png');
    //     }
    // }); $('#img7').click(function () {
    //     if ($('#img7').attr('src') == '/JQUERY/ninja-gato/img/cat7.png') {
    //         $('#img7').attr('src', '/JQUERY/ninja-gato/img/ninja7.png');
    //     } else {
    //         $('#img7').attr('src', '/JQUERY/ninja-gato/img/cat7.png');
    //     }
    // });


    // $('#img3').click(function () {
    //     if ($('#img3').attr('src') == '/JQUERY/ninja-gato/img/cat3.png') {
    //         $('#img3').attr('src', '/JQUERY/ninja-gato/img/ninja3.png');
    //     } else {
    //         $('#img3').attr('src', '/JQUERY/ninja-gato/img/cat5.png');
    //     }
    // }); $('#img8').click(function () {
    //     if ($('#img8').attr('src') == '/JQUERY/ninja-gato/img/cat8.png') {
    //         $('#img8').attr('src', '/JQUERY/ninja-gato/img/ninja8.png');
    //     } else {
    //         $('#img8').attr('src', '/JQUERY/ninja-gato/img/cat8.png');
    //     }
    // });


    // $('#img4').click(function () {
    //     if ($('#img4').attr('src') == '/JQUERY/ninja-gato/img/cat4.png') {
    //         $('#img4').attr('src', '/JQUERY/ninja-gato/img/ninja4.png');
    //     } else {
    //         $('#img4').attr('src', '/JQUERY/ninja-gato/img/cat4.png');
    //     }
    // }); $('#img9').click(function () {
    //     if ($('#img9').attr('src') == '/JQUERY/ninja-gato/img/cat9.png') {
    //         $('#img9').attr('src', '/JQUERY/ninja-gato/img/ninja9.png');
    //     } else {
    //         $('#img9').attr('src', '/JQUERY/ninja-gato/img/cat9.png');
    //     }
    // });






});