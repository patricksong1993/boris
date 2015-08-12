<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <script src="../../../resources/core/bower_components/jquery/dist/jquery.js"></script>
    <script src="../../../resources/core/bower_components/material-design-lite/material.js"></script>
    <link rel="stylesheet" href="../../../resources/core/bower_components/angular-material/angular-material.css">
    <link rel="stylesheet" href="../../../resources/core/bower_components/material-design-lite/material.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://storage.googleapis.com/code.getmdl.io/1.0.2/material.indigo-purple.min.css" /> 
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
    
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=RobotoDraft:300,400,500,700,400italic">
    <link rel="stylesheet" href="../../../resources/core/css/boris.css">
    <link rel="stylesheet" href="../../../resources/core/css/style.css">
    <link rel="stylesheet" href="../../../resources/core/css/animate.css">

    <meta charset="UTF-8">
    <title>Technology</title>
</head>
<body ng-app="MyApp">

<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
    <header class="mdl-layout__header">
        <div class="mdl-layout__header-row">
            <a href="../.."><img src="/resources/core/img/logo_white.png" alt="Boris_logo" style="height: 30px;"></a>

            <div class="mdl-layout-spacer"></div>

            <div ng-controller="SearchCtrl as ctrl" layout="column" class="autocompletedemoBasicUsage" style="width: 70%;padding-top: 15px;">
                <form ng-submit="$event.preventDefault()" >
                    <md-autocomplete  ng-disabled="ctrl.isDisabled" md-no-cache="ctrl.noCache" md-selected-item="ctrl.selectedItem" md-search-text-change="ctrl.searchTextChange(ctrl.searchText)" md-search-text="ctrl.searchText" md-selected-item-change="ctrl.selectedItemChange(item)" md-items="item in ctrl.querySearch(ctrl.searchText)" md-item-text="item.display" md-min-length="0" placeholder="Search">
                        <md-item-template>
                            <span md-highlight-text="ctrl.searchText" md-highlight-flags="^i">{{item.display}}</span>
                        </md-item-template>
                        <md-not-found>
                            No matches found for "{{ctrl.searchText}}".
                        </md-not-found>
                    </md-autocomplete>
                </form>
            </div>

            <div class="mdl-layout-spacer"></div>
            <nav class="mdl-navigation">
            <div ng-controller="addArticleControl">
                <a id ="add" class="mdl-navigation__link material-icons material-icons-header" ng-click="showAdvanced($event)" href="">add_circle</a></div>
                <div class="mdl-tooltip" for="add">
                    Add
                </div>
                
                <div ng-controller="godControl" class="">
                    <a id="godMode" class="material-icons material-icons-header mdl-navigation__link" ng-click="showGod($event)" flex flex-md="100">
                        flash_on
                    </a>
                </div>
                <div class="mdl-tooltip" for="godMode">
                    God Mode
                </div>

                <a id="calendar" ng-controller="addCalendarControl" class="mdl-navigation__link material-icons material-icons-header" href="" ng-click="showAdvanced($event)">insert_invitation</a>
                <div class="mdl-tooltip" for="calendar">
                    Calendar
                </div>


                
                <div ng-controller="accountSetControl" class="">
                    <a id="accountSet" class="material-icons material-icons-header mdl-navigation__link" ng-click="showAdvanced($event)" flex flex-md="100">
                        account_circle
                    </a>
                </div>
                <div class="mdl-tooltip" for="accountSet">
                    Account Settings
                </div>
            </nav>
        </div>
    </header>

        <script type="text/ng-template" id="dialog1.tmpl.html"><md-dialog aria-label="Mango (Fruit)">
                <form>
                    <md-toolbar>
                        <div class="md-toolbar-tools" >
                            <span class="material-icons mdl-js-ripple-effect" style="font-size: 42px; margin-right: 4px; color:#FFF;">account_box</span>
                            <h2>User Information</h2>
                            <span flex></span>
                            <md-button class="md-icon-button" ng-click="answer('not applicable')">
                                <md-icon md-svg-src="img/icons/ic_close_24px.svg" aria-label="Close dialog"></md-icon>
                            </md-button>
                        </div>
                    </md-toolbar>
                    <md-dialog-content>
                        <div>
                        Username : sduncan
                        <br>
                        First Name: Siobhan
                        <br>
                        Last Name: Duncan
                        <br>
                        Department: CSO-DBA
                        <br>
                        Location: Edinburgh


                        </div>
                    </md-dialog-content>
                    </div>
                </form>
                </md-dialog>
                </script>

