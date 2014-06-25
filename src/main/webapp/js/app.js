var app = angular.module("geektic", ['ngRoute']);

app.config(function($routeProvider) {
    $routeProvider.when('/',{
        templateUrl: 'views/main.html'
    })
    .when('/geeks',{
        templateUrl: 'views/geeks.html',
        controller: 'GeeksCtrl'
    })
    .when('/search',{
        templateUrl: 'views/search.html',
        controller: 'SearchCtrl'
    })
});

app.controller('GeeksCtrl', function($scope, $http) {
    $http.get('/geek/list')success(function(data, status, headers, config) {
        $scope.geeks = data;
    });
});

app.controller('GeekCtrl', function($scope, $http) {
	var url = Routing.generate('details', {id: $route.current.params.id});
    $http.get('/geek/')success(function(data, status, headers, config) {
    	$scope.geeks = data;
    });
});

app.controller('SearchCtrl', function($scope, $http) {
	var url = Routing.generate('details', {id: $route.current.params.id});
    $http.get('/geek/')success(function(data, status, headers, config) {
    	$scope.geeks = data;
    });
});

