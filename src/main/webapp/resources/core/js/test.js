 angular.module("MyApp")
        .controller("AJAXCtrl", function($scope, $http, $interval) {
            $scope.myData = {};


            $scope.subFilterBool = false;
            $scope.subFilterString = '';


            $scope.subFilter = function(){
                if($scope.subFilterBool == false){
                    $scope.subFilterString = '| filter:{subscribed:false}';
                    $scope.subFilterBool = !$scope.subFilterBool;
                }
                else{
                    $scope.subFilterString = '';
                    $scope.subFilterBool = !$scope.subFilterBool;
                }



            }    

            $scope.sub = function(j){

                $scope.myData[j].subscribed = !$scope.myData[j].subscribed;

            }

            $http.get("technologies/trending").success(function(data, status, headers, config) {
                    $scope.myData = data;
                    $scope.myData[0].subscribed = true;
                    for (var j = 1; j < $scope.myData.length; j++){
                      $scope.myData[j].subscribed = !$scope.myData[j-1].subscribed;

                      console.log($scope.myData[j].title);
                      
                      console.log($scope.myData[j].subscribed);
                    }
                    
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

