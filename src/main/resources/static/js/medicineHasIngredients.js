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

    this.start_insert_medicine_has_ingredients = function add() {

        $http.get('/api/medicine').then(function (response){
            var medicines = response.data;
            var selector = document.getElementById("medicineId");
            $(selector).empty();
            for (var i = 0; i < medicines.length; i++) {
                var option = document.createElement("option");
                option.text = medicines[i].nameOfMedicine;
                option.value = medicines[i].id;
                console.log(option);
                selector.add(option);
            }


            $http.get('/api/ingredients').then(function (response){
                var ingredients = response.data;
                var selector = document.getElementById("ingredientId");
                $(selector).empty();
                for (var i = 0; i < ingredients.length; i++) {
                    var option = document.createElement("option");
                    option.text = ingredients[i].name;
                    option.value = ingredients[i].id;
                    console.log(option);
                    selector.add(option);
                }
            });
        });
    };

    this.insert_medicine_has_ingredients = function add() {
        var id = document.getElementById("id").value;
        var indexOfMedicine = document.getElementById("medicineId").selectedIndex;
        var medicine_id = document.getElementById("medicineId").options[indexOfMedicine].value;
        var indexOfIngredient = document.getElementById("ingredientId").selectedIndex;
        var ingredient_id = document.getElementById("ingredientId").options[indexOfIngredient].value;
        var ingredientAmount = document.getElementById("ingredientAmount").value;


        $http.get('/api/medicine/has_ingredients/add?id='+id+'&med_id='+medicine_id+'&ingredients_id='
            +ingredient_id+'&ingredientsAmount='+ingredientAmount).then(function (response){
            window.location.reload();
        });
    };

    var idMedicineHasIngredients;
    this.start_update_medicine_has_ingredients = function updt(id, amountOfIngredients) {
        idMedicineHasIngredients = id;
        document.getElementById("ingredientAmountUPD").value = amountOfIngredients;

        $http.get('/api/medicine').then(function (response){
            var medicines = response.data;
            var selector = document.getElementById("medicineIdUPD");
            $(selector).empty();
            for (var i = 0; i < medicines.length; i++) {
                var option = document.createElement("option");
                option.text = medicines[i].nameOfMedicine;
                option.value = medicines[i].id;
                console.log(option);
                selector.add(option);
            }


            $http.get('/api/ingredients').then(function (response){
                var ingredients = response.data;
                var selector = document.getElementById("ingredientIdUPD");
                $(selector).empty();
                for (var i = 0; i < ingredients.length; i++) {
                    var option = document.createElement("option");
                    option.text = ingredients[i].name;
                    option.value = ingredients[i].id;
                    console.log(option);
                    selector.add(option);
                }
            });
        });
    };

    this.update_medicine_has_ingredients = function add() {
        var indexOfMedicine = document.getElementById("medicineIdUPD").selectedIndex;
        var medicine_id = document.getElementById("medicineIdUPD").options[indexOfMedicine].value;
        var indexOfIngredient = document.getElementById("ingredientIdUPD").selectedIndex;
        var ingredient_id = document.getElementById("ingredientIdUPD").options[indexOfIngredient].value;
        var ingredientAmount = document.getElementById("ingredientAmountUPD").value;


        $http.get('/api/medicine/has_ingredients/upd?id='+idMedicineHasIngredients
            +'&med_id='+medicine_id+'&ingredients_id=' +ingredient_id+'&ingredientsAmount='
            +ingredientAmount).then(function (response){
            window.location.reload();
        });
    };


});