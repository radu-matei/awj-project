var app = angular.module('angular-app', []);

app.controller('HomeController', ['$scope', '$http', function($scope, $http, $uibModal) {
  $scope.title = 'AWJ';
  $scope.subtitle = "Developing Java based web applications";
}]);


app.controller('ProductsController', ['$scope', '$http', function($scope, $http) {
    

    $scope.id;
    $scope.name;
    $scope.category;
    $scope.stock;
    $scope.price;
    
    $scope.updateId;
    $scope.updateName;
    $scope.updateCategory;
    $scope.updateStock;
    $scope.updatePrice;
    
    $http.get("http://localhost:8080/products").then(function(response){
     $scope.products = response.data;
  });
  
  $scope.removeProduct = function(id){
    $http.delete("http://localhost:8080/products/delete/" + id).then(function(response){
        
        if(response.status != 200)
            alert("Failed to delete product!");
            
        $("#product" + id).remove();
    });  
  };
  
  $scope.addProduct = function(){
        $scope.productForm = {
          id: $scope.id,
          name: $scope.name,
          category: $scope.category,
          stock: $scope.stock,
          price: $scope.price  
        };
        $http.post("http://localhost:8080/products/create", $scope.productForm);
    };
    
    $scope.updateProduct = function(){
        $scope.productForm = {
          id: $scope.updateId,
          name: $scope.updateName,
          category: $scope.updateCategory,
          stock: $scope.updateStock,
          price: $scope.updatePrice  
        };
        $http.put("http://localhost:8080/products/update", $scope.productForm);
    };
    
    $scope.getUpdateValues = function(product){
        $scope.updateId = product.id;
        $scope.updateName = product.name;
        $scope.updateCategory = product.category;
        $scope.updateStock = product.stock;
        $scope.updatePrice = product.price;
    }
}]);