<!--This is where the code needed for the dialogs is kept -->

<script type="text/ng-template" id="dialog2.tmpl.html">
    <md-dialog aria-label="Calendar" style="width:50%">
        <form style="overflow: hidden;">
            <div ng-controller="subCtrl">
                <md-toolbar>
                    <div class="md-toolbar-tools" style="background-color: rgb(63,81,181);" ng-init="populateTemp()">
                        <h2>Add An Article</h2>
                        <span flex></span>
                        <md-button class="md-icon-button" ng-click="answer('not applicable')">
                            <md-icon md-svg-src="img/icons/ic_close_24px.svg" aria-label="Close dialog"></md-icon>
                        </md-button>
                    </div>
                </md-toolbar>
                <md-dialog-content style="overflow:hidden">  
                    <md-content class="md-padding">
                        <div ng-controller="DemoCtrl" layout="column" class="inputdemoBasicUsage">
                            <md-content layout-padding="">
                                <form name="userForm">
                                    <div layout="" layout-sm="column" style="display: flex; flex-flow: column;">
                                        <md-input-container flex="">
                                            <label>Title</label>
                                            <input ng-model="user.firstName" class="add-tech-title">
                                        </md-input-container>

                                        <md-input-container flex>
                                            <label>Link <i class="material-icons" style="font-size: 18px;color:rgba(0, 0, 0, 0.258824);">link</i></label>
                                            <textarea ng-model="user.biography" class="add-tech-desc"></textarea>
                                        </md-input-container>
                                    </div>

                                </form>
                            </md-content>

                        </div>


                    </md-content>
                    <div class="md-actions" layout="row">
                        <md-button ng-click="answer('not useful')" class="md-primary">
                            Cancel
                        </md-button>
                        <md-button ng-click="answer('useful')" class="md-primary">
                            Add
                        </md-button>
                    </div>


                    </form>
                </md-dialog-content>
            </div>
        </form>
    </md-dialog>
</script>

<script type="text/ng-template" id="dialog5.tmpl.html">
    <md-dialog aria-label="Message" style="width:50%">
        <form style="overflow: hidden;">
            <div ng-controller="subCtrl">
                <md-toolbar>
                    <div class="md-toolbar-tools" style="background-color: rgb(63,81,181);" ng-init="populateTemp()">
                        <h2>Message Team</h2>
                        <span flex></span>
                        <md-button class="md-icon-button" ng-click="answer('not applicable')">
                            <md-icon md-svg-src="img/icons/ic_close_24px.svg" aria-label="Close dialog"></md-icon>
                        </md-button>
                    </div>
                </md-toolbar>
                <md-dialog-content style="overflow:hidden">  
                    <md-content class="md-padding">
                        <div ng-controller="DemoCtrl" layout="column" class="inputdemoBasicUsage">
                            <md-content layout-padding="">
                                <form name="userForm">
                                    <div layout="" layout-sm="column" style="display: flex; flex-flow: column;">
                                        <md-input-container flex="">
                                            <label>Subject</label>
                                            <input ng-model="user.firstName" class="add-tech-title">
                                        </md-input-container>


                                        <md-input-container flex>
                                            <label>Message</label>
                                            <textarea ng-model="user.biography" class="add-tech-desc"></textarea>
                                        </md-input-container>
                                    </div>

                                </form>
                            </md-content>

                        </div>


                    </md-content>
                    <div class="md-actions" layout="row">
                        <md-button ng-click="answer('not useful')" class="md-primary">
                            Cancel
                        </md-button>
                        <md-button ng-click="answer('useful')" class="md-primary">
                            Send
                        </md-button>
                    </div>


                    </form>
                </md-dialog-content>
            </div>
        </form>
    </md-dialog>
