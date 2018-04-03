var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){

    $scope.buyers = [];
    $http.get('/api/buyers').then(function (response){
        $scope.buyers = response.data;
        console.log(response);
    });

    $scope.buyer_has_medicines = [];
    $http.get('/api/buyer_has_medicines').then(function (response){
        $scope.buyer_has_medicines = response.data;
        console.log(response);
    });

    $scope.dates = [];
    $http.get('/api/dates').then(function (response){
        $scope.dates = response.data;
        console.log(response);
    });

    $scope.generalTypes = [];
    $http.get('/api/general_types').then(function (response){
        $scope.generalTypes = response.data;
        console.log(response);
    });

    $scope.ingredients = [];
    $http.get('/api/ingredients').then(function (response){
        $scope.ingredients = response.data;
        console.log(response);
    });

    $scope.orderStatus = [];
    $http.get('/api/order_status').then(function (response){
        $scope.orderStatus = response.data;
        console.log(response);
    });

    $scope.medicines = [];
    $http.get('/api/medicine').then(function (response){
        $scope.medicines = response.data;
        console.log(response);
    });

    $scope.medicinesHasIngredients = [];
    $http.get('/api/medicine/has_ingredients').then(function (response){
        $scope.medicinesHasIngredients = response.data;
        console.log(response);
    });

    $scope.typeOfMedicine = [];
    $http.get('/api/type/medicine').then(function (response){
        $scope.typeOfMedicine = response.data;
        console.log(response);
    });

    $scope.typeOfProductionHasTypeOfUsing = [];
    $http.get('/api/type_production_has_type_using').then(function (response){
        $scope.typeOfProductionHasTypeOfUsing = response.data;
        console.log(response);
    });

    $scope.typeOfProduction = [];
    $http.get('/api/type/production').then(function (response){
        $scope.typeOfProduction = response.data;
        console.log(response);
    });

    $scope.typeOfUsing = [];
    $http.get('/api/type/using').then(function (response){
        $scope.typeOfUsing = response.data;
        console.log(response);
    });


});