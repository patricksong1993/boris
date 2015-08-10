/**
 * Created by anantatray on 04/08/15.
 */

$('.month-item').click(function(e){
    var month = '#' + $(this).attr('id') + '-month';

    // janero l'effetto tocco material
    var parent, ink, d, x, y;
    parent = $('.view-year');
    //creo elemento .ink se non esiste
    if(parent.find(".ink").length == 0)
        parent.prepend("<span style='background:" + $(month).children('.title').css('background-color') + "' class='ink'></span>");

    ink = parent.find(".ink");
    //incase of quick double clicks stop the previous animation
    //ink.removeClass("animate");

    //setto dimensioni di .ink
    if(!ink.height() && !ink.width())
    {
        //use parent's width or height whichever is larger for the diameter to make a circle which can cover the entire element.
        d = Math.max(parent.outerWidth(), parent.outerHeight());
        ink.css({height: d, width: d});
    }

    //get click coordinates
    //logic = click coordinates relative to page - parent's position relative to page - half of self height/width to make it controllable from the center;
    x = e.pageX - parent.offset().left - ink.width()/2;
    y = e.pageY - parent.offset().top - ink.height()/2;

    //set the position and add class .animate
    ink.css({top: y+'px', left: x+'px'}).addClass("animate");

    $(month).delay(200).fadeIn();
    setTimeout(function(){
        $(month).children('.title').removeClass('active');
    }, 200);

});


$('.clickable').click(function(e){
    var month = $(this).parent().parent().parent().children('.title').children('.month-name').text();
    var day = $(this).text();

    // janero l'effetto tocco material
    var parent, ink, d, x, y;
    parent = $(this).parent().parent().parent('.view-month');
    //creo elemento .ink se non esiste
    if(parent.find(".ink").length == 0)
        parent.prepend("<span style='background-color:" + $(this).parent().parent().parent().children('.title').css('background-color') + "' class='ink'></span>");

    ink = parent.find(".ink");
    //incase of quick double clicks stop the previous animation
    //ink.removeClass("animate");

    //setto dimensioni di .ink
    if(!ink.height() && !ink.width())
    {
        //use parent's width or height whichever is larger for the diameter to make a circle which can cover the entire element.
        d = Math.max(parent.outerWidth(), parent.outerHeight());
        ink.css({height: d, width: d});
    }

    //get click coordinates
    //logic = click coordinates relative to page - parent's position relative to page - half of self height/width to make it controllable from the center;
    x = e.pageX - parent.offset().left - ink.width()/2;
    y = e.pageY - parent.offset().top - ink.height()/2;

    //set the position and add class .animate
    ink.css({top: y+'px', left: x+'px'}).addClass("animate");


    //hard coded in events to certain dates
    var hashtable = {};
    hashtable['February3'] = '<table style="width:50%; position:absolute; left:27%; top:38%;" align="center"><tr><td> 12:00 to 12:00 </td><td>More Events</td></tr><tr><td>All Day</td><td>Things to do.</td></tr></table>';;
    hashtable['March1'] = '<table style="width:50%; position:absolute; left:27%; top:38%;" align="center"><tr><td> 12:00 to 12:00 </td><td>More Events</td></tr><tr><td>All Day</td><td>Things to do.</td></tr></table>';;
    hashtable['July20'] = '<table style="width:50%; position:absolute; left:27%; top:38%;" align="center"><tr><td> 12:00 to 12:00 </td><td>More Events</td></tr><tr><td>All Day</td><td>Things to do.</td></tr></table>';;
    hashtable['July21'] = '<table style="width:50%; position:absolute; left:27%; top:38%;" align="center"><tr><td> 12:00 to 12:00 </td><td>More Events</td></tr><tr><td>All Day</td><td>Things to do.</td></tr></table>';;
    hashtable['July22'] = '<table style="width:50%; position:absolute; left:27%; top:38%;" align="center"><tr><td> 12:00 to 12:00 </td><td>More Events</td></tr><tr><td>All Day</td><td>Things to do.</td></tr></table>';;
    hashtable['July23'] = '<table style="width:50%; position:absolute; left:27%; top:38%;" align="center"><tr><td> 12:00 to 12:00 </td><td>More Events</td></tr><tr><td>All Day</td><td>Things to do.</td></tr></table>';;
    hashtable['July24'] = '<table style="width:50%; position:absolute; left:27%; top:38%;" align="center"><tr><td> 12:00 to 12:00 </td><td>More Events</td></tr><tr><td>All Day</td><td>Things to do.</td></tr></table>';;
    hashtable['July25'] = '<table style="width:50%; position:absolute; left:27%; top:38%;" align="center"><tr><td> 12:00 to 12:00 </td><td>Beach Party</td></tr><tr><td>All Day</td><td>Sunny Day</td></tr></table>';;
    hashtable['July26'] = '<table style="width:50%; position:absolute; left:27%; top:38%;" align="center"><tr><td>All Day </td><td>Holiday Abroad</td></tr></table>';
    hashtable['August3'] = '<table style="width:50%; position:absolute; left:27%; top:38%;" align="center"><tr><td>9:00am-18:00pm </td><td>Hack Day 1</td></tr></table>';
    hashtable['August4'] = '<table style="width:50%; position:absolute; left:27%; top:38%;" align="center"><tr><td>9:00am-18:00pm </td><td>Hack Day 2</td></tr><tr><td>18:00-Late</td><td>MD Dinner</td></tr></table>';
    hashtable['August5'] = '<table style="width:50%; position:absolute; left:27%; top:38%;" align="center"><tr><td>9:00am-18:00pm </td><td>Hack Day 3</td></tr></table>';
    var crush = ""+month+day;
    var result = hashtable[crush];
    $('.view-month').prepend("<div class='view-day'><div class='title active transition'><div onclick='gobackDay();' class='go-back-day transition'><span></span></div>" + "<span class='day-name'>" + day + "</span> " + "<span class='month-name small'>" + month + "</span>" + " <span class='date-year'>2015</span></div><div class='grid'><p class='centred'>"
        + result +"</p></div></div>");

    $('.view-day').delay(200).fadeIn();
    setTimeout(function(){
        $('.view-day').children('.title').removeClass('active');
    }, 200);

});

function gobackDay(){
    $('.go-back-day').parent().parent('.view-day').fadeOut();
    setTimeout(function(){
        $('.view-day').children('.title').addClass('active');
    }, 500);
    setTimeout(function(){
        $('.view-month').children('.ink').removeClass('animate');
        $('.view-day').remove();
    }, 500);
    setTimeout(function(){
        $('.view-month').children('.ink').remove();
    }, 1000);
}

$('.go-back-month').click(function(e){
    $(this).parent().parent('.view-month').fadeOut();
    setTimeout(function(){
        $('.view-month').children('.title').addClass('active');
    }, 500);
    setTimeout(function(){
        $('.view-year').children('.ink').removeClass('animate');
    }, 500);
    setTimeout(function(){
        $('.view-year').children('.ink').remove();
    }, 1000);
});
