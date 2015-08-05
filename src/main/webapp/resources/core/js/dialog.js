

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

                    var title = $(".add-tech-title")[0].value;
                    var desc = $(".add-tech-desc")[0].value;

                    var obj = $.parseJSON('{ "title" : '+title+', "desc" : '+desc+' }');
                    $.ajax({
                        type: "POST",
                        url: "boris/articles",
                        data: obj,
                        success: success,

                    }).done(function(){
                        alert("done");
                    })
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


