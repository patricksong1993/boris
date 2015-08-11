<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <script src="/boris/resources/core/bower_components/jquery/dist/jquery.js"></script>
    <script src="/boris/resources/core/bower_components/material-design-lite/material.js"></script>
    <link rel="stylesheet" href="/boris/resources/core/bower_components/angular-material/angular-material.css">
    <link rel="stylesheet" href="/boris/resources/core/bower_components/material-design-lite/material.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://storage.googleapis.com/code.getmdl.io/1.0.2/material.indigo-purple.min.css" /> 
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
    
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=RobotoDraft:300,400,500,700,400italic">
    <link rel="stylesheet" href="/boris/resources/core/css/boris.css">
    <meta charset="UTF-8">
    <title>Bower</title>
</head>
<body ng-app="MyApp">

<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
    <header class="mdl-layout__header">
        <div class="mdl-layout__header-row">
            <img src="/boris/resources/core/img/logo_white.png" alt="Boris_logo" style="height: 30px;">

            <div class="mdl-layout-spacer"></div>

            <div ng-controller="SearchCtrl as ctrl" layout="column" class="autocompletedemoBasicUsage" style="width: 75%;">
                <form ng-submit="$event.preventDefault()">
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
            <nav class="mdl-navigation ">

                <a id ="add" class="mdl-navigation__link material-icons material-icons-header" href="">add_circle</a>
                <div class="mdl-tooltip" for="add">
                    Add
                </div>
                <a id="subscriptionFeed" class="mdl-navigation__link material-icons material-icons-header" href="">dashboard</a>
                <div class="mdl-tooltip" for="subscriptionFeed">
                    Subscription Feed
                </div>
                <a id="godMode" class="mdl-navigation__link material-icons material-icons-header" href="">flash_on</a>
                <div class="mdl-tooltip" for="godMode">
                    God Mode
                </div>
                <a id= "accountSet" class="mdl-navigation__link material-icons material-icons-header" href="">account_circle</a>
                <div class="mdl-tooltip" for="accountSet">
                    Account Settings
                </div>
            </nav>
        </div>
    </header>
    <main class="mdl-layout__content">
        <div class="mainContainer">

            <div class="mdl-card mdl-shadow--8dp">
                <div class="mdl-card__title">
                <span class="material-icons mdl-js-ripple-effect" style="font-size: 42px;">developer_board</span>
                    <h2 class="mdl-card__title-text mdl-card__title-text-tech"> ${technology.title}</h2>
                </div>
                <div class="mdl-card__menu">
                    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect" onclick="hideTech()">
                        <i id="techButton" class="material-icons mdl-js-ripple-effect">keyboard_arrow_down</i>
                    </button>
                    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect" >
                        <i  class="material-icons mdl-js-ripple-effect">favorite_border</i>
                    </button>
                </div>
                <div id="tech" style=" display: initial;">
                <div  class="mdl-card__supporting-text mdl-card__supporting-text-tech">
                            ${technologyDescr}                </div>
                <div class="mdl-card__actions mdl-card--border">
                    <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect"  style="float: right;">
                        More...
                    </a>
                </div>
                </div>

            </div>

            <div class="mdl-card mdl-card--border mdl-shadow--8dp" >
                <div class="mdl-card__title">
                    <span class="material-icons mdl-js-ripple-effect" style="font-size: 42px;">group</span>
                    <h2 class="mdl-card__title-text" style="font-size: 34px;">Teams </h2>
                </div>
                <div class="mdl-card__menu">
                    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect" onclick="hideTeams()">
                        <i id="teamButton" class="material-icons mdl-js-ripple-effect">keyboard_arrow_left</i>
                    </button>
                    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
                        <i class="material-icons mdl-js-ripple-effect">mode_edit</i>
                    </button>
                </div>
                <div id="Teams">
         
                <table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp" style="width: 98%;margin: auto;margin-bottom:8px;">
                    <tbody>
                   <c:forEach  items="${technology.teamsUsingTechnology}" var="team">
                           <tr>
                        <td class="mdl-data-table__cell--non-numeric">${team.name}</td>
                        <td class="mdl-data-table__cell">
			      	<span>
			      		<a href="" class="material-icons mdl-js-ripple-effect" style="font-size: 30px;vertical-align: top;text-decoration: blink;">chat</a>
			      		<a href="" class="material-icons mdl-js-ripple-effect" style="font-size: 30px;vertical-align: top;text-decoration: blink;">description</a>
						<a href="" class="material-icons mdl-js-ripple-effect" style="font-size: 30px;vertical-align: top;text-decoration: blink;">info</a>
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

            <div class="mdl-card mdl-card--border mdl-shadow--8dp" >
                <div class="mdl-card__title">
                    <span class="material-icons mdl-js-ripple-effect" style="font-size: 42px;">event</span>
                    <h2 class="mdl-card__title-text" style="font-size: 34px;">Events</h2>
                </div>
                <div class="mdl-card__menu">
                    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect" onclick="hideEvents()" >
                        <i id="eventButton" class="material-icons mdl-js-ripple-effect">keyboard_arrow_left</i>
                    </button>
                    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
                        <i class="material-icons mdl-js-ripple-effect">insert_invitation</i>
                    </button>
                </div>
                <div id="Events">
                
                <table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp" style="width: 98%;margin: auto;<!-- background-color: whitesmoke; -->margin-bottom:8px;">
                    <tbody>
                   <c:forEach  items="${technology.eventsForTechnology}" var="event">
                    
                    <tr>
                        <td class="mdl-data-table__cell--non-numeric">${event.name}|${event.place}|${event.readableDate}</td>
                        <td class="mdl-data-table__cell">
			      	<span>
			      		<a href="" class="material-icons mdl-js-ripple-effect" style="font-size: 30px;vertical-align: top;text-decoration: blink;">event</a>
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

            <div class="mdl-card mdl-card--border mdl-shadow--8dp" >
                <div class="mdl-card__title">
                    <span class="material-icons mdl-js-ripple-effect" style="font-size: 42px;">subtitles</span>
                    <h2 class="mdl-card__title-text" style="font-size: 34px;">Articles </h2>
                </div>
                <div class="mdl-card__menu">
                    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
                        <i class="material-icons mdl-js-ripple-effect">mode_edit</i>
                    </button>
                </div>
                <div class="cardContainer">
                    <div class="mdl-grid">

                      <c:forEach  items="${technology.relatedArticles}" var="article">
                        <div class="mdl-cell mdl-cell--4-col">
                             <div class="mdl-card mdl-shadow--8dp">
                                <div class="mdl-card__title">
                                    
                                    <div style="width:90%">
                                        <h2 class="mdl-card__title-text ">${article.title}</h2>
                                    </div>
                                    <div style="width:10%" ng-controller="subCtrl">
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

    <script src="/boris/resources/core/js/searchJ.js"></script>

    <script src="/boris/resources/core/js/techSubCtrl.js"></script>
    <script src="/boris/resources/core/js/autocompleteSearch.js"></script>
</body>
</html>