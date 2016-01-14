var app = angular.module('blog', [ ]);

app.controller('HomeController', ['$scope', function($scope) {
  $scope.helloWorld = 'Hello, Universe!';

}]);
