var app = angular.module("geektic", ['ngRoute']);

app.config(function($routeProvider) {
    $routeProvider.when('/',{
        templateUrl: 'views/main.html'
    })
    .when('/geeks',{
        templateUrl: 'views/geeks.html',
        controller: 'GeeksCtrl'
    })
    .when('/geek/:idGeek',{
        templateUrl: 'views/geek.html',
        controller: 'GeekCtrl'
    })
	.when('/search', {
		templateUrl: 'views/search.html',
		controller: 'SearchCtrl'
    });
});

app.controller('GeeksCtrl', function($scope, $http) {
    $http.get('http://localhost:8080/geek/list').success(function(data, status, headers, config) {
        $scope.geeks = data;
    });
});

app.controller('GeekCtrl', function($scope, $http, $routeParams) {
    $http.get('http://localhost:8080/geek/' + $routeParams.idGeek).success(function(data, status, headers, config) {
    	$scope.geek = data;
    });
});
app.controller('SearchCtrl', function($scope, $http) {
    $http.get('http://localhost:8080/centre-interet/list').success(function(data, status, headers, config) {
    	$scope.centresInterets = data;
    });
    $scope.search = function() {
        $http.get('http://localhost:8080/geek/' + $scope.sexe + '/' + $scope.leCentreInteret).success(function(data, status, headers, config) {
            $scope.geeks = data;
        });
    };
});

