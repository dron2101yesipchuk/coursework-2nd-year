var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){

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
});