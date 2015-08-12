angular.module('MyApp')
.controller('NotificationCtrl', function DemoCtrl($scope,$mdDialog) {
    var originatorEv;

    this.openMenu = function($mdOpenMenu, ev) {
      originatorEv = ev;
      $mdOpenMenu(ev);
    };

    this.notificationsEnabled = true;
    this.toggleNotifications = function() {
      this.notificationsEnabled = !this.notificationsEnabled;
    };

    this.redial = function() {
      $mdDialog.show(
        $mdDialog.alert()
          .targetEvent(originatorEv)
          .clickOutsideToClose(true)
          .parent('body')
          .title('Suddenly, a redial')
          .content('You just called a friend; who told you the most amazing story. Have a cookie!')
          .ok('That was easy')
      );




      originatorEv = null;
    };

    this.checkVoicemail = function() {
      // This never happens.
    };
  });

angular.module('MyApp')

    .controller('accountSetControl', function($scope, $mdDialog) {
        $scope.alert = '';

        $scope.showAdvanced = function(ev) {
            $mdDialog.show({
                controller: DialogController,
                templateUrl: 'dialog1.tmpl.html',
                parent: angular.element(document.body),
                targetEvent: ev,
            })
                .then(function(answer) {
                    $scope.alert = 'You said the information was "' + answer + '".';
                }, function() {
                    $scope.alert = 'You cancelled the dialog.';
                });
        };
    });

    angular.module('MyApp')

    .controller('godControl', function($scope, $mdDialog) {
        $scope.alert = '';

        $scope.showGod = function(ev) {
            $mdDialog.show({
                controller: DialogController,
                templateUrl: 'dialog.tmpl.html',
                parent: angular.element(document.body),
                targetEvent: ev,
            })
                .then(function(answer) {
                    $scope.alert = 'You said the information was "' + answer + '".';
                }, function() {
                    $scope.alert = 'You cancelled the dialog.';
                });
        };

        $scope.god = [{
      division: 'Technology Helpdesk',
      team: 'Client Side Helpdesk',
      technologies: " AngularJs, Cassandra, Docker, Spark, Mesos, Hadoop, Rest, Hazelcast, Node.js, Solr"
    },
    {
      division: 'Technology Helpdesk',
      team: 'In House Helpdesk',
      technologies: " AngularJs, Cassandra, Docker, Spark, Mesos, Hadoop, Rest, Hazelcast, Node.js, Solr"
    },
    
    {
      division: 'Technology Helpdesk',
      team: 'Batch Job Support',
      technologies: " AngularJs, Cassandra, Docker, Spark, Mesos, Hadoop, Rest, Hazelcast, Node.js, Solr"
    },
    
    {
      division: 'Technology Helpdesk',
      team: 'Web Support',
      technologies: " AngularJs, Cassandra, Docker, Spark, Mesos, Hadoop, Rest, Hazelcast, Node.js, Solr"
    },
    
    {
      division: 'Tools Developers',
      team: 'Documentation Tools',
      technologies: " AngularJs, Cassandra, Docker, Spark, Mesos, Hadoop, Rest, Hazelcast, Node.js, Solr"
    }];

    });


angular.module('MyApp')

    .controller('addArticleControl', function($scope, $mdDialog) {
        $scope.alert = '';

        $scope.showAdvanced = function(ev) {
            var title
            $mdDialog.show({
                controller: DialogController,
                templateUrl: 'dialog2.tmpl.html',
                parent: angular.element(document.body),
                targetEvent: ev,
            })
                .then(function(answer) {
                    $scope.alert = 'You said the information was "' + answer + '".';


                }, function() {
                    $scope.alert = 'You cancelled the dialog.';
                });
        };
    });

function DialogController($scope, $mdDialog) {
    $scope.hide = function() {
        $mdDialog.hide();
    };

    $scope.cancel = function() {
        $mdDialog.cancel();
    };

    $scope.answer = function(answer) {
        $mdDialog.hide(answer);
        if (answer == "useful") {
            var title = $(".add-tech-title")[0].value;
            var desc = $(".add-tech-desc")[0].value;

            var obj = '{ "title" : "'+title+'", "description" : "'+desc+'" }';
            $.ajax({
                type: "POST",
                contentType: "application/json",
                url: "technologies",
                data: obj
            }).done(function(){

            })
        }

    };
}



