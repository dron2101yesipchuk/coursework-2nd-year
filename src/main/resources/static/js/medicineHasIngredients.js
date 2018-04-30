var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){
    /******************************MedicinesHasIngredientsCRUD*************************/
    $scope.medicinesHasIngredients = [];
    $http.get('/api/medicine/has_ingredients').then(function (response){
        $scope.medicinesHasIngredients = response.data;
        console.log(response);
    });

    this.del_medicine_has_ingredients = function del(id) {
        $http.get('/api/medicine/has_ingredients/del?id=' + id).then(function (response) {
            window.location.reload();
        });
    };
});