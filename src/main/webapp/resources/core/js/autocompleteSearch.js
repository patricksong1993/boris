/**
 * Created by Baisheng on 04/08/15.
 */
(function () {
    'use strict';
    angular
        .module('MyApp')
        .controller('SearchCtrl', ['$timeout','$q','$log','$http',DemoCtrl]);

    function DemoCtrl ($timeout, $q, $log,$http) {
        var self = this;

        self.simulateQuery = false;
        self.isDisabled    = false;

        // list of `state` value/display objects
        self.states        = loadAll();
        self.querySearch   = querySearch;
        self.selectedItemChange = selectedItemChange;
        self.searchTextChange   = searchTextChange;

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
            $log.info('Text changed to ' + text);
        }

        function selectedItemChange(item) {
            $log.info('Item changed to ' + JSON.stringify(item));
        }

        /**
         * Build `states` list of key/value pairs
         */
        function loadAll() {
        	var allTechnologies = []	;
        	$http.get('/boris/technologies').success(function(response) {
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
                            display: value.title
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
    }
})();
