var app = angular.module('blog', [ ]);

app.controller('HomeController', ['$scope', '$http', function($scope, $http) {
  $scope.title = 'AWJ';
  $scope.subtitle = "Developing Java based web applications";
}]);


app.controller('ProductsController', ['$scope', '$http', function($scope, $http) {
    $http.get("http://localhost:8080/products").then(function(response){
     $scope.products = response.data;
  });
}]);
