var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){

    /******************************BuyerCRUD*************************/
    $scope.buyers = [];
    $http.get('/api/buyers').then(function (response) {
        $scope.buyers = response.data;
        console.log(response);
    });

    this.del_buyer = function del(id) {
        $http.get('/api/buyers/del?id=' + id).then(function (response) {
            window.location.reload();
            //window.alert('Покупець "' + response.data.name + '" був успішно видалений!');
            //console.log(response);
        });
    };

    this.insert_buyer = function add() {
        var id = document.getElementById("buyerId").value;
        var pib = document.getElementById("buyerPIB").value;
        var age = document.getElementById("buyerAge").value;

        $http.get('/api/buyers/add?id='+id+'&PIB='+pib+'&age='+age).then(function (response){
            window.location.reload();
        });

    };

    /******************************BuyerHasMedicinesCRUD*************************/
    $scope.buyer_has_medicines = [];
    $http.get('/api/buyer_has_medicines').then(function (response){
        $scope.buyer_has_medicines = response.data;
        console.log(response);
    });

    this.del_buyer_has_medicines = function del(id) {
        $http.get('/api/buyer_has_medicines/del?id=' + id).then(function (response) {
            window.location.reload();
            //window.alert('Покупець "' + response.data.name + '" був успішно видалений!');
            //console.log(response);
        });
    };

    this.insertbuyer_has_medicines = function add() {
        var id = document.getElementById("buyerId").value;
        var pib = document.getElementById("buyerPIB").value;
        var age = document.getElementById("buyerAge").value;

        $http.get('/api/buyer_has_medicines/add?id='+id+'&PIB='+pib+'&age='+age).then(function (response){
            window.location.reload();
        });

    };

    /******************************DatesCRUD*************************/
    $scope.dates = [];
    $http.get('/api/dates').then(function (response){
        $scope.dates = response.data;
        console.log(response);
    });

    this.del_dates = function del(id) {
        $http.get('/api/dates/del?id=' + id).then(function (response) {
            window.location.reload();
            //window.alert('Покупець "' + response.data.name + '" був успішно видалений!');
            //console.log(response);
        });
    };

    /******************************GeneralTypesCRUD*************************/
    $scope.generalTypes = [];
    $http.get('/api/general_types').then(function (response){
        $scope.generalTypes = response.data;
        console.log(response);
    });

    this.del_general_types = function del(id) {
        $http.get('/api/general_types/del?id=' + id).then(function (response) {
            window.location.reload();
            //window.alert('Покупець "' + response.data.name + '" був успішно видалений!');
            //console.log(response);
        });
    };

    /******************************IngredientsCRUD*************************/
    $scope.ingredients = [];
    $http.get('/api/ingredients').then(function (response){
        $scope.ingredients = response.data;
        console.log(response);
    });

    this.del_ingredients = function del(id) {
        $http.get('/api/ingredients/del?id=' + id).then(function (response) {
            window.location.reload();
            //window.alert('Покупець "' + response.data.name + '" був успішно видалений!');
            //console.log(response);
        });
    };

    /******************************OrderStatusCRUD*************************/
    $scope.orderStatus = [];
    $http.get('/api/order_status').then(function (response){
        $scope.orderStatus = response.data;
        console.log(response);
    });

    this.del_order_status = function del(id) {
        $http.get('/api/order_status/del?id=' + id).then(function (response) {
            window.location.reload();
            //window.alert('Покупець "' + response.data.name + '" був успішно видалений!');
            //console.log(response);
        });
    };

    /******************************MedicinesCRUD*************************/
    $scope.medicines = [];
    $http.get('/api/medicine').then(function (response){
        $scope.medicines = response.data;
        console.log(response);
    });

    this.del_medicine = function del(id) {
        $http.get('/api/medicine/del?id=' + id).then(function (response) {
            window.location.reload();
            //window.alert('Покупець "' + response.data.name + '" був успішно видалений!');
            //console.log(response);
        });
    };

    /******************************MedicinesHasIngredientsCRUD*************************/
    $scope.medicinesHasIngredients = [];
    $http.get('/api/medicine/has_ingredients').then(function (response){
        $scope.medicinesHasIngredients = response.data;
        console.log(response);
    });

    this.del_medicine_has_ingredients = function del(id) {
        $http.get('/api/medicine/has_ingredients/del?id=' + id).then(function (response) {
            window.location.reload();
            //window.alert('Покупець "' + response.data.name + '" був успішно видалений!');
            //console.log(response);
        });
    };

    /******************************TypeOfMedicineCRODE*************************/
    $scope.typeOfMedicine = [];
    $http.get('/api/type/medicine').then(function (response){
        $scope.typeOfMedicine = response.data;
        console.log(response);
    });

    this.del_type_of_medicine = function del(id) {
        $http.get('/api/type/medicine/del?id=' + id).then(function (response) {
            window.location.reload();
            //window.alert('Покупець "' + response.data.name + '" був успішно видалений!');
            //console.log(response);
        });
    };

    /******************************TypeOfMedicineHasTypeOfUsingCRUD*************************/
    $scope.typeOfMedicineHasTypeOfUsing = [];
    $http.get('/api/type_medicine_has_type_using').then(function (response){
        $scope.typeOfProductionHasTypeOfUsing = response.data;
        console.log(response);
    });

    this.del_type_of_medicine_has_type_of_using = function del(id) {
        $http.get('/api/type_medicine_has_type_using/del?id=' + id).then(function (response) {
            window.location.reload();
            //window.alert('Покупець "' + response.data.name + '" був успішно видалений!');
            //console.log(response);
        });
    };

    /******************************TypeOfProductionCRUD*************************/
    $scope.typeOfProduction = [];
    $http.get('/api/type/production').then(function (response){
        $scope.typeOfProduction = response.data;
        console.log(response);
    });

    this.del_type_of_production = function del(id) {
        $http.get('/api/type/production/del?id=' + id).then(function (response) {
            window.location.reload();
            //window.alert('Покупець "' + response.data.name + '" був успішно видалений!');
            //console.log(response);
        });
    };

    /******************************TypeOfUsingCRUD*************************/
    $scope.typeOfUsing = [];
    $http.get('/api/type/using').then(function (response){
        $scope.typeOfUsing = response.data;
        console.log(response);
    });

    this.del_type_of_using = function del(id) {
        $http.get('/api/type/using/del?id=' + id).then(function (response) {
            window.location.reload();
            //window.alert('Покупець "' + response.data.name + '" був успішно видалений!');
            //console.log(response);
        });
    };

});