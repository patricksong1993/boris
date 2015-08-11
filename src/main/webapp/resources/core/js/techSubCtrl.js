 angular.module("MyApp")
        .controller("subCtrl", function($scope, $http, $interval) {


            $scope.sub = false;

            $scope.toggleIcon = function(){

                $scope.sub = !$scope.sub;

            }


        } );

