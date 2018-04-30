var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){
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
});