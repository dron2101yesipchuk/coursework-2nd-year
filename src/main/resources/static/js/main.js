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
        });
    };

    this.start_insert_buyer_has_medicines = function add() {

        $http.get('/api/buyers').then(function (response){
            var buyers = response.data;
            var selector = document.getElementById("BuyerID");
            $(selector).empty();
            for (var i = 0; i < buyers.length; i++) {
                var option = document.createElement("option");
                option.text = buyers[i].pib;
                option.value = buyers[i].id;
                console.log(option);
                selector.add(option);
            }


            $http.get('/api/medicine').then(function (response){
                var medicines = response.data;
                var selector = document.getElementById("MedicineID");
                $(selector).empty();
                for (var i = 0; i < medicines.length; i++) {
                    var option = document.createElement("option");
                    option.text = medicines[i].nameOfMedicine;
                    option.value = medicines[i].id;
                    console.log(option);
                    selector.add(option);
                }


                $http.get('/api/dates').then(function (response){
                    var dates = response.data;
                    var selector = document.getElementById("DateID");
                    $(selector).empty();
                    for (var i = 0; i < dates.length; i++) {
                        var option = document.createElement("option");
                        option.text = dates[i].dateOfOrdering + "; " + dates[i].dateOfReceiving + "; "
                            + dates[i].orderStatus.nameOfStatus;
                        option.value = dates[i].id;
                        console.log(option);
                        selector.add(option);
                    }
                });
            });
        });
    };

    this.insert_buyer_has_medicines = function add() {
        var id = document.getElementById("id").value;
        var indexOfBuyer = document.getElementById("BuyerID").selectedIndex;
        var buyer_id = document.getElementById("BuyerID").options[indexOfBuyer].value;
        var indexOfMedicine = document.getElementById("MedicineID").selectedIndex;
        var medicine_id = document.getElementById("MedicineID").options[indexOfMedicine].value;
        var indexOfDates = document.getElementById("DateID").selectedIndex;
        var dates_id = document.getElementById("DateID").options[indexOfDates].value;
        var doctorPIB = document.getElementById("doctorPIB").value;
        var diagnosis = document.getElementById("diagnosis").value;
        var amount = document.getElementById("amountOfMedicine").value;


        $http.get('/api/buyer_has_medicines/add?id='+id+'&buyer_id='+buyer_id+'&medicine_id='
            +medicine_id+'&dates_id='+dates_id+'&doctorPIB='+doctorPIB+'&diagnosis='+diagnosis+
            '&amount='+amount).then(function (response){
            setTimeout(function(){
                window.location.reload();
            });
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
        });
    };

    this.insert_general_type = function add() {
        var id = document.getElementById("generalTypeId").value;
        var name = document.getElementById("generalTypeName").value;

        $http.get('/api/general_types/add?id='+id+'&generalType='+name).then(function (response){
            window.location.reload();
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
        });
    };

    this.insert_ingredients = function add() {
        var id = document.getElementById("ingredientsId").value;
        var name = document.getElementById("ingredientsName").value;
        var criticalRate = document.getElementById("ingredientsCriticalRate").value;
        var amount = document.getElementById("ingredientsAmount").value;
        var price = document.getElementById("ingredientsPrice").value;

        $http.get('/api/ingredients/add?id='+id+'&name='+name+'&criticalRate='+criticalRate+
        '&amount='+amount+'&price='+price).then(function (response){
            window.location.reload();
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
        });
    };

    this.insert_order_status = function add() {
        var id = document.getElementById("orderStatusId").value;
        var name = document.getElementById("orderStatusName").value;

        $http.get('/api/order_status/add?id='+id+'&nameOfStatus='+name).then(function (response){
            window.location.reload();
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
        });
    };

    this.insert_type_of_production = function add() {
        var id = document.getElementById("typeOfProductionID").value;
        var name = document.getElementById("typeOfProductionName").value;

        $http.get('/api/type/production/add?id='+id+'&nameOfType='+name).then(function (response){
            window.location.reload();
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
        });
    };

    this.insert_type_of_using = function add() {
        var id = document.getElementById("typeOfUsingID").value;
        var name = document.getElementById("typeOfUsingName").value;

        $http.get('/api/type/using/add?id='+id+'&nameOfType='+name).then(function (response){
            window.location.reload();
        });
    };
});