</script>

<script type="text/ng-template" id="dialog6.tmpl.html">
    <md-dialog aria-label="Message" style="width:50%">
        <form style="overflow: hidden;">
            <div ng-controller="subCtrl">
                <md-toolbar>
                    <div class="md-toolbar-tools" style="background-color: rgb(63,81,181);" ng-init="populateTemp()">
                        <h2>Contact Us</h2>
                        <span flex></span>
                        <md-button class="md-icon-button" ng-click="answer('not applicable')">
                            <md-icon md-svg-src="img/icons/ic_close_24px.svg" aria-label="Close dialog"></md-icon>
                        </md-button>
                    </div>
                </md-toolbar>
                <md-dialog-content style="overflow:hidden">  
                    <md-content class="md-padding">
                        <div ng-controller="DemoCtrl" layout="column" class="inputdemoBasicUsage">
                            <md-content layout-padding="">
                                <form name="userForm">
                                    <div layout="" layout-sm="column" style="display: flex; flex-flow: column;">
                                        <md-input-container flex="">
                                            <label>Team Name</label>
                                            <input ng-model="user.firstName" class="add-tech-title">
                                        </md-input-container>
                                        <md-input-container flex="">
                                            <label>Description of how your team uses this technology</label>
                                            <input ng-model="user.firstName" class="add-tech-title">
                                        </md-input-container>
                                        <md-input-container flex="">
                                            <label>Information about your team</label>
                                            <input ng-model="user.firstName" class="add-tech-title">
                                        </md-input-container>
                                    </div>
                                </form>
                            </md-content>
                        </div>
                    </md-content>
                    <div class="md-actions" layout="row">
                        <md-button ng-click="answer('not useful')" class="md-primary">
                            Cancel
                        </md-button>
                        <md-button ng-click="answer('useful')" class="md-primary">
                            Submit
                        </md-button>
                    </div>
                    </form>
                </md-dialog-content>
            </div>
        </form>
    </md-dialog>
</script>

<script type="text/ng-template" id="dialog7.tmpl.html">
    <md-dialog aria-label="Message" style="width:50%">
        <form style="overflow: hidden;">
            <div ng-controller="subCtrl">
                <md-toolbar>
                    <div class="md-toolbar-tools" style="background-color: rgb(63,81,181);" ng-init="populateTemp()">
                        <h2>How are we using this technology?</h2>
                        <span flex></span>
                        <md-button class="md-icon-button" ng-click="answer('not applicable')">
                            <md-icon md-svg-src="img/icons/ic_close_24px.svg" aria-label="Close dialog"></md-icon>
                        </md-button>
                    </div>
                </md-toolbar>
                <md-dialog-content style="overflow:hidden">  
                    <div  class="mdl-card__supporting-text mdl-card__supporting-text-tech" style="color:#000"> 
                            This is where each team would put information about how they use this particular technology. How is it used in their business as usual here at BlackRock and/or  within Aladdin. This information is volunteered by the group. etc......
                    </div>
                </md-dialog-content>
            </div>
        </form>
    </md-dialog>
</script>
<script type="text/ng-template" id="dialog8.tmpl.html">
    <md-dialog aria-label="Message" style="width:50%">
        <form style="overflow: hidden;">
            <div ng-controller="subCtrl">
                <md-toolbar>
                    <div class="md-toolbar-tools" style="background-color: rgb(63,81,181);" ng-init="populateTemp()">
                        <h2>Who are we?</h2>
                        <span flex></span>
                        <md-button class="md-icon-button" ng-click="answer('not applicable')">
                            <md-icon md-svg-src="img/icons/ic_close_24px.svg" aria-label="Close dialog"></md-icon>
                        </md-button>
                    </div>
                </md-toolbar>
                <md-dialog-content style="overflow:hidden">  
                
                  <div  class="mdl-card__supporting-text mdl-card__supporting-text-tech" style="color:#000"> This is where each team would put information about themselves. What they do for BlackRock and/or Aladdin. Who they are and where they work. etc......
                  </div>
                
                </md-dialog-content>
            </div>
        </form>
    </md-dialog>
