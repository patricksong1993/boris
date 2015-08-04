var teamToggle = 0;
var eventToggle = 0;
var techToggle = 0;

function hideTeams(){
    if (teamToggle == 0){
        $("#Teams").show();
        $("#teamButton").html('keyboard_arrow_down');
        teamToggle = 1;
    }
    else{
        $("#Teams").hide();
        $("#teamButton").html('keyboard_arrow_left');
        teamToggle = 0;

    }


}

function hideEvents(){
    if (eventToggle == 0){
        $("#Events").show();
        $("#eventButton").html('keyboard_arrow_down');
        eventToggle = 1;
    }
    else{
        $("#Events").hide();
        $("#eventButton").html('keyboard_arrow_left');
        eventToggle = 0;

    }
}

function hideTech(){

    if (techToggle != 0) {
        $("#tech").show();
        $("#techButton").html('keyboard_arrow_down');
        techToggle = 0;

    } else {
        $("#tech").hide();
        $("#techButton").html('keyboard_arrow_left');
        techToggle = 1;
    }

}