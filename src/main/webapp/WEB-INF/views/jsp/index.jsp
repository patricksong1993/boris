<!DOCTYPE html>
<html lang="en">
<head>
    <script src="/boris/resources/core/bower_components/jquery/dist/jquery.js"></script>
    <script src="/boris/resources/core/bower_components/material-design-lite/material.js"></script>
    <link rel="stylesheet" href="/boris/resources/core/bower_components/angular-material/angular-material.css">
    <link rel="stylesheet" href="/boris/resources/core/bower_components/material-design-lite/material.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://storage.googleapis.com/code.getmdl.io/1.0.2/material.indigo-purple.min.css" />
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">


    <script src="//code.jquery.com/jquery-1.10.2.js"></script>
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    <script src="/boris/resources/core/js/searchJ.js"></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=RobotoDraft:300,400,500,700,400italic">
    <link rel="stylesheet" href="/boris/resources/core/css/boris.css">

    <meta charset="UTF-8">
    <title>Boris</title>
    
   	
</head>
<body ng-app="MyApp" ng-controller="AJAXCtrl">

<script>
   
        </script>

<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
    <header class="mdl-layout__header">
        <div class="mdl-layout__header-row">

            <img src="/boris/resources/core/img/logo_white.png" alt="Boris_logo" style="height: 30px;">
            <div class="mdl-layout-spacer"></div>
            <nav class="mdl-navigation ">

                <div class="mdl-tooltip" for="add">
                    Add Article/Event
                </div><!-- 
                <div ng-controller="AJAXCtrl"> -->
                <button id="subscriptionFeed" class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect" ng-click="filterTrending()">A</button><!-- </div> -->
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

                <div ng-controller="addArticleControl" class="">
                    <a id="godMode" class="material-icons material-icons-header mdl-navigation__link" ng-click="showAdvanced($event)" flex flex-md="100">
                        flash_on
                    </a>
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
                            <md-autocomplete  ng-disabled="ctrl.isDisabled" md-no-cache="ctrl.noCache" md-selected-item="ctrl.selectedItem" md-search-text-change="ctrl.searchTextChange(ctrl.searchText)" md-search-text="ctrl.searchText" md-selected-item-change="ctrl.selectedItemChange(item)" md-items="item in ctrl.querySearch(ctrl.searchText)" md-item-text="item.display" md-min-length="0" placeholder="Search">
                                <md-item-template href="/boris/technology/{{item.id}}">
                                    <span md-highlight-text="ctrl.searchText" md-highlight-flags="^i" >{{item.display}}</span>
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
                            <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">  Read More ...</a>
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
<script src='http://cdn.rawgit.com/angular/bower-material/v0.10.0/angular-material.js'></script>
<script src='https://s3-us-west-2.amazonaws.com/s.cdpn.io/t-114/assets-cache.js'></script>
<script src="/boris/resources/core/js/dialog.js"></script>
<script src="/boris/resources/core/js/add.js"></script>
<script src="/boris/resources/core/js/tag.js"></script>
<script src="/boris/resources/core/js/autocompleteSearch.js"></script>
<script src="/boris/resources/core/js/test.js"></script>


</body>
</html>