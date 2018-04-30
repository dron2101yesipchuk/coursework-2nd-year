var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){
    /******************************TypeOfMedicineCRUD*************************/
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
});