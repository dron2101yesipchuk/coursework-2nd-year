var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){

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
});