<!DOCTYPE html>
<html lang="en">
<head>
    <script src="/resources/core/bower_components/jquery/dist/jquery.js"></script>
    <script src="/resources/core/bower_components/material-design-lite/material.js"></script>
    <link rel="stylesheet" href="/resources/core/bower_components/angular-material/angular-material.css">
    <link rel="stylesheet" href="/resources/core/bower_components/material-design-lite/material.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://storage.googleapis.com/code.getmdl.io/1.0.2/material.indigo-purple.min.css" />
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">



    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=RobotoDraft:300,400,500,700,400italic">
    <link rel="stylesheet" href="/resources/core/css/boris.css">
    <link rel="stylesheet" href="/resources/core/css/style.css">
    <link rel="stylesheet" href="/resources/core/css/animate.css">



    <meta charset="UTF-8">
    <title>Boris</title>
    
   	
</head>
<body ng-app="MyApp" ng-controller="AJAXCtrl">

<script>
   
        </script>

<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
    <header class="mdl-layout__header">
        <div class="mdl-layout__header-row">

            <img src="/resources/core/img/logo_white.png" alt="Boris_logo" style="height: 30px;">
            <div class="mdl-layout-spacer"></div>
            <nav class="mdl-navigation ">


                <!-- Notifications and menue -->
                <div class="md-menu-demo menudemoBasicUsage" ng-controller="NotificationCtrl as ctrl" ng-app="MyApp">

                  <div class="menu-demo-container" layout-align="center center" layout="column" style="top:58px;left:430px;">
                    <md-menu>
                      <a aria-label="Open phone interactions menu" class="material-icons material-icons-header mdl-navigation__link" ng-click="ctrl.openMenu($mdOpenMenu, $event)">
                        notifications</a>
                      </md-button>

                      <md-menu-content width="4">

                        <md-menu-item>
                          <md-button ng-click="item.function">
                            <i class="material-icons notification-icon">group</i>
                            New AngularJs Team link!
                          </md-button>
                        </md-menu-item>

                        <md-menu-item>
                          <md-button ng-click="item.function">
                            <i class="material-icons notification-icon">event</i>
                            New AngularJs Event added!
                          </md-button>
                        </md-menu-item>

                        <md-menu-item>
                          <md-button ng-click="item.function">
                            <i class="material-icons notification-icon">subtitles</i>
                            New AngularJs Article added
                          </md-button>
                        </md-menu-item>

                      </md-menu-content>
                    </md-menu>
                  </div>
                </div>

                <!-- rest of the toolbar -->
                <div class="mdl-tooltip" for="add">
                    Add Article/Event
                </div>
                <div >
                    <a id="subscriptions" class="material-icons material-icons-header mdl-navigation__link" ng-click="filterTrending()" flex flex-md="100">
                        dashboard
                    </a>
                </div>
                <div class="mdl-tooltip" for="subscriptionFeed">
                    Subscription Feed
                </div>

                <div class="mdl-tooltip" for="godMode">
                    God Mode
                </div>

                <div ng-controller="addArticleControl" class="">
                    <a id="addArticle" class="material-icons material-icons-header mdl-navigation__link" ng-click="showAdvanced($event)" flex flex-md="100">
                        add_circle
                    </a>
                </div>

                <div ng-controller="godControl" class="">
                    <a id="godMode" class="material-icons material-icons-header mdl-navigation__link" ng-click="showGod($event)" flex flex-md="100">
                        flash_on
                    </a>
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

                <script type="text/ng-template" id="dialog1.tmpl.html"><md-dialog aria-label="Mango (Fruit)">
                <form>
                    <md-toolbar>
                        <div class="md-toolbar-tools">
                            <span class="material-icons mdl-js-ripple-effect" style="font-size: 42px; margin-right: 4px; color:#FFF">account_box</span>
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
                <script type="text/ng-template" id="dialog2.tmpl.html"><md-dialog aria-label="Mango (Fruit)" style="width: 90%">
                <form>
                    <md-toolbar>
                        <div class="md-toolbar-tools">
                            <h2>Add New Technology</h2>
                            <span flex></span>
                            <md-button class="md-icon-button" ng-click="answer('not applicable')">
                                <md-icon md-svg-src="img/icons/ic_close_24px.svg" aria-label="Close dialog"></md-icon>
                            </md-button>
                        </div>
                    </md-toolbar>
                    <md-dialog-content>
                        <div>

                            <div>
                                <md-content class="md-padding">
                                    <md-content class="md-padding">
                                        <div ng-controller="DemoCtrl" layout="column" class="inputdemoBasicUsage" ng-app="MyApp">



                                            <md-content layout-padding="">
                                                <form name="userForm">



                                                    <div layout="" layout-sm="column" style="display: flex; flex-flow: column;">
                                                        <md-input-container flex="">
                                                            <label>Title</label>
                                                            <input ng-model="user.firstName" class="add-tech-title">
                                                        </md-input-container>


                                                        <md-input-container flex>
                                                            <label>Description</label>
                                                            <textarea ng-model="user.biography" class="add-tech-desc"></textarea>
                                                        </md-input-container>


                                                        <div ng-controller="CustomInputDemoCtrl as ctrl"    class="chipsdemoCustomInputs" ng-app="MyApp">
                                                            <md-chips ng-model="ctrl.selectedVegetables" md-autocomplete-snap="" md-require-match="">
                                                                <md-autocomplete md-selected-item="ctrl.selectedItem" md-search-text="ctrl.searchText" md-items="item in ctrl.querySearch(ctrl.searchText)" md-item-text="item.name" placeholder="Add a category">
                                                                    <span md-highlight-text="ctrl.searchText">{{item.name}}</span>
                                                                </md-autocomplete>
                                                                <md-chip-template>
                                                                                        <span>
                                                                                          <strong>{{$chip.name}}</strong>
                                                                                        </span>
                                                                </md-chip-template>
                                                            </md-chips>
                                                        </div>
                                                    </div>

                                                </form>
                                            </md-content>

                                        </div>


                                    </md-content>




                                </md-content>
                            </div>
                        </div>
                    </md-dialog-content>

                    <div class="md-actions" layout="row">
                        <md-button ng-click="answer('not useful')" class="md-primary">
                            Cancel
                        </md-button>
                        <md-button ng-click="answer('useful')" class="md-primary">
                            Add
                        </md-button>
                    </div>
                </form>
                </md-dialog>
                </script>

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



                <div class="mdl-tooltip" for="accountSet">
                    Account Settings
                </div>
            </nav>
        </div>
    </header>
    <main class="mdl-layout__content">
        <div class="mainContainer">

            <div ng-controller="SearchCtrl as ctrl" layout="column" class="autocompletedemoBasicUsage" style="margin-top: 15px">
                        <form ng-submit="$event.preventDefault()">
                            <md-autocomplete  ng-keypress="myFunct($event)"ng-disabled="ctrl.isDisabled" md-no-cache="ctrl.noCache" md-selected-item="ctrl.selectedItem" md-search-text-change="ctrl.searchTextChange(ctrl.searchText)" md-search-text="ctrl.searchText" md-selected-item-change="ctrl.selectedItemChange(item)" md-items="item in ctrl.querySearch(ctrl.searchText)" md-item-text="item.display" md-min-length="0" placeholder="Search">
                                <md-item-template>
                                    <span md-highlight-text="ctrl.searchText" md-highlight-flags="^i"  >{{item.display}}</span>
                                </md-item-template>
                                <md-not-found>
                                    No matches found for "{{ctrl.searchText}}".
                                </md-not-found>
                            </md-autocomplete>
                        </form>
                </div>

            <!--</div>-->
            
            <div class="cardContainer" id="cardContainer" >
                <div class="mdl-grid">
                    <div class="mdl-cell mdl-cell--4-col" ng-repeat="value in myData | filter:{subscribed:subFilter}">
                        <div class="mdl-card mdl-shadow--8dp" >
                                                                    
                            <div class="mdl-card__title" style="padding-top: 16px; border-bottom-width: 15px; border-color: black">
                                 <h2 class="mdl-card__title-text" >{{value.title}}</h2>
                            </div>
                                              
                          <div class="mdl-card__supporting-text">
                               {{value.description}}
                          </div>
                                              
                          <div class="mdl-card__actions mdl-card--border">
                            <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" href="technology/{{value.refId}}">  Read More ...</a>
                          </div>
                                              
                          <div class="mdl-card__menu">
                            <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect" ng-click="sub($index)">
                                <i class="material-icons" ng-if="value.subscribed == 'true'">favorite</i>
                                <i class="material-icons" ng-if="value.subscribed == 'false'">favorite_border</i>
                            </button> 
                          </div> 
                          
                        </div>
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

<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

    

<script src='http://cdn.rawgit.com/angular/bower-material/v0.10.0/angular-material.js'></script>
<script src='https://s3-us-west-2.amazonaws.com/s.cdpn.io/t-114/assets-cache.js'></script>
<script src="/resources/core/js/dialog.js"></script>
<script src="/resources/core/js/add.js"></script>
<script src="/resources/core/js/tag.js"></script>
<script src="/resources/core/js/autocompleteSearch.js"></script>
<script src="/resources/core/js/test.js"></script>
<script src="/resources/core/js/searchJ.js"></script>


</body>
</html>