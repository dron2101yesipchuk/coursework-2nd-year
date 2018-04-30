var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){

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
});