</script>

<script type="text/ng-template" id="dialog9.tmpl.html">
    <md-dialog aria-label="Message" style="width:50%">
        <form style="overflow: hidden;">
            <div ng-controller="subCtrl">
                <md-toolbar>
                    <div class="md-toolbar-tools" style="background-color: rgb(63,81,181);" ng-init="populateTemp()">
                        <h2>Contact Us</h2>
                        <span flex></span>
                        <md-button class="md-icon-button" ng-click="answer('not applicable')">
                            <md-icon md-svg-src="img/icons/ic_close_24px.svg" aria-label="Close dialog"></md-icon>
                        </md-button>
                    </div>
                </md-toolbar>
                <md-dialog-content style="overflow:hidden">  
                    <md-content class="md-padding">
                        <div ng-controller="DemoCtrl" layout="column" class="inputdemoBasicUsage">
                            <md-content layout-padding="">
                                <form name="userForm">
                                    <div layout="" layout-sm="column" style="display: flex; flex-flow: column;">
                                        <md-input-container flex="">
                                            <label>Team Name</label>
                                            <input ng-model="user.firstName" class="add-tech-title">
                                        </md-input-container>
                                        <md-input-container flex="">
                                            <label>Description of how your team uses this technology</label>
                                            <input ng-model="user.firstName" class="add-tech-title">
                                        </md-input-container>
                                        <md-input-container flex="">
                                            <label>Information about your team</label>
                                            <input ng-model="user.firstName" class="add-tech-title">
                                        </md-input-container>
                                    </div>
                                </form>
                            </md-content>
                        </div>
                    </md-content>
                    <div class="md-actions" layout="row">
                        <md-button ng-click="answer('not useful')" class="md-primary">
                            Cancel
                        </md-button>
                        <md-button ng-click="answer('useful')" class="md-primary">
                            Submit
                        </md-button>
                    </div>
                    </form>
                </md-dialog-content>
            </div>
        </form>
    </md-dialog>
