 angular.module("MyApp")
        .controller("subCtrl", function($scope, $interval) {

        	$scope.temp = [];

        	$scope.currentView = false;

        	$scope.months = ['JAN','FEB','MAR','APR','MAY','JUN','JUL','AUG','SEP','OCT','NOV','DEC'];

            $scope.firstWeek = 32;

            $scope.currentWeeks = [];

            $scope.weekDays = ['Sat', 'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri'];

            $scope.monthTitles = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];

            Date.prototype.getWeek = function() {
                var onejan = new Date(this.getFullYear(),0,1);
                return Math.ceil((((this - onejan) / 86400000) + onejan.getDay()+1)/7);
            }


            $scope.changeView = function(){

            	$scope.currentView = !$scope.currentView;

            }

           
            //returns the size of the month
            $scope.returnMonthSize = function(month){

                        var myDate = new Date();
                        //sets the month of the date to the next one
                        myDate.setMonth(month +1);
                        //returns the last day of the previous month.
                        myDate.setDate(0);
                        //checks the number if the day.
                        var size = myDate.getDate();
                        return size;

            }
           
            $scope.getWeekNumber = function(date) {
                // Copy date so don't modify original
                var d = date;
                d.setHours(0,0,0);
                // Set to nearest Thursday: current date + 4 - current day number
                // Make Sunday's day number 7
                d.setDate(d.getDate() + 4 - (d.getDay()||7));
                // Get first day of year
                var yearStart = new Date(d.getFullYear(),0,1);
                // Calculate full weeks to nearest Thursday
                var weekNo = Math.ceil(( ( (d - yearStart) / 86400000) + 1)/7);
                // Return array of year and week number
                return weekNo;
            }

            var viewLastElem = function(myArr){

                        var size = myArr.length -1;
                        var temp = myArr[size];
                        return temp;
            }

            $scope.currentMonth = function(month){

                var size = $scope.returnMonthSize(month);
                var myArr = [];
                var myDate = new Date();
                myDate.setMonth(month);
                myDate.setDate(0);
                myDate.setFullYear(2015);

                //array storing all the weeks in the current month
                $scope.currentWeeks = [];
                var currentWeek = myDate.getWeek();
                $scope.currentWeeks.push(currentWeek);

                //need to reset the month as previously erased it.
                myDate.setMonth(month);

                for(var i=1; i<size; i++){


                    myDate.setDate(i);

                    var dateObj = {};
                    dateObj["date"] = myDate.getDate();
                    dateObj["day"] = myDate.getDay();
                    dateObj["week"] = myDate.getWeek();
                    dateObj["month"] = myDate.getMonth();
                    dateObj["year"] = myDate.getFullYear();
                   
                    myArr[i-1] = dateObj;

                    console.log(myDate.toDateString());

                    //gets the value of the last week pushed to array
                    var lastWeek = viewLastElem($scope.currentWeeks);
                    //if onto a new week, push this week to the array
                    if(dateObj["week"] != lastWeek){
                                $scope.currentWeeks.push(dateObj["week"]);
                    }

                }

                    return myArr;
            }

            // $scope.changeMonth = function(month){

            // 	$scope.temp = $scope.currentMonth(month);

            // }

            $scope.temp = $scope.currentMonth(7);
            // $scope.populateTemp = function(){

            // 	for(var i = 0; i< 12; i++){

            // 		$scope.temp[i] = $scope.currentMonth(i);

            // 	}

            // }

            //$scope.populateTemp();

        } );

