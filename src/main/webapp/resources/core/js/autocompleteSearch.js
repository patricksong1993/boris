/**
 * Created by Baisheng on 04/08/15.
 */
(function () {
    'use strict';
    var app = angular
        .module('MyApp');
    
    app.directive('ngEnter', function () {
        return function (scope, element, attrs) {
            element.bind("keydown keypress", function (event) {
                if(event.which === 13) {
                    scope.$apply(function (){
                        scope.$eval(attrs.ngEnter);
                    });

                    event.preventDefault();
                }
            });
        };
    });
        app.controller('SearchCtrl', ['$timeout','$q','$log','$http','$scope','$window',DemoCtrl]);

    function DemoCtrl ($timeout, $q, $log,$http,$scope,$window) {
        var self = this;

        self.simulateQuery = false;
        self.isDisabled    = false;

        // list of `state` value/display objects
        self.states        = loadAll();
        self.querySearch   = querySearch;
        self.selectedItemChange = selectedItemChange;
        self.searchTextChange   = searchTextChange;
        self.inputValue = "";
        $scope.myFunct = function(keyEvent) {
        	  if (keyEvent.which === 13){
        		  var id ;
              		angular.forEach(self.states , function(technology , key) {
              			if(technology.value == self.inputValue){
              				id = technology.id;
              			}
              		});
              		$window.location.href = '/technology/'+  id ;
        	  }
        	}
        // ******************************
        // Internal methods
        // ******************************

        /**
         * Search for states... use $timeout to simulate
         * remote dataservice call.
         */
        function querySearch (query) {
            var results = query ? self.states.filter( createFilterFor(query) ) : self.states,
                deferred;
            if (self.simulateQuery) {
                deferred = $q.defer();
                $timeout(function () { deferred.resolve( results ); }, Math.random() * 1000, false);
                return deferred.promise;
            } else {
                return results;
            }
        }

        function searchTextChange(text) {
        	 self.inputValue = text;
        }

        function selectedItemChange(item) {
        	self.inputValue = item.value;
        }

        /**
         * Build `states` list of key/value pairs
         */
        function loadAll() {
        	var allTechnologies = []	;
        	$http.get('/technologies').success(function(response) {
        		angular.forEach(response, function(value, key) {
        			var technology = {};
        			technology.id = value.refId;
        			technology.title = value.title;
        			allTechnologies.push(technology);
        			});
        		
        		var result = []	;
        		angular.forEach(allTechnologies, function(value, key) {
        			if( value.title != null){
        			var toAdd =  {
                            value: value.title.toLowerCase(),
                            display: value.title,
                            id: value.id
                        };
        			result.push(toAdd);
        			}
        			});
        		self.states = result;
        		
        		}).error(function(data, status, headers, config) {
                    alert(status);
                });
         
        }

        /**
         * Create filter function for a query string
         */
        function createFilterFor(query) {
            var lowercaseQuery = angular.lowercase(query);

            return function filterFn(state) {
                return (state.value.indexOf(lowercaseQuery) === 0);
            };

        }
        
        function gogo(keyEvent) {
        	 alert("GJ");
        	}
        function goToTechPage(){
        	alert("success");
        }
    }
})();