</script>
<script type="text/ng-template" id="dialog.tmpl.html"><md-dialog aria-label="Mango (Fruit)">
    <form>
        <md-toolbar>
            <div class="md-toolbar-tools" >
                
                <h2>Full List of Teams and their Technologies</h2>
                <span flex></span>
                <md-button class="md-icon-button" ng-click="answer('not applicable')">
                    <md-icon md-svg-src="img/icons/ic_close_24px.svg" aria-label="Close dialog"></md-icon>
                </md-button>
            </div>
        </md-toolbar>
        <md-dialog-content>
           <md-list ng-controller="godControl">
             <md-list-item class="md-3-line" ng-repeat="item in god">
             <span class="material-icons mdl-js-ripple-effect" style="font-size: 42px; margin-right: 4px; color:#3F51B5;">account_box</span>
                <div class="md-list-item-text">
                  <h3>{{item.division}}</h3>
                  <h4>{{item.team}}</h4>
                  <p>{{item.technologies}}</p>
                </div>
                <md-divider ng-if="!$last"></md-divider>
              </md-list-item>
            </md-list>
        </md-dialog-content>
        </div>
    </form>
    </md-dialog>
    </script>

    <main class="mdl-layout__content">
        <div class="mainContainer">

            <div class="mdl-card mdl-shadow--8dp">
                <div class="mdl-card__title">
                <span class="material-icons mdl-js-ripple-effect" style="font-size: 42px;">developer_board</span>
                    <h2 class="mdl-card__title-text mdl-card__title-text-tech"> ${technology.title}</h2>
                </div>
                <div class="mdl-card__menu">
                     <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect" ng-click="techBool = !techBool">
                        <i id="teamButton" class="material-icons mdl-js-ripple-effect" ng-show="techBool">keyboard_arrow_left</i>
                        <i id="teamButton" class="material-icons mdl-js-ripple-effect" ng-show="!techBool">keyboard_arrow_down</i>
                    </button>
                    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect" ng-click="sub1 = !sub1">
                        <i class="material-icons mdl-js-ripple-effect" ng-show="!sub1">favorite_border</i>
                        <i class="material-icons mdl-js-ripple-effect" ng-show="sub1">favorite</i>
                    </button>
                </div>
                <div id="tech" style=" display: initial;">
                <div ng-show="!techBool"> 
                <div  class="mdl-card__supporting-text mdl-card__supporting-text-tech"> 
                            ${technology.description}                </div>
                <div class="mdl-card__actions mdl-card--border">
                    <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
                        More Info...
                    </a>
                </div>
                </div>
                </div>

            </div>

            <div class="mdl-card mdl-card--border mdl-shadow--8dp" ng-controller="teamControl">
                <div class="mdl-card__title">
                    <span class="material-icons mdl-js-ripple-effect" style="font-size: 42px;">group</span>
                    <h2 class="mdl-card__title-text" style="font-size: 34px;">Teams </h2>
                </div>
                <div class="mdl-card__menu">
                    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect" ng-click="teamBool = !teamBool">
                        <i id="teamButton" class="material-icons mdl-js-ripple-effect" ng-show="!teamBool">keyboard_arrow_left</i>
                        <i id="teamButton" class="material-icons mdl-js-ripple-effect" ng-show="teamBool">keyboard_arrow_down</i>
                    </button>
                    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect"ng-click="showAdd($event)">
                        <i class="material-icons mdl-js-ripple-effect">mode_edit</i>
                    </button>
                </div>
                <div id="Teams" ng-show="teamBool">
         
                <table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp" style="width: 98%;margin: auto;margin-bottom:8px;">
                    <tbody>
                   <c:forEach  items="${technology.teamsUsingTechnology}" var="team">
                           <tr>
                        <td class="mdl-data-table__cell--non-numeric">${team.name}</td>
                        <td class="mdl-data-table__cell">
			      	<span>
			      		<a href="" class="material-icons mdl-js-ripple-effect" style="font-size: 30px;vertical-align: top;text-decoration: blink;" ng-click="showMessage($event)">chat</a>
			      		<a href="" class="material-icons mdl-js-ripple-effect" style="font-size: 30px;vertical-align: top;text-decoration: blink;" ng-click="showDesc($event)">description</a>
						<a href="" class="material-icons mdl-js-ripple-effect" style="font-size: 30px;vertical-align: top;text-decoration: blink;" ng-click="showInfo($event)">info</a>
			      	</span>
                        </td>
                    </tr>
				</c:forEach >
                
                   
                </table>
                <div class="mdl-card__actions mdl-card--border">
                    <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" style="float: right;">
                        More...
                    </a>
                </div>
                </div>

            </div>

            <div class="mdl-card mdl-card--border mdl-shadow--8dp" ng-controller="addCalendarControl">
                <div class="mdl-card__title">
                    <span class="material-icons mdl-js-ripple-effect" style="font-size: 42px;">event</span>
                    <h2 class="mdl-card__title-text" style="font-size: 34px;">Events</h2>
                </div>
                <div class="mdl-card__menu">
                    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect" ng-click="eventBool = !eventBool" >
                        <i id="eventButton" class="material-icons mdl-js-ripple-effect" ng-show="!eventBool">keyboard_arrow_left</i>
                        <i id="eventButton" class="material-icons mdl-js-ripple-effect" ng-show="eventBool">keyboard_arrow_down</i>
                    </button>

                    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect" ng-click="addEvent($event)">
                        <i class="material-icons mdl-js-ripple-effect">mode_edit</i>
                    </button>
                </div>
                <div id="Events" ng-show="eventBool">
                
                <table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp" style="width: 98%;margin: auto;<!-- background-color: whitesmoke; -->margin-bottom:8px;">
                    <tbody>
                   <c:forEach  items="${technology.eventsForTechnology}" var="event">
                    
                    <tr>
                        <td class="mdl-data-table__cell--non-numeric">${event.name}|${event.place}|${event.readableDate}</td>
                        <td class="mdl-data-table__cell">
			      	<span>
			      		<a href="" class="material-icons mdl-js-ripple-effect" style="font-size: 30px;vertical-align: top;text-decoration: blink;" ng-click="">event</a>
			      		<a href="" class="material-icons mdl-js-ripple-effect" style="font-size: 30px;vertical-align: top;text-decoration: blink;">people</a>
			      	</span>
                        </td>
                    </tr>
                    </c:forEach >
                    </tbody>
                </table>
                <div class="mdl-card__actions mdl-card--border">
                    <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" style="float: right;">
                        More...
                    </a>
                </div>
                </div>
            </div>

            <div class="mdl-card mdl-card--border mdl-shadow--8dp" ng-controller="addArticleControl">
                <div class="mdl-card__title">
                    <span class="material-icons mdl-js-ripple-effect" style="font-size: 42px;">subtitles</span>
                    <h2 class="mdl-card__title-text" style="font-size: 34px;">Articles </h2>
                </div>
                <div class="mdl-card__menu">
                    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect" ng-click="artBool = !artBool" >
                        <i class="material-icons mdl-js-ripple-effect" ng-show="artBool">keyboard_arrow_left</i>
                        <i class="material-icons mdl-js-ripple-effect" ng-show="!artBool">keyboard_arrow_down</i>
                    </button>

                    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect" ng-click="showAdvanced($event)" >
                        <i class="material-icons mdl-js-ripple-effect">mode_edit</i>
                    </button>

                </div>
                <div class="cardContainer" ng-show="!artBool">
                    <div class="mdl-grid">

                      <c:forEach  items="${technology.relatedArticles}" var="article">
                        <div class="mdl-cell mdl-cell--4-col">
                             <div class="mdl-card mdl-shadow--8dp">
                                <div class="mdl-card__title">
                                    
                                    <div style="width:90%">
                                        <h2 class="mdl-card__title-text" style="font-size:25px">${article.title}</h2>
                                    </div>
                                    <div style="width:10%">
                                        <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect" ng-click="sub = !sub">
                                            <i class="material-icons mdl-js-ripple-effect" ng-show="!sub">favorite_border</i>
                                            <i class="material-icons mdl-js-ripple-effect" ng-show="sub">favorite</i>
                                        </button>
                                    </div>
                                    
                                </div> 

                                <div class="mdl-card__supporting-text">
                                ${article.summary}
                                </div>
                                <div class="mdl-card__actions mdl-card--border">
                                    <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" href="${article.link}">
                                        More Info...
                                    </a>
                                </div>
                            </div>
                        </div>
					   </c:forEach>
                   </div>
			</div>
        </div>
	</div>
