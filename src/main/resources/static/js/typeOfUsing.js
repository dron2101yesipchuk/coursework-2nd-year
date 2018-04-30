var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){

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