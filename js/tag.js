/**
 * Created by Baisheng on 04/08/15.
 */
(function () {
    'use strict';
    angular
        .module('MyApp')
        .controller('CustomInputDemoCtrl', DemoCtrl);

    function DemoCtrl ($timeout, $q) {
        var self = this;

        self.readonly = false;
        self.selectedItem = null;
        self.searchText = null;
        self.querySearch = querySearch;
        self.vegetables = loadVegetables();
        self.selectedVegetables = [];
        self.numberChips = [];
        self.numberChips2 = [];
        self.numberBuffer = '';

        /**
         * Search for vegetables.
         */
        function querySearch (query) {
            var results = query ? self.vegetables.filter(createFilterFor(query)) : [];
            return results;
        }

        /**
         * Create filter function for a query string
         */
        function createFilterFor(query) {
            var lowercaseQuery = angular.lowercase(query);

            return function filterFn(vegetable) {
                return (vegetable._lowername.indexOf(lowercaseQuery) === 0);
            };

        }

        function loadVegetables() {
            var veggies = [
                {
                    'name': 'Web Components',
                },
                {
                    'name': 'Distributed Databases',
                },
                {
                    'name': 'Programming Languages',
                },
                {
                    'name': 'Scripting Languages',
                },
                {
                    'name': 'Web Frameworks',
                },
                {
                    'name': 'Machine Learning',
                },
                {
                    'name': 'Distributed Systems',
                },
                {
                    'name': 'Algorithms',
                }
            ];

            return veggies.map(function (veg) {
                veg._lowername = veg.name.toLowerCase();
                return veg;
            });
        }
    }
})();