<script type="text/ng-template" id="dialog3.tmpl.html">
    <md-dialog aria-label="Calendar" style="width:50%">
        <form>
                <md-dialog-content style="overflow:hidden">  
                    <div ng-include="'../../../resources/core/calendar.html'">
                    </div>

                    <div class="md-actions" layout="row">
                        <md-button ng-click="answer('not useful')" class="md-primary">
                            Close
                        </md-button>
                    </div>
                </md-dialog-content>
            </div>
        </form>
    </md-dialog>
</script>

</main>

</div>
<script src='https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.js'></script>
<script src='https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-animate.min.js'></script>
<script src='https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-route.min.js'></script>
<script src='https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-aria.min.js'></script>
<script src='https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-messages.min.js'></script>
<script src='http://cdn.rawgit.com/angular/bower-material/v0.10.0/angular-material.js'></script>
<script src='https://s3-us-west-2.amazonaws.com/s.cdpn.io/t-114/assets-cache.js'></script>


    <script src="//code.jquery.com/jquery-1.10.2.js"></script>
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    <script src="../../../resources/core/js/searchJ.js"></script>
    <script src="../../../resources/core/js/add.js"></script>
    <script src="../../../resources/core/js/tag.js"></script>
    <script src="../../../resources/core/js/dialog.js"></script>
    <script src="../../../resources/core/js/techSubCtrl.js"></script>
    <script src="../../../resources/core/js/autocompleteSearch.js"></script>
</body>
</html>