angular.module('MyApp')

    .controller('addCalendarControl', function($scope, $mdDialog) {
        $scope.alert = '';

        $scope.showAdvanced = function(ev) {
            $mdDialog.show({
                controller: DialogController,
                templateUrl: 'dialog3.tmpl.html',
                parent: angular.element(document.body),
                targetEvent: ev,
            })
                .then(function(answer) {
                    $scope.alert = 'You said the information was "' + answer + '".';
                }, function() {
                    $scope.alert = 'You cancelled the dialog.';
                });
        };

        $scope.addEvent = function(ev) {
            $mdDialog.show({
                controller: DialogController,
                templateUrl: 'dialog9.tmpl.html',
                parent: angular.element(document.body),
                targetEvent: ev,
            })
                .then(function(answer) {
                    $scope.alert = 'You said the information was "' + answer + '".';
                }, function() {
                    $scope.alert = 'You cancelled the dialog.';
                });
        };


    });

angular.module('MyApp')

    .controller('teamControl', function($scope, $mdDialog) {
        $scope.alert = '';

        $scope.showMessage = function(ev) {
            $mdDialog.show({
                controller: DialogController,
                templateUrl: 'dialog5.tmpl.html',
                parent: angular.element(document.body),
                targetEvent: ev,
            })
                .then(function(answer) {
                    $scope.alert = 'You said the information was "' + answer + '".';
                }, function() {
                    $scope.alert = 'You cancelled the dialog.';
                });
        };


        $scope.showAdd = function(ev) {
            $mdDialog.show({
                controller: DialogController,
                templateUrl: 'dialog6.tmpl.html',
                parent: angular.element(document.body),
                targetEvent: ev,
            })
                .then(function(answer) {
                    $scope.alert = 'You said the information was "' + answer + '".';
                }, function() {
                    $scope.alert = 'You cancelled the dialog.';
                });
        };

        $scope.showDesc = function(ev) {
            $mdDialog.show({
                controller: DialogController,
                templateUrl: 'dialog7.tmpl.html',
                parent: angular.element(document.body),
                targetEvent: ev,
            })
                .then(function(answer) {
                    $scope.alert = 'You said the information was "' + answer + '".';
                }, function() {
                    $scope.alert = 'You cancelled the dialog.';
                });
        };

        $scope.showInfo = function(ev) {
            $mdDialog.show({
                controller: DialogController,
                templateUrl: 'dialog8.tmpl.html',
                parent: angular.element(document.body),
                targetEvent: ev,
            })
                .then(function(answer) {
                    $scope.alert = 'You said the information was "' + answer + '".';
                }, function() {
                    $scope.alert = 'You cancelled the dialog.';
                });
        };


    });

angular.module('MyApp')

    .controller('teamAddControl', function($scope, $mdDialog) {
        $scope.alert = '';



    });

angular.module('MyApp')

    .controller('addNewArticleControl', function($scope, $mdDialog) {
        $scope.alert = '';

        //$scope.showAlert = function(ev) {
        //    // Appending dialog to document.body to cover sidenav in docs app
        //    // Modal dialogs should fully cover application
        //    // to prevent interaction outside of dialog
        //    $mdDialog.show(
        //        $mdDialog.alert()
        //            .parent(angular.element(document.body))
        //            .title('This is an alert title')
        //            .content('You can specify some description text in here.')
        //            .ariaLabel('Alert Dialog Demo')
        //            .ok('Got it!')
        //            .targetEvent(ev)
        //    );
        //};
        //
        //$scope.showConfirm = function(ev) {
        //    // Appending dialog to document.body to cover sidenav in docs app
        //    var confirm = $mdDialog.confirm()
        //        .parent(angular.element(document.body))
        //        .title('Would you like to delete your debt?')
        //        .content('All of the banks have agreed to forgive you your debts.')
        //        .ariaLabel('Lucky day')
        //        .ok('Please do it!')
        //        .cancel('Sounds like a scam')
        //        .targetEvent(ev);
        //
        //    $mdDialog.show(confirm).then(function() {
        //        $scope.alert = 'You decided to get rid of your debt.';
        //    }, function() {
        //        $scope.alert = 'You decided to keep your debt.';
        //    });
        //};

        $scope.showAdvanced = function(ev) {
            $mdDialog.show({
                controller: DialogController,
                templateUrl: 'dialog4.tmpl.html',
                parent: angular.element(document.body),
                targetEvent: ev,
            })
                .then(function(answer) {
                    $scope.alert = 'You said the information was "' + answer + '".';
                }, function() {
                    $scope.alert = 'You cancelled the dialog.';
                });
        };
    });

function DialogController($scope, $mdDialog) {
    $scope.hide = function() {
        $mdDialog.hide();
    };

    $scope.cancel = function() {
        $mdDialog.cancel();
    };

    $scope.answer = function(answer) {
        $mdDialog.hide(answer);
    };
}


