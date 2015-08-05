
(function () {
    'use strict';
    angular
        .module('MyApp')
        .controller('DemoCtrl', DemoCtrl);

    function DemoCtrl ($timeout, $q, $log,$http) {
        var self = this;

        self.simulateQuery = false;
        self.isDisabled    = false;

        self.repos         = loadAll();
        self.querySearch   = querySearch;
        self.selectedItemChange loadAll= selectedItemChange;
        self.searchTextChange   = searchTextChange;

        // ******************************
        // Internal methods
        // ******************************

        /**
         * Search for repos... use $timeout to simulate
         * remote dataservice call.
         */
        function querySearch (query) {
            var results = query ? self.repos.filter( createFilterFor(query) ) : self.repos,
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
         * Build `components` list of key/value pairs
         */
        function loadAll() {
        	var repos = []	;
        	$http.get('/technologies').success(function(response) {
        		angular.forEach(response, function(value, key) {
        			var technology = {};
        			technology.id = value.refId;
        			technology.title = value.title;
        			alert(technology.title);
        			repos.push(technology);
        			});
        		});
            return repos.map( function (repo) {
                repo.value = repo.title.toLowerCase();
                return repo;
            });
        }

        /**
         * Create filter function for a query string
         */
        function createFilterFor(query) {
            var lowercaseQuery = angular.lowercase(query);

            return function filterFn(item) {
                return (item.value.indexOf(lowercaseQuery) === 0);
            };

        }
    }
})();
