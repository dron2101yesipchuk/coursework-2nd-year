var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){
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
});