angular
    .module('MyApp')
    .controller('DemoCtrl', function($scope) {
        $scope.article = {
            title: 'Developer',
            email: 'ipsum@lorem.com',
            firstName: '',
            lastName: '' ,
            company: 'Google' ,
            address: '1600 Amphitheatre Pkwy' ,
            city: 'Mountain View' ,
            state: 'CA' ,
            postalCode : '94043'
        };
    })
    .config( function($mdThemingProvider){

        // Configure a dark theme with primary foreground yellow

        $mdThemingProvider.theme('docs-dark', 'default')
            .primaryPalette('yellow')
            .dark();

    });
