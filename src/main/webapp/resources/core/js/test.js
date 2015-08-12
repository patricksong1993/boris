 angular.module("MyApp")
        .controller("AJAXCtrl", function($scope, $http, $interval) {
            $scope.myData = {};


            $scope.subFilterTracker = false;
            $scope.subFilter = '';  

            $scope.sub = function(j){

                if($scope.myData[j].subscribed == 'false'){

                    $scope.myData[j].subscribed = 'true';
                    console.log($scope.myData[j].title +" "+ $scope.myData[j].subscribed);
                    console.log('Filter: '+$scope.subFilter);
                }
                else{
                    $scope.myData[j].subscribed = 'false';
                    console.log($scope.myData[j].title +" "+ $scope.myData[j].subscribed);

                }
            
            }

            $scope.filterTrending = function(){

                if($scope.subFilterTracker == false){
                    $scope.subFilter = 'true';
                    $scope.subFilterTracker = true;
                    console.log('Debug1: subFilter: '+$scope.subFilter+"Tracker: "+ $scope.subFilterTracker);

                }
                else if ($scope.subFilterTracker == true){
                    $scope.subFilter = '';
                    $scope.subFilterTracker = false;
                    console.log('Debug2: subFilter: '+$scope.subFilter+"Tracker: "+ $scope.subFilterTracker);
                }

            }


            $http.get("technologies/trending").success(function(data, status, headers, config) {
                    $scope.myData = data;
                    for (var j = 0; j < $scope.myData.length; j++){
                      $scope.myData[j].subscribed = 'false';
                      console.log($scope.myData[j].title);
                    }
                    //console.log($scope.myData);
                    
                }).error(function(data, status, headers, config) {
                    alert("AJAX failed!");
                });


            $scope.getTrend = function(item, event) {

                var responsePromise = $http.get("technologies/trending");

                responsePromise.success(function(data, status, headers, config) {
                    $scope.myData = data;
                });
                responsePromise.error(function(data, status, headers, config) {
                    alert("AJAX failed!");
                });
            }


            // $interval($scope.getTrend, 2000);


        } );

