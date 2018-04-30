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
});